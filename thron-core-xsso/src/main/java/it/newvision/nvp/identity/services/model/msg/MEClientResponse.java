package it.newvision.nvp.identity.services.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEClientResponse") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEClientResponse {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OK") OK,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("WRITE_ERROR") WRITE_ERROR,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ACCESS_DENIED") ACCESS_DENIED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("EXCEPTION") EXCEPTION,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CLIENT_NOT_FOUND") CLIENT_NOT_FOUND,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("SESSION_NON_FOUND") SESSION_NON_FOUND,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("USERNAME_NOT_FOUND") USERNAME_NOT_FOUND,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("VUSERNAME_NOT_FOUND") VUSERNAME_NOT_FOUND,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("USERNAME_ALREADY_EXISTS") USERNAME_ALREADY_EXISTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("VUSERNAME_ALREADY_EXISTS") VUSERNAME_ALREADY_EXISTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("USERSGROUP_NOT_FOUND") USERSGROUP_NOT_FOUND,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("IMAGE_FORMAT_NOT_VALID") IMAGE_FORMAT_NOT_VALID,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("USERSGROUP_NOT_EMPTY") USERSGROUP_NOT_EMPTY,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("MAX_NUMBER_OF_ITEMS_REACHED") MAX_NUMBER_OF_ITEMS_REACHED
}