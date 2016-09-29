package it.newvision.nvp.xadmin.services.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEPublish") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEPublish {
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
	@XmlEnumValue("DUPLICATED_CHANNEL") DUPLICATED_CHANNEL,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CHANNEL_NOT_AVAILABLE") CHANNEL_NOT_AVAILABLE,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("MEDIACONTENT_NOT_AVAILABLE") MEDIACONTENT_NOT_AVAILABLE,
	/**
	 * The uploaded file exceeds the maximum size allowed
	 */
	//#SWG#@ApiModelProperty(value = """The uploaded file exceeds the maximum size allowed""")
	@XmlEnumValue("SOURCE_FILE_TOO_BIG") SOURCE_FILE_TOO_BIG,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CONTENT_IS_LINKED") CONTENT_IS_LINKED
}