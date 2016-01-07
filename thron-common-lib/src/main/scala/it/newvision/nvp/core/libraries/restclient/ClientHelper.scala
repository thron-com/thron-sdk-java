package it.newvision.nvp.core.libraries.restclient

import java.lang.{Boolean,IllegalArgumentException}

object ClientHelper {

  /*
  Per non importare librerie aggiuntive. Presa da Apache Common lang
   */
  private def isEmpty (str: String): Boolean = {
    (str == null || str.length == 0).booleanValue()
  }
  /**
   *
   * @param clientId  the serviceId used in 4mePlatform
   * @param component xsso,xcontents,xpackager,xadmin,xpublisher
   * @param httpsEnabled use https or not.
   * @return the REST resource URL to use with client rest services.
   * @throws IllegalArgumentException
   *         if the clientId,component and httpsEnabled are null
   */
  def get4MEresourceEndpoint(clientId: String, component: String, httpsEnabled: Boolean): String = {
    get4MEresourceEndpoint(clientId,"4me.it",component,httpsEnabled)
  }

  def get4MEresourceEndpoint(clientId: String, domain:String, component: String, httpsEnabled: Boolean): String = {
    if (isEmpty(clientId)) throw new IllegalArgumentException("clientId parameter is empty")
    if (isEmpty(component)) throw new IllegalArgumentException("component parameter is empty")
    if (httpsEnabled == null) throw new IllegalArgumentException("httpsEnabled parameter is null")
    val resource = component match {
      case "xsso" => "xsso/resources/"
      case "xpackager" => "xpackager/resources/"
      case "xcontents" => "xcontents/resources/"
      case "xadmin" => "xadmin/resources/"
      case "xpublisher" => "xpublisher/resources/"
      case _ => throw new IllegalArgumentException("component parameter must match values: [xsso,xpackager,xcontents,xadmin,xpublisher] ")
    }

    val protocol = if (httpsEnabled) "https://" else "http://"
    "%s%s-view.%s/api/%s".format(protocol, clientId, domain, resource)
  }

    /**
     *
     * @param clientId  the serviceId used in 4mePlatform
     * @param httpsEnabled use https or not.
     * @return the REST resource URL to use with client rest services.
     * @throws IllegalArgumentException
     *         if the clientId and httpsEnabled are null
     */
    def get4MEPLAYBOXresourceEndpoint(clientId: String, httpsEnabled: Boolean): String = {
      get4MEPLAYBOXresourceEndpoint(clientId,"4me.it",httpsEnabled)
    }
    def get4MEPLAYBOXresourceEndpoint(clientId: String, domain:String,httpsEnabled: Boolean): String = {
        if (isEmpty(clientId)) throw new IllegalArgumentException("clientId parameter is empty")
        if (httpsEnabled == null) throw new IllegalArgumentException("httpsEnabled parameter is null")
        val protocol = if (httpsEnabled) "https://" else "http://"
        "%s%s-play.%s/play/api/resources/".format(protocol, clientId, domain)
      }




}
