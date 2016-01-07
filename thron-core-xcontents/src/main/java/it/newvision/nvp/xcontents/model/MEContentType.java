package it.newvision.nvp.xcontents.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEContentType") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEContentType {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("VIDEO") VIDEO,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("AUDIO") AUDIO,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("IMAGE") IMAGE,
	/**
	 * used to publish generic documents lice docs, pdf, xls, etc...
	 */
	//#SWG#@ApiModelProperty(value = """used to publish generic documents lice docs, pdf, xls, etc...""")
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
	/**
	 * used by 4ME PLAYBOX APP
	 */
	//#SWG#@ApiModelProperty(value = """used by 4ME PLAYBOX APP""")
	@XmlEnumValue("PROGRAMS") PROGRAMS,
	/**
	 * The 4ME Document Type, used to publish documents in the specific 4me document
	 * format.
	 */
	//#SWG#@ApiModelProperty(value = """The 4ME Document Type, used to publish documents in the specific 4me document format.""")
	@XmlEnumValue("NDOC") NDOC,
	/**
	 * Generic html document that can be created and editing in the platform
	 */
	//#SWG#@ApiModelProperty(value = """Generic html document that can be created and editing in the platform""")
	@XmlEnumValue("PAGELET") PAGELET
}