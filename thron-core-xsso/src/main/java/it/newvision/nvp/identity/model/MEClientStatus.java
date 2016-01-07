package it.newvision.nvp.identity.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEClientStatus") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEClientStatus {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("DRAFT") DRAFT,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ACTIVE") ACTIVE,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("INACTIVE") INACTIVE,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("EXPIRED") EXPIRED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("SETUP_IN_PROGRESS") SETUP_IN_PROGRESS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ERROR") ERROR
}