package it.newvision.nvp.xadmin.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEAppType") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEAppType {
	/**
	 * Digital Signage
	 */
	//#SWG#@ApiModelProperty(value = """Digital Signage""")
	@XmlEnumValue("PLAY") PLAY,
	/**
	 * Sms
	 */
	//#SWG#@ApiModelProperty(value = """Sms""")
	@XmlEnumValue("MOVE") MOVE,
	/**
	 * custom apps and snippets
	 */
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("WEBTV") WEBTV,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("COMMENT") COMMENT,
	/**
	 * for custom apps with snippets
	 */
	//#SWG#@ApiModelProperty(value = """for custom apps with snippets""")
	@XmlEnumValue("CUSTOM") CUSTOM
}