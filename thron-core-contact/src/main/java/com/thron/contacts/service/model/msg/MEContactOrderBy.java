package com.thron.contacts.service.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEContactOrderBy") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEContactOrderBy {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("createdDate_D") createdDate_D,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("accessedDate_D") accessedDate_D
}