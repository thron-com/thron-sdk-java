package com.thron.intelligence.model.metadata;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEMetadataDefinitionDataType") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEMetadataDefinitionDataType {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("KEY") KEY,
	/**
	 * only one free String value
	 */
	//#SWG#@ApiModelProperty(value = """only one free String value""")
	@XmlEnumValue("STRING") STRING,
	/**
	 * Only one numeric integer value
	 */
	//#SWG#@ApiModelProperty(value = """Only one numeric integer value""")
	@XmlEnumValue("NUMERIC_INTEGER") NUMERIC_INTEGER,
	/**
	 * Only one numeric double value
	 */
	//#SWG#@ApiModelProperty(value = """Only one numeric double value""")
	@XmlEnumValue("NUMERIC_DOUBLE") NUMERIC_DOUBLE,
	/**
	 * Only one Date value
	 */
	//#SWG#@ApiModelProperty(value = """Only one Date value""")
	@XmlEnumValue("TEMPORAL_INSTANT") TEMPORAL_INSTANT,
	/**
	 * Only one true/false value
	 */
	//#SWG#@ApiModelProperty(value = """Only one true/false value""")
	@XmlEnumValue("BOOLEAN") BOOLEAN,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("COLOR") COLOR,
	/**
	 * A list (single selection) of possible value
	 */
	//#SWG#@ApiModelProperty(value = """A list (single selection) of possible value""")
	@XmlEnumValue("ALTERNATIVE_S") ALTERNATIVE_S,
	/**
	 * A list (multi selection) of possible value
	 */
	//#SWG#@ApiModelProperty(value = """A list (multi selection) of possible value""")
	@XmlEnumValue("ALTERNATIVE_M") ALTERNATIVE_M
}