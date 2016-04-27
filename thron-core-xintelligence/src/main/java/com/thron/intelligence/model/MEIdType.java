package com.thron.intelligence.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEIdType") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEIdType {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ID") ID,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("EXTERNAL") EXTERNAL,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PRETTYID") PRETTYID
}