package com.thron.intelligence.services.model.itag;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEIdSearchOption") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEIdSearchOption {
	/**
	 * regex pattern: /^\QsearchKey\E/i
	 * Start with the Quoted pattern of "searchKey" value
	 */
	//#SWG#@ApiModelProperty(value = """regex pattern: /^\QsearchKey\E/i
	//#SWGNL#Start with the Quoted pattern of "searchKey" value""")
	@XmlEnumValue("START_WITH") START_WITH
}