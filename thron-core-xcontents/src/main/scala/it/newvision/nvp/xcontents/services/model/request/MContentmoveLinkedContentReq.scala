package it.newvision.nvp.xcontents.services.model.request
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
 * Request message for service JContent.moveLinkedContent
 */
@XmlRootElement(name="MContentmoveLinkedContentReq")
@XmlType(name="MContentmoveLinkedContentReq")
//#SWG#@ApiModel(description = "Request message for service JContent.moveLinkedContent")
class MContentmoveLinkedContentReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var linkType: MELinkType =_
	def withlinkType(p:MELinkType):this.type ={ 	this.linkType = p; 	this }

	/**
	 * move the linkedContent in oldPosition to newPosition
	 */
	//#SWG#@ApiModelProperty(value = """move the linkedContent in oldPosition to newPosition""", required = true)
	@BeanProperty
	var newPosition: Integer =_
	def withnewPosition(p:Integer):this.type ={ 	this.newPosition = p; 	this }

	/**
	 * move the linkedContent in oldPosition to newPosition
	 */
	//#SWG#@ApiModelProperty(value = """move the linkedContent in oldPosition to newPosition""", required = true)
	@BeanProperty
	var oldPosition: Integer =_
	def witholdPosition(p:Integer):this.type ={ 	this.oldPosition = p; 	this }

	/**
	 * The main content with the linked element to move in the list
	 */
	//#SWG#@ApiModelProperty(value = """The main content with the linked element to move in the list""", required = true)
	@BeanProperty
	var xcontentId: String =_
	def withxcontentId(p:String):this.type ={ 	this.xcontentId = p; 	this }

}