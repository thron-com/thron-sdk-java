package it.newvision.nvp.xadmin.services.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEDashboard") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEDashboard {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OK") OK,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ACCESS_DENIED") ACCESS_DENIED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("EXCEPTION") EXCEPTION,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CLIENT_NOT_EXISTS") CLIENT_NOT_EXISTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CONTENT_NOT_EXISTS") CONTENT_NOT_EXISTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OPERATION_NOT_ALLOWED") OPERATION_NOT_ALLOWED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CATEGORY_NOT_EXISTS") CATEGORY_NOT_EXISTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("USER_NOT_EXISTS") USER_NOT_EXISTS
}