package it.newvision.nvp.xcontents.services.model.content.search;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEContentSearchType") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEContentSearchType {
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
	 * Generic html document that can be created and editing in the platform
	 */
	//#SWG#@ApiModelProperty(value = """Generic html document that can be created and editing in the platform""")
	@XmlEnumValue("PAGELET") PAGELET,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("URL") URL,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PLAYLIST") PLAYLIST,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PLAYLIST_VIDEO") PLAYLIST_VIDEO,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PLAYLIST_IMAGE") PLAYLIST_IMAGE,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PLAYLIST_360") PLAYLIST_360,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PLAYLIST_AUDIO") PLAYLIST_AUDIO
}