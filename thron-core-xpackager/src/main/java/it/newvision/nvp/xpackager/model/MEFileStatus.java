package it.newvision.nvp.xpackager.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEFileStatus") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEFileStatus {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("READY") READY,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("IN_DOWNLOAD") IN_DOWNLOAD,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ERROR") ERROR
}