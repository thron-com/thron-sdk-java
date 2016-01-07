package it.newvision.nvp.xadmin.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEAudioType") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEAudioType {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("MP3") MP3,
	/**
	 * The FLV conversion is required to support streaming and progressive download
	 * using a flash player.
	 */
	//#SWG#@ApiModelProperty(value = """The FLV conversion is required to support streaming and progressive download using a flash player.""")
	@XmlEnumValue("FLV") FLV,
	/**
	 * used for Http Streaming
	 */
	//#SWG#@ApiModelProperty(value = """used for Http Streaming""")
	@XmlEnumValue("AAC") AAC
}