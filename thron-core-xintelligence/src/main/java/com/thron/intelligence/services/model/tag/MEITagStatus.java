package com.thron.intelligence.services.model.tag;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEITagStatus") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEITagStatus {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("APPROVED") APPROVED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("REJECTED") REJECTED,
	/**
	 * The Tag needs to be moderated
	 */
	//#SWG#@ApiModelProperty(value = """The Tag needs to be moderated""")
	@XmlEnumValue("SUGGESTED") SUGGESTED
}