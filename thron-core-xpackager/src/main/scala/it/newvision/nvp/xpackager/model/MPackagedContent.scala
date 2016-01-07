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
/**
 * ingested content, converted.
 * The packagedcontent is stored in a folder with name like the packagedId
 */
@XmlRootElement(name="MPackagedContent") 
@XmlType(name="MPackagedContent")
//#SWG#@ApiModel(description = """ingested content, converted.
//#SWGNL#The packagedcontent is stored in a folder with name like the packagedId""")
class MPackagedContent extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var packagedId: String =_
	def withpackagedId(p:String):MPackagedContent ={ 	this.packagedId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var contentId: String =_
	def withcontentId(p:String):MPackagedContent ={ 	this.contentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var descriptor: String =_
	def withdescriptor(p:String):MPackagedContent ={ 	this.descriptor = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var status: MEPackagedStatus =_
	def withstatus(p:MEPackagedStatus):MPackagedContent ={ 	this.status = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var creationDate: Date =_
	def withcreationDate(p:Date):MPackagedContent ={ 	this.creationDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var outputFolder: MFolder =_
	def withoutputFolder(p:MFolder):MPackagedContent ={ 	this.outputFolder = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var startTime: Date =_
	def withstartTime(p:Date):MPackagedContent ={ 	this.startTime = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var endTime: Date =_
	def withendTime(p:Date):MPackagedContent ={ 	this.endTime = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var packagedHost: String =_
	def withpackagedHost(p:String):MPackagedContent ={ 	this.packagedHost = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var isRemoved: Boolean  = false
	def withisRemoved(p:Boolean):MPackagedContent ={ 	this.isRemoved = p; 	this }

	/**
	 * the list of linked ingestions ID used to remove the linked ingestion when
	 * necessary. 
	 */
	//#SWG#@ApiModelProperty(value = """the list of linked ingestions ID used to remove the linked ingestion when necessary. """)
	@BeanProperty 
	var ingestionsId: List[String] = new ArrayList[String]
	def withingestionsId(p:List[String]):MPackagedContent ={ 	this.ingestionsId = p; 	this }

	/**
	 * The percentage of completion task.
	 */
	//#SWG#@ApiModelProperty(value = """The percentage of completion task.""" ,required = true)
	@BeanProperty 
	var stateOfProgress: Integer  = 0
	def withstateOfProgress(p:Integer):MPackagedContent ={ 	this.stateOfProgress = p; 	this }

}