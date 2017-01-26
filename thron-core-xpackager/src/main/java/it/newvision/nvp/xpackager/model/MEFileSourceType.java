package it.newvision.nvp.xpackager.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEFileSourceType") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEFileSourceType {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("WEB") WEB,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("FTP") FTP,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("S3") S3,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("RAW") RAW
}