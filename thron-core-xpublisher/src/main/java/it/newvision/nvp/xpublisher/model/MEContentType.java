package it.newvision.nvp.xpublisher.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Same as content type used in xcontent and xadmin. It is used to get the correct
 * channel properties from the xsso services.
 */
@XmlType(name="MEContentType") 
@XmlEnum
//#SWG#@ApiModel(description = """Same as content type used in xcontent and xadmin. It is used to get the correct channel properties from the xsso services.""")
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
	@XmlEnumValue("BANNER") BANNER,
	/**
	 * NOT YET AVAILABLE
	 */
	//#SWG#@ApiModelProperty(value = """NOT YET AVAILABLE""")
	@XmlEnumValue("NEWS") NEWS,
	/**
	 * NOT YET AVAILABLE
	 */
	//#SWG#@ApiModelProperty(value = """NOT YET AVAILABLE""")
	@XmlEnumValue("LIVEEVENT") LIVEEVENT,
	/**
	 * DEPRECATED
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED""")
	@XmlEnumValue("DOCUMENT") DOCUMENT,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PLAYLIST") PLAYLIST,
	/**
	 * NOT YET AVAILABLE
	 */
	//#SWG#@ApiModelProperty(value = """NOT YET AVAILABLE""")
	@XmlEnumValue("PALIMPSEST") PALIMPSEST,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PROGRAMS") PROGRAMS,
	/**
	 * The 4ME Document Type
	 */
	//#SWG#@ApiModelProperty(value = """The 4ME Document Type""")
	@XmlEnumValue("NDOC") NDOC,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("REPORTS") REPORTS,
	/**
	 * Generic html document that can be created and editing in the platform
	 */
	//#SWG#@ApiModelProperty(value = """Generic html document that can be created and editing in the platform""")
	@XmlEnumValue("PAGELET") PAGELET
}