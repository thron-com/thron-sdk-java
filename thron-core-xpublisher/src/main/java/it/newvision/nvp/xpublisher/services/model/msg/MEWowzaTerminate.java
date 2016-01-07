package it.newvision.nvp.xpublisher.services.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEWowzaTerminate") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEWowzaTerminate {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("EVENT_DELETED") EVENT_DELETED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("MALFORMED_OBJECT") MALFORMED_OBJECT,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("INVALID_PARAMETERS") INVALID_PARAMETERS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("INVALID_OBJECT") INVALID_OBJECT,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("NO_SUCH_EVENT") NO_SUCH_EVENT,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("EXCEPTION") EXCEPTION
}