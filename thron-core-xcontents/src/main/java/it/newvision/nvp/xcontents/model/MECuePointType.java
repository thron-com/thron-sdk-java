package it.newvision.nvp.xcontents.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MECuePointType") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MECuePointType {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("GENERIC") GENERIC,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("SUBTITLE") SUBTITLE,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CHAPTER") CHAPTER
}