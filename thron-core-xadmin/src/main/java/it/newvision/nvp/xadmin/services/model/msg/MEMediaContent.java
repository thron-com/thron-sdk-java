package it.newvision.nvp.xadmin.services.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEMediaContent") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEMediaContent {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OK") OK,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("WRITE_ERROR") WRITE_ERROR,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ACCESS_DENIED") ACCESS_DENIED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("EXCEPTION") EXCEPTION,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CLIENT_NOT_EXISTS") CLIENT_NOT_EXISTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OPERATION_NOT_ALLOWED") OPERATION_NOT_ALLOWED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("UPDATE_CLASH") UPDATE_CLASH,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("THUMBNAIL_NOT_FOUND") THUMBNAIL_NOT_FOUND,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("IMAGE_FORMAT_NOT_ALLOWED") IMAGE_FORMAT_NOT_ALLOWED,
	/**
	 * The thumbnail exceed the maximum image size allowed
	 */
	//#SWG#@ApiModelProperty(value = """The thumbnail exceed the maximum image size allowed""")
	@XmlEnumValue("THUMBNAIL_SIZE_ERROR") THUMBNAIL_SIZE_ERROR,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("MEDIACONTENT_NOT_EXISTS") MEDIACONTENT_NOT_EXISTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CONTENT_LOCKED") CONTENT_LOCKED
}