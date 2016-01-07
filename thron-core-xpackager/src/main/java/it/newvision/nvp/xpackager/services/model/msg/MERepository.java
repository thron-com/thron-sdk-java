package it.newvision.nvp.xpackager.services.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MERepository") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MERepository {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OK") OK,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("WRITE_ERROR") WRITE_ERROR,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("EXCEPTION") EXCEPTION,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("FILE_NOT_FOUND") FILE_NOT_FOUND,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CLIENT_NOT_FOUND") CLIENT_NOT_FOUND,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("FILE_READ_ERROR") FILE_READ_ERROR,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("FILE_NOT_SUPPORTED") FILE_NOT_SUPPORTED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CLIENT_QUOTA_EXCEED") CLIENT_QUOTA_EXCEED
}