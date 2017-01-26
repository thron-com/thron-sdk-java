package it.newvision.nvp.xcontents.services.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEContent") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEContent {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CONTENT_NOT_EXISTS") CONTENT_NOT_EXISTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("EXCEPTION") EXCEPTION,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ACCESS_DENIED") ACCESS_DENIED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OK") OK,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("UPDATE_CLASH") UPDATE_CLASH,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("WRITE_ERROR") WRITE_ERROR,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CONTENT_NOT_EMPTY") CONTENT_NOT_EMPTY,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("LINKED_CONTENT_NOT_EXISTS") LINKED_CONTENT_NOT_EXISTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CATEGORY_IN_LIST_NOT_EXISTS") CATEGORY_IN_LIST_NOT_EXISTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("LOCALE_NOT_EXISTS") LOCALE_NOT_EXISTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("LOCALE_ALREADY_EXISTS") LOCALE_ALREADY_EXISTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PROVIDER_ALREADY_EXISTS") PROVIDER_ALREADY_EXISTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PROVIDER_NOT_EXISTS") PROVIDER_NOT_EXISTS,
	/**
	 * The content can't be removed because is linked by another content (typically by
	 * a playlist or slideshow)
	 */
	//#SWG#@ApiModelProperty(value = """The content can't be removed because is linked by another content (typically by a playlist or slideshow)""")
	@XmlEnumValue("CONTENT_IS_LINKED") CONTENT_IS_LINKED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PRETTYID_ALREADY_EXISTS") PRETTYID_ALREADY_EXISTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PLAYER_EMBED_CODE_ALREADY_EXISTS") PLAYER_EMBED_CODE_ALREADY_EXISTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("MAX_NUMBER_OF_ITEMS_REACHED") MAX_NUMBER_OF_ITEMS_REACHED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("EXTERNALID_ALREADY_EXISTS") EXTERNALID_ALREADY_EXISTS
}