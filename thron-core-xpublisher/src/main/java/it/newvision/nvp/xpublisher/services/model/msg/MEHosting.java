package it.newvision.nvp.xpublisher.services.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEHosting") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEHosting {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OK") OK,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("EXCEPTION") EXCEPTION,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("FILE_NOT_EXISTS") FILE_NOT_EXISTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("FILE_NOT_FOUND") FILE_NOT_FOUND,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("FOLDER_NOT_FOUND") FOLDER_NOT_FOUND,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CLIENT_NOT_EXISTS") CLIENT_NOT_EXISTS
}