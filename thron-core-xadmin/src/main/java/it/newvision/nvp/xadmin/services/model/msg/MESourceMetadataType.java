package it.newvision.nvp.xadmin.services.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MESourceMetadataType") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MESourceMetadataType {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("XMP") XMP,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("EXIF") EXIF,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("IPTC") IPTC
}