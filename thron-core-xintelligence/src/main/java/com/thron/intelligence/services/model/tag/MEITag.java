package com.thron.intelligence.services.model.tag;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEITag") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEITag {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OK") OK,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ITAG_NOT_FOUND") ITAG_NOT_FOUND,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ITAG_ALREADY_DEFINED") ITAG_ALREADY_DEFINED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ITAG_NOT_APPROVED") ITAG_NOT_APPROVED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ITAG_REMOVED") ITAG_REMOVED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("BAD_REQUEST") BAD_REQUEST,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CLASSIFICATION_NOT_FOUND") CLASSIFICATION_NOT_FOUND,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("METADATA_DEFINITION_NOT_FOUND") METADATA_DEFINITION_NOT_FOUND,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("EXCEPTION") EXCEPTION,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ITAG_MAX_NUMBER_REACHED") ITAG_MAX_NUMBER_REACHED
}