package it.newvision.nvp.xcontents.services.model.playlist
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MPlaylistItem") 
@XmlType(name="MPlaylistItem")
//#SWG#@ApiModel(description = """""")
class MPlaylistItem extends Serializable {

	/**
	 * a contentId element
	 */
	//#SWG#@ApiModelProperty(value = """a contentId element""" ,required = true)
	@BeanProperty 
	var xcontentId: String =_
	def withxcontentId(p:String):MPlaylistItem ={ 	this.xcontentId = p; 	this }

	/**
	 * Desired position of the element in playlist. If empty the element is enqueued.
	 */
	//#SWG#@ApiModelProperty(value = """Desired position of the element in playlist. If empty the element is enqueued.""")
	@BeanProperty 
	var position: Integer =_
	def withposition(p:Integer):MPlaylistItem ={ 	this.position = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(xcontentId).isDefined
	}

}