package it.newvision.nvp.xpublisher.services.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEWowzaEventManager") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEWowzaEventManager {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("MALFORMED_OBJECT") MALFORMED_OBJECT,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("INVALID_PARAMETERS") INVALID_PARAMETERS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("INVALID_OBJECT") INVALID_OBJECT,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("INVALIDTIMEINTERVAL") INVALIDTIMEINTERVAL,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("NO_SUCH_EVENT") NO_SUCH_EVENT,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OVERLAPPINGEVENT") OVERLAPPINGEVENT,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("NOSUCHAPPLICATION") NOSUCHAPPLICATION,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("NOSUCHAPPINSTANCE") NOSUCHAPPINSTANCE,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("SERVERSTREAMERROR") SERVERSTREAMERROR,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PLAYERROR") PLAYERROR,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("INVALID_SERVER_STREAM_NAME") INVALID_SERVER_STREAM_NAME,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("NO_PLANNED_EVENTS") NO_PLANNED_EVENTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("NOSTREAMNAME") NOSTREAMNAME,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("NOSUCHVHOST") NOSUCHVHOST,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("EXCEPTION") EXCEPTION
}