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
	/**
	 * Generic html document that can be created and editing in the platform
	 */
	//#SWG#@ApiModelProperty(value = """Generic html document that can be created and editing in the platform""")
	@XmlEnumValue("PAGELET") PAGELET
}