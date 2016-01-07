package com.thron.intelligence.services.model.context;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEContext") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEContext {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OK") OK,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("BAD_REQUEST") BAD_REQUEST,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ID_ALREADY_DEFINED") ID_ALREADY_DEFINED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CONTEXT_NOT_FOUND") CONTEXT_NOT_FOUND,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("EXCEPTION") EXCEPTION
}