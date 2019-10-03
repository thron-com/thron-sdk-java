package it.newvision.nvp.xadmin.services.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEAppsResponse") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEAppsResponse {
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
	@XmlEnumValue("APP_NOT_FOUND") APP_NOT_FOUND,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("APP_ALREADY_EXISTS") APP_ALREADY_EXISTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("APP_DISABLED") APP_DISABLED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("SNIPPET_DISABLED") SNIPPET_DISABLED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("APP_AUTHENTICATION_FAILED") APP_AUTHENTICATION_FAILED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("SNIPPET_NOT_FOUND") SNIPPET_NOT_FOUND,
	/**
	 * if the user has not the right permission to access the app category
	 */
	//#SWG#@ApiModelProperty(value = """if the user has not the right permission to access the app category""")
	@XmlEnumValue("INVALID_CATEGORY") INVALID_CATEGORY,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("KEY_NOT_FOUND") KEY_NOT_FOUND,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OPERATION_LOCKED") OPERATION_LOCKED
}