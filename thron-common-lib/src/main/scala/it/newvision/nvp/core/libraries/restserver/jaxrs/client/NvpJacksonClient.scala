package it.newvision.nvp.core.libraries.restserver.jaxrs.client

import org.codehaus.jackson.map.ObjectMapper
import javax.ws.rs.ext.ContextResolver
import org.codehaus.jackson.jaxrs.JacksonJsonProvider
import it.newvision.nvp.core.libraries.restserver.jaxrs.NvpJacksonConfigurator


class NvpJacksonClient extends JacksonJsonProvider with ContextResolver[ObjectMapper] {

  override def getContext(a: Class[_]): ObjectMapper = NvpJacksonConfigurator.mapper4Client

}
