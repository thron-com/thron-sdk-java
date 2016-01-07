package com.thron.intelligence.model.engine;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="METhresholdType") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum METhresholdType {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ABSOLUTE") ABSOLUTE,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PERCENTAGE") PERCENTAGE
}