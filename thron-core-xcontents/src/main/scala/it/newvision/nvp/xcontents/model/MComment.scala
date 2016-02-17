package it.newvision.nvp.xcontents.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MComment") 
@XmlType(name="MComment")
//#SWG#@ApiModel(description = """""")
class MComment extends Serializable {

	/**
	 * Constraints: length <= 2000
	 */
	//#SWG#@ApiModelProperty(value = """Constraints: length <= 2000""" ,required = true)
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):this.type ={ 	this.description = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var id: String  = java.util.UUID.randomUUID.toString
	def withid(p:String):this.type ={ 	this.id = p; 	this }

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
	 * the commentId of the comment refenrenced to.
	 * Used to reply to a different comment.
	 */
	//#SWG#@ApiModelProperty(value = """the commentId of the comment refenrenced to. 
	//#SWGNL#Used to reply to a different comment.""")
	@BeanProperty 
	var replyTo: String =_
	def withreplyTo(p:String):this.type ={ 	this.replyTo = p; 	this }

	/**
	 * comment creation date.
	 */
	//#SWG#@ApiModelProperty(value = """comment creation date.""")
	@BeanProperty 
	var creationDate: Date =_
	def withcreationDate(p:Date):this.type ={ 	this.creationDate = p; 	this }

	/**
	 * the field indicates that the comment should be moderated or not.
	 */
	//#SWG#@ApiModelProperty(value = """the field indicates that the comment should be moderated or not.""")
	@BeanProperty 
	var moderationDetail: MModeration  = new MModeration
	def withmoderationDetail(p:MModeration):this.type ={ 	this.moderationDetail = p; 	this }

	/**
	 * custom additional information linked to a comment
	 */
	@BeanProperty
	//#SWG#@ApiModelProperty(value = """custom additional information linked to a comment""")
	var metadatas: List[MMetadata] = new ArrayList[MMetadata]
	  def withmetadatas(p:List[MMetadata]):this.type ={ 	this.metadatas = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(description).exists(_.length<=2000) && 
		Option(userId).forall(_.length<=50) && 
		Option(status).forall(_.length<=50) && 
		Option(replyTo).forall(_.length<=50) && 
		Option(description).isDefined
	}

	/**
	 * @param userId : String
	 * @param description : String
	 * @param status : String
	 * @param replyTo : String
	 * @return 
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(userId: String, 
			description: String, 
			status: String, 
			replyTo: String){
		this()
		this.userId= userId
		this.description = description
		this.status = status
		this.replyTo = replyTo
		this.creationDate = new Date
	
	}

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def statusIsApproved():Boolean ={
		Option(this.moderationDetail).exists(m=> m.status == MEModerationStatus.APPROVED)
	}

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def statusIsPending():Boolean ={
		Option(this.moderationDetail).forall(m=> m.status == MEModerationStatus.PENDING)
	}

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def statusIsUnApproved():Boolean ={
		Option(this.moderationDetail).exists(m=> m.status == MEModerationStatus.UNAPPROVED)
	}

}