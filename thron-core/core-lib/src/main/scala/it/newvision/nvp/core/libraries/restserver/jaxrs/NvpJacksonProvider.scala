package it.newvision.nvp.core.libraries.restserver.jaxrs

import org.codehaus.jackson.map.ObjectMapper
import javax.ws.rs.ext.ContextResolver
import org.codehaus.jackson.jaxrs.JacksonJsonProvider
import javax.ws.rs.ext.ContextResolver
import javax.ws.rs.ext.Provider
import scala.Predef._
import org.codehaus.jackson.jaxrs.JacksonJsonProvider

@Provider
class NvpJacksonProvider extends JacksonJsonProvider with ContextResolver[ObjectMapper] {

  override def getContext(a: Class[_]): ObjectMapper = NvpJacksonConfigurator.mapper


}
