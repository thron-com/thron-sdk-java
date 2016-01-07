package it.newvision.nvp.xadmin.services.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEPublishWeeboAction") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEPublishWeeboAction {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ADD_LOCALE") ADD_LOCALE,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ADD_TAG") ADD_TAG,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("LINK_TO_CATEGORY") LINK_TO_CATEGORY,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("UPDATE_CONTENT_PROPERTIES") UPDATE_CONTENT_PROPERTIES,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("UPDATE_METADATA") UPDATE_METADATA,
	/**
	 * Used by publishLiveEvent() only
	 */
	//#SWG#@ApiModelProperty(value = """Used by publishLiveEvent() only""")
	@XmlEnumValue("START_LIVEEVENT") START_LIVEEVENT,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CREATE_CONTENT_FOR_CHANNEL") CREATE_CONTENT_FOR_CHANNEL,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PUBLISH_CHANNEL") PUBLISH_CHANNEL,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ADD_PRETTYID") ADD_PRETTYID
}