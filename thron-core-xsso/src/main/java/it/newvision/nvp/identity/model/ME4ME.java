package it.newvision.nvp.identity.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="ME4ME") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum ME4ME {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("VIEW") VIEW,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PLAY") PLAY,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("MOVE") MOVE,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("TALK") TALK
}