package com.thron.intelligence.model.metadata;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEStringType") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEStringType {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("TEXTFIELD") TEXTFIELD,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("TEXTAREA") TEXTAREA,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PASSWORD") PASSWORD
}