package it.newvision.nvp.identity.services.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEITagOperation") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEITagOperation {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("AND") AND,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OR") OR
}