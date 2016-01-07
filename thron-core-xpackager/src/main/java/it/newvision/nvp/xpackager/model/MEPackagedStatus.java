package it.newvision.nvp.xpackager.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEPackagedStatus") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEPackagedStatus {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("COMPLETED") COMPLETED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("IN_PROGRESS") IN_PROGRESS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("REMOVED") REMOVED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("FAILED") FAILED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("INGESTION_FAILED") INGESTION_FAILED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("STOPPED") STOPPED
}