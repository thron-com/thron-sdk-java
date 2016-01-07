package it.newvision.nvp.identity.model;
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
	@XmlEnumValue("PERSON") PERSON,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("COMPANY") COMPANY
}