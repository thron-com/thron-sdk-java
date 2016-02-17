package it.newvision.nvp.xadmin.services.model.weebo
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.model.MFile
import it.newvision.nvp.xadmin.model.MEContentType

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MContentParams") 
@XmlType(name="MContentParams")
//#SWG#@ApiModel(description = """""")
class MContentParams extends Serializable {

	/**
	 * the source files
	 */
	//#SWG#@ApiModelProperty(value = """the source files""")
	@BeanProperty 
	var sourcefiles: List[MFile] = new ArrayList[MFile]
	def withsourcefiles(p:List[MFile]):this.type ={ 	this.sourcefiles = p; 	this }

	/**
	 * -> MContent.owner
	 */
	//#SWG#@ApiModelProperty(value = """-> MContent.owner""")
	@BeanProperty 
	var owner: String =_
	def withowner(p:String):this.type ={ 	this.owner = p; 	this }

	/**
	 * Optional. Default is the username of the user that invoke the service.
	 * -> MContent.userId
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Default is the username of the user that invoke the service.
	//#SWGNL#-> MContent.userId""")
	@BeanProperty 
	var userId: String =_
	def withuserId(p:String):this.type ={ 	this.userId = p; 	this }

	/**
	 * IMAGE/AUDIO/VIDEO/GENERIC ....
	 * -> MContent.contentType
	 * -> MediaContent.contentType
	 */
	//#SWG#@ApiModelProperty(value = """IMAGE/AUDIO/VIDEO/GENERIC ....
	//#SWGNL#-> MContent.contentType 
	//#SWGNL#-> MediaContent.contentType""" ,required = true)
	@BeanProperty 
	var contentType: MEContentType =_
	def withcontentType(p:MEContentType):this.type ={ 	this.contentType = p; 	this }

	/**
	 * Deprecated.
	 * Use this parameter to set the content solution. If attribute is not specified,
	 * VIEW is the default solution.
	 * 
	 * Saved in:
	 * -> MContent.solution
	 * -> MContent.availableSolutions
	 * -> MMEdiaContent.availableSolutions
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated.
	//#SWGNL#Use this parameter to set the content solution. If attribute is not specified, VIEW is the default solution.
	//#SWGNL#
	//#SWGNL#Saved in:
	//#SWGNL#-> MContent.solution
	//#SWGNL#-> MContent.availableSolutions
	//#SWGNL#-> MMEdiaContent.availableSolutions""")
	@BeanProperty 
	@Deprecated
	var solution: String  = "VIEW"
	@Deprecated
	def withsolution(p:String):this.type ={ 	this.solution = p; 	this }

	/**
	 * define if a content is User Generated. The UGC contents are not automatically
	 * published in CDN, but are converted, and after the validation of a moderator,
	 * can be published
	 * 
	 * Stored in:
	 * -> MContent.contentUgc
	 * -> MMediaContent.contentUgc
	 */
	//#SWG#@ApiModelProperty(value = """define if a content is User Generated. The UGC contents are not automatically published in CDN, but are converted, and after the validation of a moderator, can be published
	//#SWGNL#
	//#SWGNL#Stored in: 
	//#SWGNL#-> MContent.contentUgc
	//#SWGNL#-> MMediaContent.contentUgc""")
	@BeanProperty 
	var contentUGC: Boolean =_
	def withcontentUGC(p:Boolean):this.type ={ 	this.contentUGC = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(owner).forall(_.length<=50) &&
		Option(contentType).isDefined
	}

}