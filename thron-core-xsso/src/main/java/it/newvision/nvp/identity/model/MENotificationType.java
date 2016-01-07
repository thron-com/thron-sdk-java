package it.newvision.nvp.identity.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MENotificationType") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MENotificationType {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("EMAIL") EMAIL,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("SMS") SMS
}