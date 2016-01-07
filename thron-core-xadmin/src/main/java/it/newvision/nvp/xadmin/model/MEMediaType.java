package it.newvision.nvp.xadmin.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEMediaType") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEMediaType {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("VIDEO") VIDEO,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("IMAGE") IMAGE,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("AUDIO") AUDIO,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("DOCUMENT") DOCUMENT,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("FLASH") FLASH,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PRESENTATION") PRESENTATION,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("APPLICATION") APPLICATION,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OTHER") OTHER,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("THUMBNAIL") THUMBNAIL,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PLAYLIST") PLAYLIST,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("SLIDESHOW") SLIDESHOW
}