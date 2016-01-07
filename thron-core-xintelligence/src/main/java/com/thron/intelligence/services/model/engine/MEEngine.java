package com.thron.intelligence.services.model.engine;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEEngine") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEEngine {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OK") OK,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ENGINE_NOT_FOUND") ENGINE_NOT_FOUND,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("BAD_REQUEST") BAD_REQUEST,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CLASSIFICATION_NOT_FOUND") CLASSIFICATION_NOT_FOUND,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("EXCEPTION") EXCEPTION
}