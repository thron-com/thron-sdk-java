package it.newvision.nvp.xcontents.services.model.playlist;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEPlaylistTemplate") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEPlaylistTemplate {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("VIDEO") VIDEO,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("AUDIO") AUDIO,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("IMAGE") IMAGE,
	/**
	 * IMAGE, 360 PRODUCT VIEW
	 */
	//#SWG#@ApiModelProperty(value = """IMAGE, 360 PRODUCT VIEW""")
	@XmlEnumValue("PRODUCT_VIEW") PRODUCT_VIEW,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("URL") URL
}