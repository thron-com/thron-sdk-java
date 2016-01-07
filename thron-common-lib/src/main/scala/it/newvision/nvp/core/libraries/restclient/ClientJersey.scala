package it.newvision.nvp.core.libraries.restclient

import com.sun.jersey.api.client.Client
import com.sun.jersey.api.client.filter.GZIPContentEncodingFilter
import com.sun.jersey.api.client.filter.LoggingFilter
import util.Properties
import com.sun.jersey.api.client.config.{ClientConfig, DefaultClientConfig}
import it.newvision.nvp.core.libraries.restserver.jaxrs.client.NvpJacksonClient

object ClientJersey {

  private val client = newClient()

  // ENABLE DEBUG REQUEST
  if (Properties.propOrElse("4me-restclient-debug", "false").toBoolean) {
    client.addFilter(new LoggingFilter)
  }

  // ENABLE GZIP REQUEST MODE
  if (Properties.propOrElse("4me-restclient-gzipEncode", "false").toBoolean) {
    client.addFilter(new GZIPContentEncodingFilter)
  }

  def newClient(ConnectionTimeOut:Option[Int]=None) = {
    //#10750 fix serializzatore
    val cc = new DefaultClientConfig()
    cc.getClasses().add(classOf[NvpJacksonClient])
    val c = Client.create(cc)
    c.setFollowRedirects(true) // follow redirect
    ConnectionTimeOut match {
      case Some(t)=>
        c.setConnectTimeout(t) // define restClient connection timeout  to  10 seconds
        c.setReadTimeout(t) // define restClient connection timeout  to 10 seconds
      case None=>
        c.setConnectTimeout(Properties.propOrElse("4me-restclient-timeout", "180000").toInt) // define restClient connection timeout  to  15 seconds
        c.setReadTimeout(Properties.propOrElse("4me-restclient-readtimeout", "180000").toInt) // define restClient connection timeout  to 15 seconds
    }
    c
  }

  def getClient: Client = this.client

}
