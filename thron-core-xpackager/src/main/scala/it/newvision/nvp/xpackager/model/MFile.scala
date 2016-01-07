package it.newvision.nvp.xpackager.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MFile") 
@XmlType(name="MFile")
//#SWG#@ApiModel(description = """""")
class MFile extends Serializable {

	/**
	 * the unique id of the object in the platform.
	 */
	//#SWG#@ApiModelProperty(value = """the unique id of the object in the platform.""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):MFile ={ 	this.id = p; 	this }

	/**
	 * limited to 64 characters.
	 * filename with extension (example myimage.jpg)
	 */
	//#SWG#@ApiModelProperty(value = """limited to 64 characters.
	//#SWGNL#filename with extension (example myimage.jpg)""" ,required = true)
	@BeanProperty 
	var fileName: String =_
	def withfileName(p:String):MFile ={ 	this.fileName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var path: String =_
	def withpath(p:String):MFile ={ 	this.path = p; 	this }

	/**
	 * Deprecated
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated""")
	@BeanProperty 
	var host: String =_
	def withhost(p:String):MFile ={ 	this.host = p; 	this }

	/**
	 * The site name where the file is stored. site_1, site_2...
	 */
	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var siteName: String =_
	def withsiteName(p:String):MFile ={ 	this.siteName = p; 	this }

	/**
	 * epoc format.
	 */
	//#SWG#@ApiModelProperty(value = """epoc format.""")
	@BeanProperty 
	var modifiedDate: Long =_
	def withmodifiedDate(p:Long):MFile ={ 	this.modifiedDate = p; 	this }

	/**
	 * in bytes
	 */
	//#SWG#@ApiModelProperty(value = """in bytes""")
	@BeanProperty 
	var totalSpace: Long =_
	def withtotalSpace(p:Long):MFile ={ 	this.totalSpace = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var mimetype: String  = ""
	def withmimetype(p:String):MFile ={ 	this.mimetype = p; 	this }

	/**
	 * used to specify where the file is ready for each single site.
	 */
	//#SWG#@ApiModelProperty(value = """used to specify where the file is ready for each single site.""")
	@BeanProperty 
	var availableOnSites: List[MFileOnSite] = new ArrayList[MFileOnSite]
	def withavailableOnSites(p:List[MFileOnSite]):MFile ={ 	this.availableOnSites = p; 	this }

	/**
	 * used to mark if the file is in the platform or has been removed.
	 */
	//#SWG#@ApiModelProperty(value = """used to mark if the file is in the platform or has been removed.""")
	@BeanProperty 
	var removed: Boolean =_
	def withremoved(p:Boolean):MFile ={ 	this.removed = p; 	this }

	/**
	 * Used to save the time when the file is marked REMOVED
	 */
	//#SWG#@ApiModelProperty(value = """Used to save the time when the file is marked REMOVED""")
	@BeanProperty 
	var removeDate: Date =_
	def withremoveDate(p:Date):MFile ={ 	this.removeDate = p; 	this }

	/**
	 * Optional.
	 * The username of the user who uploaded the file in platform.
	 * Saved by platform during the "addFileToPlatform" process.
	 */
	//#SWG#@ApiModelProperty(value = """Optional. 
	//#SWGNL#The username of the user who uploaded the file in platform.
	//#SWGNL#Saved by platform during the "addFileToPlatform" process.""")
	@BeanProperty 
	var userId: String =_
	def withuserId(p:String):MFile ={ 	this.userId = p; 	this }

	/**
	 * creation Date in the Platform
	 */
	//#SWG#@ApiModelProperty(value = """creation Date in the Platform""")
	@BeanProperty 
	var creationDate: Date  = new Date()
	def withcreationDate(p:Date):MFile ={ 	this.creationDate = p; 	this }

	/**
	 * @param fileName : String
	 * @param siteName : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(fileName: String, 
			siteName: String){
		this()
		this.fileName = fileName
		this.siteName = siteName
	
	}

	/**
	 * @param fileName : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(fileName: String){
		this()
		this.fileName = fileName
	
	}

	/**
	 * @return MEFileStatus
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def getGlobalStatus():MEFileStatus ={
		import collection.JavaConversions._
		if(availableOnSites.exists(_.status == MEFileStatus.READY)) MEFileStatus.READY
		else if(availableOnSites.exists(_.status == MEFileStatus.IN_DOWNLOAD)) MEFileStatus.IN_DOWNLOAD
		else MEFileStatus.ERROR
	}

}