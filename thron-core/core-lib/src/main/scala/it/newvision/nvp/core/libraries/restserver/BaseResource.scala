package it.newvision.nvp.core.libraries.restserver

import java.util.Locale
import javax.ws.rs.core._
import scala.collection.JavaConversions._
import org.apache.commons.lang.StringUtils


trait BaseResource {

  @Context
  implicit var headers: HttpHeaders = _


  /* @Context
   var uriInfo: UriInfo = _
   @Context
   var rc: Request = _
  */


  def _acceptType = headers.getAcceptableMediaTypes

  // Le classi J*resource possono fare l'override del metodo in modo tale da ridefinire il valore base del
  //defaultCacheControl control per i servizi get generati a partire dalle POST
  /*
      NOCACHE
      NOSTORE
      NOTRASFORM
     */
  protected val _getCacheControl: CacheControl = {
    val cc = new CacheControl
    cc.setNoCache(true)
    cc.setNoStore(true)
    cc.setNoTransform(true)
    cc
  }
  /*
    NOCACHE
    NOSTORE
    NOTRASFORM
   */
  protected val _postCacheControl: CacheControl = {
    val cc = new CacheControl
    cc.setNoCache(true)
    cc.setNoStore(true)
    cc.setNoTransform(true)
    cc
  }

  @Deprecated
  def getHeadersMap(filterHeader: Seq[String]): Option[Map[String, String]] = {
    Option(headers) match {
      case Some(h) =>
        var sg = h.getRequestHeaders.toMap
        if (!filterHeader.isEmpty) {
          sg = sg.filter { x => filterHeader.exists(y => StringUtils.equalsIgnoreCase(y, x._1)) }
        }
        Option(sg.map(i => (i._1, i._2.head)))
      case None => None
    }

  }

  def getHeadersMapIgnoreCase(filterHeader: Seq[String]): Option[Map[String, String]] = {
    Option(headers) match {
      case Some(h) =>
        var sg = h.getRequestHeaders.toMap
        if (!filterHeader.isEmpty) {
          sg = sg.filter { x => filterHeader.exists(y => StringUtils.equalsIgnoreCase(y, x._1)) }
        }
        Option(sg.map(i => (i._1.toLowerCase(Locale.ENGLISH), i._2.head)))
      case None => None
    }

  }


}