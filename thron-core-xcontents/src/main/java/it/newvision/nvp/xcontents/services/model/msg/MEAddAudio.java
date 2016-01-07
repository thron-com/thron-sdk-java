package it.newvision.nvp.xcontents.services.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEAddAudio") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEAddAudio {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("FILE_NAME_NOT_VALID") FILE_NAME_NOT_VALID,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("FILE_IS_NOT_MP3") FILE_IS_NOT_MP3,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OK") OK,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("WRITE_ERROR") WRITE_ERROR,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("EXCEPTION") EXCEPTION
}