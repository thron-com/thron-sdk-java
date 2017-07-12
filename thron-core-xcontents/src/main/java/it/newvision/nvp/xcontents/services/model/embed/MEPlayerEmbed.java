package it.newvision.nvp.xcontents.services.model.embed;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEPlayerEmbed") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEPlayerEmbed {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CONTENT_NOT_EXISTS") CONTENT_NOT_EXISTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("EXCEPTION") EXCEPTION,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ACCESS_DENIED") ACCESS_DENIED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OK") OK,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("WRITE_ERROR") WRITE_ERROR,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PLAYER_EMBED_CODE_NOT_EXISTS") PLAYER_EMBED_CODE_NOT_EXISTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PLAYER_EMBED_TEMPLATE_NOT_EXISTS") PLAYER_EMBED_TEMPLATE_NOT_EXISTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PLAYER_EMBED_CODE_ALREADY_EXISTS") PLAYER_EMBED_CODE_ALREADY_EXISTS
}