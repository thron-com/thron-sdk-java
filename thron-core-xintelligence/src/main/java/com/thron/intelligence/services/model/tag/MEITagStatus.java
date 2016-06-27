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
	/**
	 * DEPRECATED
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED""")
	@XmlEnumValue("REJECTED") REJECTED,
	/**
	 * DEPRECATED
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED""")
	@XmlEnumValue("SUGGESTED") SUGGESTED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("COMBINATION") COMBINATION
}