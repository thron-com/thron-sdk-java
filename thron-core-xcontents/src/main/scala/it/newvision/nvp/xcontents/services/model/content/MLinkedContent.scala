package it.newvision.nvp.xcontents.services.model.content
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MELinkType

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Class used to provide all necessary information to fill the relation between
 * two contents. To link a content to an other the user must specify also the
 * linkType relation
 */
@XmlRootElement(name="MLinkedContent") 
@XmlType(name="MLinkedContent")
//#SWG#@ApiModel(description = """Class used to provide all necessary information to fill the relation between two contents. To link a content to an other the user must specify also the linkType relation""")
class MLinkedContent extends Serializable {

	/**
	 * Used to specify the linkedContent Association
	 */
	//#SWG#@ApiModelProperty(value = """Used to specify the linkedContent Association""" ,required = true)
	@BeanProperty 
	var linkType: MELinkType =_
	def withlinkType(p:MELinkType):this.type ={ 	this.linkType = p; 	this }

	/**
	 * Desired position of the element inside the linkedContents list. If missing, the
	 * element is enqueued.
	 */
	//#SWG#@ApiModelProperty(value = """Desired position of the element inside the linkedContents list. If missing, the element is enqueued.""")
	@BeanProperty 
	var position: Integer =_
	def withposition(p:Integer):this.type ={ 	this.position = p; 	this }

	/**
	 * NOT IMPLEMENTED.
	 * 
	 * The user can specify a specific channel for the linkedContent. The attribute
	 * specify that the given content is linked to an other content but only with a
	 * content's channel.
	 * This is commonly used with "DOWNLOADABLE" linkedContents where it may be
	 * necessary to specify the channel type to use for the download, because the
	 * content can have more than one WEB channel.
	 * The selectedChannel information is stored in content.linkedContents.metadata
	 * with _SELECTEDCHANNEL_ name
	 * 
	 * Example:
	 * <linkedContent>
	 * <id>xxxx</id>
	 * 
	 * <metadata>
	 * 	<name>_SELECTEDCHANNEL_ </name>
	 * 	<value>WEB</value>
	 * </metadata>
	 * <metadata>
	 * 	<name>_LINKTYPE_</name>
	 * 	<value>DOWNLOADABLE</value>
	 * </metadata>
	 * </linkedContent>
	 */
	//#SWG#@ApiModelProperty(value = """NOT IMPLEMENTED.
	//#SWGNL#
	//#SWGNL#The user can specify a specific channel for the linkedContent. The attribute specify that the given content is linked to an other content but only with a content's channel. 
	//#SWGNL#This is commonly used with "DOWNLOADABLE" linkedContents where it may be necessary to specify the channel type to use for the download, because the content can have more than one WEB channel.
	//#SWGNL#The selectedChannel information is stored in content.linkedContents.metadata with _SELECTEDCHANNEL_ name
	//#SWGNL#
	//#SWGNL#Example:
	//#SWGNL#<linkedContent>
	//#SWGNL#<id>xxxx</id>
	//#SWGNL#
	//#SWGNL#<metadata>
	//#SWGNL#	<name>_SELECTEDCHANNEL_ </name>
	//#SWGNL#	<value>WEB</value>
	//#SWGNL#</metadata>
	//#SWGNL#<metadata>
	//#SWGNL#	<name>_LINKTYPE_</name>
	//#SWGNL#	<value>DOWNLOADABLE</value>
	//#SWGNL#</metadata>
	//#SWGNL#</linkedContent>""")
	@BeanProperty 
	@Deprecated
	var selectedChannel: String =_
	@Deprecated
	def withselectedChannel(p:String):this.type ={ 	this.selectedChannel = p; 	this }

	/**
	 * a contentId element
	 */
	//#SWG#@ApiModelProperty(value = """a contentId element""" ,required = true)
	@BeanProperty 
	var xcontentId: String =_
	def withxcontentId(p:String):this.type ={ 	this.xcontentId = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(linkType).isDefined &&
		Option(xcontentId).isDefined
	}

}