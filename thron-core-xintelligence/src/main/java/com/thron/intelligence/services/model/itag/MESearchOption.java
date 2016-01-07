package com.thron.intelligence.services.model.itag;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MESearchOption") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MESearchOption {
	/**
	 * Quoted pattern of text value
	 */
	//#SWG#@ApiModelProperty(value = """Quoted pattern of text value""")
	@XmlEnumValue("EXACT_MATCH") EXACT_MATCH,
	/**
	 * Search all tokens (distinct words) specified in the text value.
	 */
	//#SWG#@ApiModelProperty(value = """Search all tokens (distinct words) specified in the text value.""")
	@XmlEnumValue("BY_TOKEN") BY_TOKEN
}