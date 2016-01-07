package it.newvision.nvp.xpublisher.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * List available channels. NOT USED!
 * WEB
 * WEB(IPHONE)
 * WEB(MOBILE)
 * STREAM(WEB)
 * STREAM(IPHONE)
 * WEB and STREAM identify the real distribution channel used to deploy the
 * contents in CDN, the second part is only a label that allows the user to have
 * multiple "channels" in a single real channel.
 */
@XmlType(name="MEChannelType") 
@XmlEnum
//#SWG#@ApiModel(description = """List available channels. NOT USED!
//#SWGNL#WEB
//#SWGNL#WEB(IPHONE)
//#SWGNL#WEB(MOBILE)
//#SWGNL#STREAM(WEB)
//#SWGNL#STREAM(IPHONE)
//#SWGNL#WEB and STREAM identify the real distribution channel used to deploy the contents in CDN, the second part is only a label that allows the user to have multiple "channels" in a single real channel.""")
public enum MEChannelType {
	/**
	 * WEB
	 */
	//#SWG#@ApiModelProperty(value = """WEB""")
	@XmlEnumValue("WEB") WEB,
	/**
	 * Streaming video VOD
	 */
	//#SWG#@ApiModelProperty(value = """Streaming video VOD""")
	@XmlEnumValue("STREAM") STREAM,
	/**
	 * Streaming specific for IPhone
	 */
	//#SWG#@ApiModelProperty(value = """Streaming specific for IPhone""")
	@XmlEnumValue("IPHONE") IPHONE,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("STREAMWEB") STREAMWEB
}