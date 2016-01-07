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
 * the content can be used as link inside playlist or recommended contents, or
 * downloadable.
 */
@XmlType(name="MEContentProperties") 
@XmlEnum
//#SWG#@ApiModel(description = """the content can be used as link inside playlist or recommended contents, or downloadable.""")
public enum MEContentProperties {
	/**
	 * specify if is possible to rate the content.
	 */
	//#SWG#@ApiModelProperty(value = """specify if is possible to rate the content.""")
	@XmlEnumValue("RATINGALLOWED") RATINGALLOWED,
	/**
	 * it is possibile to comment the content
	 */
	//#SWG#@ApiModelProperty(value = """it is possibile to comment the content""")
	@XmlEnumValue("COMMENTSALLOWED") COMMENTSALLOWED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PREMIUM") PREMIUM,
	/**
	 * The user can decide to show or not the liked contents in the 4me player.
	 */
	//#SWG#@ApiModelProperty(value = """The user can decide to show or not the liked contents in the 4me player.""")
	@XmlEnumValue("SHOWLINKEDCONTENTS") SHOWLINKEDCONTENTS,
	/**
	 * the content will be filtered linkedContents  in playlist,
	 * recommends/downloadable contents etc...
	 * If the property is not defied the content can be used and linked to other
	 * contents.
	 */
	//#SWG#@ApiModelProperty(value = """the content will be filtered linkedContents  in playlist, recommends/downloadable contents etc...
	//#SWGNL#If the property is not defied the content can be used and linked to other contents.""")
	@XmlEnumValue("UNLINKABLE") UNLINKABLE
}