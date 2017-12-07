package com.thron.intelligence.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MESubjectType") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MESubjectType {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("APPLICATION") APPLICATION,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("USER") USER,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("GROUP") GROUP,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ROLE") ROLE
}