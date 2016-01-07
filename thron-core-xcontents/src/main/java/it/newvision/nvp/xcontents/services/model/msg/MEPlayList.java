package it.newvision.nvp.xcontents.services.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEPlayList") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEPlayList {
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
	@XmlEnumValue("LOCALE_NOT_EXISTS") LOCALE_NOT_EXISTS,
	/**
	 * The user is trying to add a content not matching the playlist template.
	 */
	//#SWG#@ApiModelProperty(value = """The user is trying to add a content not matching the playlist template.""")
	@XmlEnumValue("LINKED_CONTENT_NOT_VALID") LINKED_CONTENT_NOT_VALID,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CONTENT_ALREADY_LINKED") CONTENT_ALREADY_LINKED
}