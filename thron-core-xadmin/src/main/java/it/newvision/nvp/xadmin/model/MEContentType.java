package it.newvision.nvp.xadmin.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * like content-type used in xcontent.
 */
@XmlType(name="MEContentType") 
@XmlEnum
//#SWG#@ApiModel(description = """like content-type used in xcontent.""")
public enum MEContentType {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("VIDEO") VIDEO,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("AUDIO") AUDIO,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("IMAGE") IMAGE,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OTHER") OTHER,
	/**
	 * NOT YET AVAILABLE
	 */
	//#SWG#@ApiModelProperty(value = """NOT YET AVAILABLE""")
	@XmlEnumValue("LIVEEVENT") LIVEEVENT,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PLAYLIST") PLAYLIST,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("URL") URL,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PROGRAMS") PROGRAMS,
	/**
	 * Generic html document that can be created and editing in the platform
	 */
	//#SWG#@ApiModelProperty(value = """Generic html document that can be created and editing in the platform""")
	@XmlEnumValue("PAGELET") PAGELET
}