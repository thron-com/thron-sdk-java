package it.newvision.nvp.xcontents.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEEmbedTargets") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEEmbedTargets {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("FACEBOOK") FACEBOOK,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("TWITTER") TWITTER,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("GENERIC") GENERIC,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("EMAIL") EMAIL,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("SMS") SMS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("LINK") LINK
}