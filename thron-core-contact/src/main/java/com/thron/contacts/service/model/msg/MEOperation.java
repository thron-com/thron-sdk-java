package com.thron.contacts.service.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEOperation") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEOperation {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("AND") AND,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OR") OR
}