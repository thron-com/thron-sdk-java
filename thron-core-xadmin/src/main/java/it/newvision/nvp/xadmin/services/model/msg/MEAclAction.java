package it.newvision.nvp.xadmin.services.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEAclAction") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEAclAction {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ADD") ADD,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("DELETE") DELETE,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ENABLE") ENABLE,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("DISABLE") DISABLE
}