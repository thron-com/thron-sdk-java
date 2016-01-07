package it.newvision.nvp.xpublisher.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEHostnameType") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEHostnameType {
	/**
	 * used for the ingest.
	 * default value is: http://clientId-hostid-in.4mecloud.it
	 */
	//#SWG#@ApiModelProperty(value = """used for the ingest. 
	//#SWGNL#default value is: http://clientId-hostid-in.4mecloud.it""")
	@XmlEnumValue("IN") IN,
	/**
	 * used for publishing.
	 * default value is: http://clientId-hostid-stream.4mecloud.it
	 */
	//#SWG#@ApiModelProperty(value = """used for publishing. 
	//#SWGNL#default value is: http://clientId-hostid-stream.4mecloud.it""")
	@XmlEnumValue("STREAM") STREAM,
	/**
	 * used for the preview stream.
	 * default value is: http://clientId-hostid-preview.4mecloud.it
	 */
	//#SWG#@ApiModelProperty(value = """used for the preview stream. 
	//#SWGNL#default value is: http://clientId-hostid-preview.4mecloud.it""")
	@XmlEnumValue("PREVIEW") PREVIEW,
	/**
	 * used for the real time http push.
	 * default value is: http://clientId-hostid-rt.4mecloud.it
	 */
	//#SWG#@ApiModelProperty(value = """used for the real time http push. 
	//#SWGNL#default value is: http://clientId-hostid-rt.4mecloud.it""")
	@XmlEnumValue("RT") RT,
	/**
	 * used for the web application.
	 * default value is: http://clientId-hostid-app.4mecloud.it
	 */
	//#SWG#@ApiModelProperty(value = """used for the web application. 
	//#SWGNL#default value is: http://clientId-hostid-app.4mecloud.it""")
	@XmlEnumValue("APP") APP
}