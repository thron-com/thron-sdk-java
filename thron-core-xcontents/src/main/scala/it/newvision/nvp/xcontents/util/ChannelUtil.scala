package it.newvision.nvp.xcontents.util

import it.newvision.nvp.identity.model.MProperty
import it.newvision.nvp.xcontents.model.MEContentType
import scala.collection.JavaConversions._

trait ChannelUtil {

  /** for the given content returns the channel with best resolution */
  def getBestChannelForContent(availableChannels: List[String], contentType: MEContentType, clientProperties: MProperty): Option[String] = {
    contentType match {
      case MEContentType.VIDEO =>
        val ordered = clientProperties.streamProperties
          .filter(e => e.useForDownload && availableChannels.contains(e.channelType))
          .sortBy(_.totalBitRates.headOption.map(_.intValue()).getOrElse(0))
        val original = ordered.find(_.withIngestion == false).toList
        (ordered ++ original).map(_.channelType).lastOption
      case MEContentType.AUDIO =>
        val ordered = clientProperties.audioProperties
          .filter(e => e.useForDownload && availableChannels.contains(e.channelType))
          .sortBy(_.bitRate.intValue())
        val original = ordered.find(_.withIngestion == false).toList
        (ordered ++ original).map(_.channelType).lastOption
      case MEContentType.IMAGE =>
        val ordered = clientProperties.imageProperties
          .filter(e => e.useForDownload && availableChannels.contains(e.channelType))
        val original = ordered.find(_.withIngestion == false).toList
        (ordered ++ original).map(_.channelType).lastOption
      case MEContentType.PAGELET =>
        val ordered = clientProperties.pageletProperties
          .filter(e => e.useForDownload && availableChannels.contains(e.channelType))
        val original = ordered.find(_.withIngestion == false).toList
        (ordered ++ original).map(_.channelType).lastOption
      case MEContentType.URL =>
        val ordered = clientProperties.urlProperties
          .filter(e => e.useForDownload && availableChannels.contains(e.channelType))
        val original = ordered.find(_.withIngestion == false).toList
        (ordered ++ original).map(_.channelType).lastOption
      case _ =>
        val ordered = clientProperties.genericDocumentProperties
          .filter(e => e.useForDownload && availableChannels.contains(e.channelType))
        val original = ordered.find(_.withIngestion == false).toList
        (ordered ++ original).map(_.channelType).lastOption
    }
  }
}

object ChannelUtil extends ChannelUtil