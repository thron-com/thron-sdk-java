package it.newvision.nvp.xcontents.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEModerationStatus") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEModerationStatus {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PENDING") PENDING,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PENDING_LOCKED") PENDING_LOCKED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("APPROVED") APPROVED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("APPROVED_WITH_ABUSE") APPROVED_WITH_ABUSE,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("UNAPPROVED") UNAPPROVED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("UNAPPROVED_AS_SPAM") UNAPPROVED_AS_SPAM
}