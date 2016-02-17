package it.newvision.nvp.xcontents.services.model.comment
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MComment

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * comment information detail with the additional information about the contentId
 */
@XmlRootElement(name="MCommentDetail") 
@XmlType(name="MCommentDetail")
//#SWG#@ApiModel(description = """comment information detail with the additional information about the contentId""")
class MCommentDetail extends MComment with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var contentId: String =_
	def withcontentId(p:String):this.type ={ 	this.contentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var contentName: String =_
	def withcontentName(p:String):this.type ={ 	this.contentName = p; 	this }

	/**
	 * @param c : MComment
	 * @param contentId : String
	 * @param contentName : String
	 * @return 
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(c: MComment, 
			contentId: String, 
			contentName: String){
		this()
		this.contentId = contentId
		this.contentName = contentName
		this.id = c.id
		this.description = c.description
		this.userId = c.userId
		this.status = c.status
		this.replyTo = c.replyTo
		this.creationDate = c.creationDate
		this.metadatas = c.metadatas
		this.moderationDetail = c.moderationDetail
	
	
	
	
	}

}