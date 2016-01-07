package com.thron.intelligence.services.model.classification;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEClassification") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEClassification {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OK") OK,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("BAD_REQUEST") BAD_REQUEST,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ID_ALREADY_DEFINED") ID_ALREADY_DEFINED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CLASSIFICATION_NOT_FOUND") CLASSIFICATION_NOT_FOUND,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("EXCEPTION") EXCEPTION,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("MAX_NUMBER_OF_ITEMS_REACHED") MAX_NUMBER_OF_ITEMS_REACHED
}