package it.newvision.nvp.xpackager.services.model.queue
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MDownloaderTask") 
@XmlType(name="MDownloaderTask")
//#SWG#@ApiModel(description = """""")
class MDownloaderTask extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var enqueueDate: Date =_
	def withenqueueDate(p:Date):this.type ={ 	this.enqueueDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var fileName: String =_
	def withfileName(p:String):this.type ={ 	this.fileName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var host: String =_
	def withhost(p:String):this.type ={ 	this.host = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var siteName: String =_
	def withsiteName(p:String):this.type ={ 	this.siteName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var targetSiteName: String =_
	def withtargetSiteName(p:String):this.type ={ 	this.targetSiteName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var status: String =_
	def withstatus(p:String):this.type ={ 	this.status = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var fileWaitingForBackup: Boolean  = false
	def withfileWaitingForBackup(p:Boolean):this.type ={ 	this.fileWaitingForBackup = p; 	this }

}