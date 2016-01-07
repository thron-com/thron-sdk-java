package com.thron.intelligence.services.model.metadata;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEMetadataDefinitionOrderBy") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEMetadataDefinitionOrderBy {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("label_A") label_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("label_D") label_D,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("createdDate_A") createdDate_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("createdDate_D") createdDate_D,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("pos_A") pos_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("pos_D") pos_D
}