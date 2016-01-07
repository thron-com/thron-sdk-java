package it.newvision.nvp.xplaylist.services.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEPlaylist") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEPlaylist {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CONTENT_NOT_EXISTS") CONTENT_NOT_EXISTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("EXCEPTION") EXCEPTION,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OK") OK,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("UPDATE_CLASH") UPDATE_CLASH,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("WRITE_ERROR") WRITE_ERROR,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CONTENT_NOT_EMPTY") CONTENT_NOT_EMPTY,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("LINKED_CONTENT_NOT_EXISTS") LINKED_CONTENT_NOT_EXISTS,
	/**
	 * used to indicate that the type of content can not be added to the playlist.
	 * Commonly used with playlists based on a template
	 */
	//#SWG#@ApiModelProperty(value = """used to indicate that the type of content can not be added to the playlist. Commonly used with playlists based on a template""")
	@XmlEnumValue("CONTENTTYPE_NOT_ALLOWED") CONTENTTYPE_NOT_ALLOWED
}