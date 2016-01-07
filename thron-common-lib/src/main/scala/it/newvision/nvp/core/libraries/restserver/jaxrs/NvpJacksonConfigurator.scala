package it.newvision.nvp.core.libraries.restserver.jaxrs

import org.codehaus.jackson.map.{DeserializationConfig, SerializationConfig, ObjectMapper}
import java.text.SimpleDateFormat
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion

/**
 * Used to define the serialisazion of json with Jersey
 * add to the servlet in web.xml
       <init-param>
         <param-name>com.sun.jersey.config.property.packages</param-name>
         <param-value>
            ...;it.newvision.nvp.core.libraries.restserver.jaxrs
         </param-value>
       </init-param>

 */
object NvpJacksonConfigurator {

  private val df = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'" //iso8601
  val mapper: ObjectMapper = {
    val m = new ObjectMapper()
    //SERIALISATION CONFIG
    val sc = m.getSerializationConfig.withDateFormat(new SimpleDateFormat(df))
    sc.set(SerializationConfig.Feature.WRITE_DATES_AS_TIMESTAMPS, false)
    sc.setSerializationInclusion(Inclusion.NON_NULL)
    m.setSerializationConfig(sc)

    //DESERIALISATION CONFIG
    val dc = m.getDeserializationConfig
    dc.set(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false)
    dc.set(DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true)
    m.setDeserializationConfig(dc)

    m
  }

  val mapper4Client: ObjectMapper = {
    val m = new ObjectMapper()
    //SERIALISATION CONFIG
    val sc = m.getSerializationConfig().withDateFormat(new SimpleDateFormat(df))
    sc.set(SerializationConfig.Feature.WRITE_DATES_AS_TIMESTAMPS, false)
    sc.setSerializationInclusion(Inclusion.NON_NULL)
    m.setSerializationConfig(sc)

    //DESERIALISATION CONFIG NO FAIL ON DESERIALISATION.
    val dc = m.getDeserializationConfig
    dc.set(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false)
    dc.set(DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true)
    m.setDeserializationConfig(dc)

    m
 }

}






