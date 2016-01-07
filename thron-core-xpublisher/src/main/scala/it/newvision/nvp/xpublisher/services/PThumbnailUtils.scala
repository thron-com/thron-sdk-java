package it.newvision.nvp.xpublisher.services

import java.util.List

import it.newvision.nvp.xpublisher.model.MThumbnail
import org.apache.commons.lang.StringUtils
import collection.JavaConversions._

object PThumbnailUtils {
  /**
   * Questa funzione estra la migliore thumbnails dalla lista che si possa adattare alla divArea specificata.
   * La ricerca di thubs compatibili con l'area 250x30 viene effettuata utilizzando il seguente algoritmo:
   * 1) tutte le thums vengono ordinate in modo crescente (perchè non specificato l) sulla base della larghezza.
   * 2) vengo filtrate tutte le thumbs aventi larghezza maggiore di quella specificata nella divArea (tutte quelle dentro all'area)
   * 3) le thumbs rimanenti vengono rifiltrate con tutte quelle aventi altezza maggiore di quella specificata nella divArea.
   * 4) viene ritornato il primo elemento della lista filtrata (ovvero l'elemento con area più grande).
   * Se width o height hanno valore 0 questo annulla i filtraggi quindi non c'è alcuna restrizione lungo quell asse.
   * @param thumbs  lista di thumbs su cui effettuare la ricerca.
   * @param divArea formati accettati <width>x<height>[u|l]
   *                esempio: 350x120, 120x0u, 0x150, 75x75u, 720xl
   *                u significa che viene preferito il primo elemento "più grande" (maggiore o uguale) dell'area selezionata (default)
   *                l significa che viene preferito il primo elemento più piccolo dell'area selezionata
   *
   * @return
   */
  def findBestThumbs(thumbs: List[MThumbnail], divArea: String): Option[MThumbnail] = {
    var ret: Option[MThumbnail] = None
    var area = StringUtils.defaultIfEmpty(divArea, "").toLowerCase
    if (StringUtils.isNotBlank(divArea) && StringUtils.contains(area, "x")) {
      //usato per indicare che nella selezione si preferisce il primo elemento esterno all'area piuttosto che quello contenuto nell'area
      val upper = StringUtils.endsWith(area, "u") || !StringUtils.endsWith(area,"l")
      area = StringUtils.removeEnd(area, "u")
      area = StringUtils.removeEnd(area, "l")
      if (StringUtils.endsWith(area, "x")) area = area + "0"
      if (StringUtils.startsWith(area, "x")) area = "0" + area
      val tks = StringUtils.split(area, "x")
      tks.toList match {
        case Nil => //nein
        case a :: Nil => //nein
        case width :: height :: Nil =>
          try {
            val w = if (width.toLong < 0L) 0L else width.toLong //(valori negativi non permessi e non hanno senso)
            val h = if (height.toLong < 0L) 0L else height.toLong
            val wh = w > h
            def neg(o: Boolean, b: Boolean): Boolean = if (o) !b else b
            def fsort(widthB: Boolean, up: Boolean = upper): (MThumbnail, MThumbnail) => Boolean = {
              if (widthB) {
                (t1: MThumbnail, t2: MThumbnail) =>
                  val t1Width = Option(t1.width).map(_.toLong).getOrElse(0L)
                  val t2Width = Option(t2.width).map(_.toLong).getOrElse(0L)
                  neg(up, t1Width >= t2Width)
              } else {
                (t1: MThumbnail, t2: MThumbnail) =>
                  val t1Height = Option(t1.height).map(_.toLong).getOrElse(0L)
                  val t2Height = Option(t2.height).map(_.toLong).getOrElse(0L)
                  neg(up, t1Height >= t2Height)
              }
            }
            def ffil(widthB: Boolean, up: Boolean = upper, w1: Long = w, h1: Long = h): MThumbnail => Boolean = {
              if (widthB) {
                (t1: MThumbnail) =>
                  val tWidth = Option(t1.width).map(_.toLong).getOrElse(0L)
                  neg(up, tWidth < w1) || w1 == 0L
              } else {
                (t1: MThumbnail) =>
                  val tHeight = Option(t1.height).map(_.toLong).getOrElse(0L)
                  neg(up, tHeight < h1) || h1 == 0L
              }
            }
            // "Fix" height-less thumbnails (see #13365)
            val imgDimensionR = """.*-(\d+)x(\d+)_.*""".r

            thumbs.foreach { thumb  =>
              if (Option(thumb.height).isEmpty && Option(thumb.width).nonEmpty) {
                // Height value is actually saved in width property value!
                thumb.setHeight(thumb.width)
                // Get actual width value from url
                val imgDimensionR(actualWidth, actualHeight) = thumb.url
                thumb.setWidth(actualWidth.toInt)
              }
            }

            val sortedThumbs = thumbs.sortWith(fsort(wh)(_, _))
            // Find the first one which fits the requirements
            // else use the best alternative
            ret = sortedThumbs.find(ffil(wh)(_))
              .orElse(sortedThumbs.lastOption)
          } catch {
            case e: Exception =>
              //log.warn("findBestThumbs exceptions... ", e)
          }
        case _ => //nein
      }
    }
    ret
  }


}
