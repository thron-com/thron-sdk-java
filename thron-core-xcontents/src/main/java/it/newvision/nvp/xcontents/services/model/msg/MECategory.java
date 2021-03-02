package it.newvision.nvp.xcontents.services.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MECategory") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MECategory {
	/**
	 * La categoria che si sta tentando di attivare o disattivare non è presente.
	 */
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CATEGORY_NOT_EXISTS") CATEGORY_NOT_EXISTS,
	/**
	 * Il nome passato per la categoria è vuoto.
	 *                    
	 */
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CATEGORYNAME_IS_REQUIRED") CATEGORYNAME_IS_REQUIRED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ACCESS_DENIED") ACCESS_DENIED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CATEGORY_NOT_EMPTY") CATEGORY_NOT_EMPTY,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("EXCEPTION") EXCEPTION,
	/**
	 * E&rsquo; stata specificata una categoria non esistente come &ldquo;super-
	 * categoria&rdquo; per la presente.
	 */
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PARENT_CATEGORY_NOT_FOUND") PARENT_CATEGORY_NOT_FOUND,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OK") OK,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("WRITE_ERROR") WRITE_ERROR,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("LOCALE_NOT_EXISTS") LOCALE_NOT_EXISTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("LOCALE_ALREADY_EXISTS") LOCALE_ALREADY_EXISTS,
	/**
	 * the parent category Id can not be equal to the current category. Self linked
	 * category are not allowed!
	 */
	//#SWG#@ApiModelProperty(value = """the parent category Id can not be equal to the current category. Self linked category are not allowed!""")
	@XmlEnumValue("PARENT_CATEGORY_NOT_VALID") PARENT_CATEGORY_NOT_VALID,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("UPDATE_CLASH") UPDATE_CLASH,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PRETTYID_ALREADY_EXISTS") PRETTYID_ALREADY_EXISTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PRIVATE_CATEGORY_EXCEPTION") PRIVATE_CATEGORY_EXCEPTION,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("MAX_TREE_NODES_EXCEEDED") MAX_TREE_NODES_EXCEEDED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OPERATION_LOCKED") OPERATION_LOCKED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("MAX_DEPTH_EXCEEDED") MAX_DEPTH_EXCEEDED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("MAX_NUMBER_OF_CATEGORIES_STARRED_REACHED") MAX_NUMBER_OF_CATEGORIES_STARRED_REACHED
}