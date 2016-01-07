package com.thron.intelligence.services.model.metadata;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEMetadataDefinition") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEMetadataDefinition {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OK") OK,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("METADATA_NOT_FOUND") METADATA_NOT_FOUND,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("METADATA_IN_TRASH") METADATA_IN_TRASH,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("KEY_ALREADY_DEFINED") KEY_ALREADY_DEFINED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("BAD_REQUEST") BAD_REQUEST,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("EXCEPTION") EXCEPTION
}