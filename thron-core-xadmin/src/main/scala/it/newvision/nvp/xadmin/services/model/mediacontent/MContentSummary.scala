package it.newvision.nvp.xadmin.services.model.mediacontent
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.model.MEContentStatus

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * The content summary object provides all necessary information about the
 * published contents or the contents not yet published in the platform.
 */
@XmlRootElement(name="MContentSummary") 
@XmlType(name="MContentSummary")
//#SWG#@ApiModel(description = """The content summary object provides all necessary information about the published contents or the contents not yet published in the platform.""")
class MContentSummary extends Serializable {

	/**
	 * it's the unique reference ID for a given MediaContent task.
	 */
	//#SWG#@ApiModelProperty(value = """it's the unique reference ID for a given MediaContent task.""" ,required = true)
	@BeanProperty 
	var mediaContentId: String =_
	def withmediaContentId(p:String):this.type ={ 	this.mediaContentId = p; 	this }

	/**
	 * it's the unique reference ID for a given MediaContent task.
	 */
	//#SWG#@ApiModelProperty(value = """it's the unique reference ID for a given MediaContent task.""" ,required = true)
	@BeanProperty 
	var xcontentId: String =_
	def withxcontentId(p:String):this.type ={ 	this.xcontentId = p; 	this }

	/**
	 * it's the unique reference ID for a given MediaContent task.
	 */
	//#SWG#@ApiModelProperty(value = """it's the unique reference ID for a given MediaContent task.""" ,required = true)
	@BeanProperty 
	var xpublishedId: String =_
	def withxpublishedId(p:String):this.type ={ 	this.xpublishedId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var status: MEContentStatus =_
	def withstatus(p:MEContentStatus):this.type ={ 	this.status = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var creationDate: Date =_
	def withcreationDate(p:Date):this.type ={ 	this.creationDate = p; 	this }

	/**
	 * the list of published channels 
	 */
	//#SWG#@ApiModelProperty(value = """the list of published channels """)
	@BeanProperty 
	var channels: List[String] = new ArrayList[String]
	def withchannels(p:List[String]):this.type ={ 	this.channels = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var contentType: String =_
	def withcontentType(p:String):this.type ={ 	this.contentType = p; 	this }

	/**
	 * The content name (in the default locale). The content name come from the
	 * xcontent services.
	 */
	//#SWG#@ApiModelProperty(value = """The content name (in the default locale). The content name come from the xcontent services.""" ,required = true)
	@BeanProperty 
	var contentname: String =_
	def withcontentname(p:String):this.type ={ 	this.contentname = p; 	this }

	/**
	 * The content owner
	 */
	//#SWG#@ApiModelProperty(value = """The content owner""" ,required = true)
	@BeanProperty 
	var owner: String =_
	def withowner(p:String):this.type ={ 	this.owner = p; 	this }

	/**
	 * The attribute shows from which solution the content has been created. This
	 * information is used to filter the contents by solution.
	 */
	//#SWG#@ApiModelProperty(value = """The attribute shows from which solution the content has been created. This information is used to filter the contents by solution.""")
	@BeanProperty 
	@Deprecated
	var solution: String =_
	@Deprecated
	def withsolution(p:String):this.type ={ 	this.solution = p; 	this }

	/**
	 * used to flag the User Generated Contents.
	 */
	//#SWG#@ApiModelProperty(value = """used to flag the User Generated Contents.""")
	@BeanProperty 
	var contentUGC: Boolean =_
	def withcontentUGC(p:Boolean):this.type ={ 	this.contentUGC = p; 	this }

	/**
	 * total amount of space used by the content in CDN and in Repository (in Bytes)
	 */
	//#SWG#@ApiModelProperty(value = """total amount of space used by the content in CDN and in Repository (in Bytes)""")
	@BeanProperty 
	var totalSpace: Long  = 0L
	def withtotalSpace(p:Long):this.type ={ 	this.totalSpace = p; 	this }

}