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
@XmlType(name="MEContentPropertiesCriteria") 
@XmlEnum
//#SWG#@ApiModel(description = """the content can be used as link inside playlist or recommended contents, or downloadable.""")
public enum MEContentPropertiesCriteria {
	/**
	 * specify if is possible to rate the content.
	 */
	//#SWG#@ApiModelProperty(value = """specify if is possible to rate the content.""")
	@XmlEnumValue("RATINGALLOWED") RATINGALLOWED,
	/**
	 * it is possible to comment the content
	 */
	//#SWG#@ApiModelProperty(value = """it is possible to comment the content""")
	@XmlEnumValue("COMMENTSALLOWED") COMMENTSALLOWED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PREMIUM") PREMIUM,
	/**
	 * The user can decide to show or not the liked contents in the 4me player.
	 */
	//#SWG#@ApiModelProperty(value = """The user can decide to show or not the liked contents in the 4me player.""")
	@XmlEnumValue("SHOWLINKEDCONTENTS") SHOWLINKEDCONTENTS,
	/**
	 * only LINKABLE contents.
	 */
	//#SWG#@ApiModelProperty(value = """only LINKABLE contents.""")
	@XmlEnumValue("LINKABLE") LINKABLE
}