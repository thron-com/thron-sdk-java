package it.newvision.nvp.xcontents.services.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MESearchKeyOption") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MESearchKeyOption {
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
	@XmlEnumValue("BY_TOKEN") BY_TOKEN
}