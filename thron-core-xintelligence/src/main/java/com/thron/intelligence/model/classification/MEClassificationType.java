package com.thron.intelligence.model.classification;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEClassificationType") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEClassificationType {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("TARGET") TARGET,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("TOPIC") TOPIC,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CUSTOM") CUSTOM
}