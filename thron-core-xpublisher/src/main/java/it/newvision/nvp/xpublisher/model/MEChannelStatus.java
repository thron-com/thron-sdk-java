package it.newvision.nvp.xpublisher.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEChannelStatus") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEChannelStatus {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PUBLISHING_IN_PROGRESS") PUBLISHING_IN_PROGRESS,
	/**
	 * the content is active
	 */
	//#SWG#@ApiModelProperty(value = """the content is active""")
	@XmlEnumValue("PUBLISHED") PUBLISHED,
	/**
	 * content deactivated.
	 */
	//#SWG#@ApiModelProperty(value = """content deactivated.""")
	@XmlEnumValue("DEACTIVATED") DEACTIVATED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PLANNED") PLANNED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ERROR") ERROR,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("UNPUBLISHING_IN_PROGRESS") UNPUBLISHING_IN_PROGRESS
}