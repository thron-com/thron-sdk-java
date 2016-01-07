package com.thron.contacts.service.model.contact;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEContactType") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEContactType {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ANONYMOUS") ANONYMOUS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("IDENTIFIED") IDENTIFIED
}