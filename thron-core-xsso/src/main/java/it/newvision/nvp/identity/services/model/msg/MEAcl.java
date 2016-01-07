package it.newvision.nvp.identity.services.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEAcl") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEAcl {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OK") OK,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("WRITE_ERROR") WRITE_ERROR,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ACCESS_DENIED") ACCESS_DENIED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("EXCEPTION") EXCEPTION,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("SESSION_NON_FOUND") SESSION_NON_FOUND,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("USERNAME_NOT_FOUND") USERNAME_NOT_FOUND,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("USERNAME_ALREADY_EXISTS") USERNAME_ALREADY_EXISTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("USERSGROUP_NOT_FOUND") USERSGROUP_NOT_FOUND,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ACL_NOT_FOUND") ACL_NOT_FOUND,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ACL_PARTIALLY_VERIFIED") ACL_PARTIALLY_VERIFIED
}