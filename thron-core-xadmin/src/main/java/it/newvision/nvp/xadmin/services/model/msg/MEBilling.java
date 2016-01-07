package it.newvision.nvp.xadmin.services.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEBilling") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEBilling {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OK") OK,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("WRITE_ERROR") WRITE_ERROR,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("EXCEPTION") EXCEPTION,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CLIENT_NOT_EXISTS") CLIENT_NOT_EXISTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OPERATION_NOT_ALLOWED") OPERATION_NOT_ALLOWED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("UPDATE_CLASH") UPDATE_CLASH
}