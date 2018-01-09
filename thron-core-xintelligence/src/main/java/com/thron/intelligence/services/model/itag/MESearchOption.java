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
	 * regex pattern: /\QsearchKey\E/i
	 * Quoted pattern of searchKey value
	 */
	//#SWG#@ApiModelProperty(value = """regex pattern: /\QsearchKey\E/i
	//#SWGNL#Quoted pattern of searchKey value""")
	@XmlEnumValue("EXACT_MATCH") EXACT_MATCH,
	/**
	 * regex pattern: /searchKey[1].*searchKey[2].*searchKey[3].*searchKey[n]/is
	 * Search all tokens (distinct words) specified in the searchKey value.
	 */
	//#SWG#@ApiModelProperty(value = """regex pattern: /searchKey[1].*searchKey[2].*searchKey[3].*searchKey[n]/is
	//#SWGNL#Search all tokens (distinct words) specified in the searchKey value.""")
	@XmlEnumValue("BY_TOKEN") BY_TOKEN,
	/**
	 * regex pattern: /^\QsearchKey\E/i
	 * Start with the Quoted pattern of "searchKey" value
	 */
	//#SWG#@ApiModelProperty(value = """regex pattern: /^\QsearchKey\E/i
	//#SWGNL#Start with the Quoted pattern of "searchKey" value""")
	@XmlEnumValue("START_WITH") START_WITH
}