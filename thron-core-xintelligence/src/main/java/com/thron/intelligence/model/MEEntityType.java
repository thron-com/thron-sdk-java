package com.thron.intelligence.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEEntityType") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEEntityType {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CONTENT") CONTENT,
	/**
	 * platform user
	 */
	//#SWG#@ApiModelProperty(value = """platform user""")
	@XmlEnumValue("USER") USER,
	/**
	 * contact
	 */
	//#SWG#@ApiModelProperty(value = """contact""")
	@XmlEnumValue("CONTACT") CONTACT
}