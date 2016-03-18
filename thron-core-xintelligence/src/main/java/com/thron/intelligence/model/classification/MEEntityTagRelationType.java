package com.thron.intelligence.model.classification;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Used to define the Entity -> Tag relation
 * 
 * Examples:
 * Mario IS sales
 * Antonio IS support
 * "THRON 5.0" IS product
 * "THRON 5.0" INTERESTED for sales
 * Antonio INTERESTED in product
 */
@XmlType(name="MEEntityTagRelationType") 
@XmlEnum
//#SWG#@ApiModel(description = """Used to define the Entity -> Tag relation
//#SWGNL#
//#SWGNL#Examples:
//#SWGNL#Mario IS sales
//#SWGNL#Antonio IS support
//#SWGNL#"THRON 5.0" IS product
//#SWGNL#"THRON 5.0" INTERESTED for sales
//#SWGNL#Antonio INTERESTED in product""")
public enum MEEntityTagRelationType {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("IS") IS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("INTERESTED") INTERESTED
}