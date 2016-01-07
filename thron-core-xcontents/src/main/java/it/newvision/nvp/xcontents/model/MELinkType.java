package it.newvision.nvp.xcontents.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * This enumeration is used to set the linked contents association necessary to
 * distinguish contents associated with a recommended or downloadable content from
 * the playlist.
 */
@XmlType(name="MELinkType") 
@XmlEnum
//#SWG#@ApiModel(description = """This enumeration is used to set the linked contents association necessary to distinguish contents associated with a recommended or downloadable content from the playlist.""")
public enum MELinkType {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PLAYLISTELEMENT") PLAYLISTELEMENT,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("DOWNLOADABLE") DOWNLOADABLE,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("RECOMMENDED") RECOMMENDED
}