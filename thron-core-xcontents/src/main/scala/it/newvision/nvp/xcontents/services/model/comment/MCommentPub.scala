package it.newvision.nvp.xcontents.services.model.comment
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MMetadata

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MCommentPub") 
@XmlType(name="MCommentPub")
//#SWG#@ApiModel(description = """""")
class MCommentPub extends Serializable {

	/**
	 * Constraints: length < 2000
	 */
	//#SWG#@ApiModelProperty(value = """Constraints: length < 2000""" ,required = true)
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):this.type ={ 	this.description = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var userId: String =_
	def withuserId(p:String):this.type ={ 	this.userId = p; 	this }

	/**
	 * used at client side, to handle the comment status.
	 */
	//#SWG#@ApiModelProperty(value = """used at client side, to handle the comment status.""")
	@BeanProperty 
	var status: String =_
	def withstatus(p:String):this.type ={ 	this.status = p; 	this }

	/**
	 * the commentId of the comment referenced to.
	 * Used to reply to a different comment.
	 */
	//#SWG#@ApiModelProperty(value = """the commentId of the comment referenced to. 
	//#SWGNL#Used to reply to a different comment.""")
	@BeanProperty 
	var replyTo: String =_
	def withreplyTo(p:String):this.type ={ 	this.replyTo = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var metadatas: List[MMetadata] = new ArrayList[MMetadata]
	  def withmetadatas(p:List[MMetadata]):this.type ={ 	this.metadatas = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(description).exists(_.length<=2000) && 
		Option(userId).forall(_.length<=100) && 
		Option(status).forall(_.length<=50) && 
		Option(replyTo).forall(_.length<=100) && 
		Option(description).isDefined
	}

}