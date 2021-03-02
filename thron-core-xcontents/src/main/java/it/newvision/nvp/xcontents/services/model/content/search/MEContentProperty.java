package it.newvision.nvp.xcontents.services.model.content.search;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEContentProperty") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEContentProperty {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("LINKABLE") LINKABLE,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("UNLINKABLE") UNLINKABLE,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("RATING_ALLOWED") RATING_ALLOWED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("RATING_DENIED") RATING_DENIED
}