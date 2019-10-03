package com.thron.contacts.service.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEJobStatus") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEJobStatus {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ERROR") ERROR,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("IN_PROGRESS") IN_PROGRESS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("COMPLETED") COMPLETED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PAUSED") PAUSED
}