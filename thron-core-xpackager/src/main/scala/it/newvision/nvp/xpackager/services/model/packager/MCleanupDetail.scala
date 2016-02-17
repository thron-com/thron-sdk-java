package it.newvision.nvp.xpackager.services.model.packager
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MCleanupDetail") 
@XmlType(name="MCleanupDetail")
//#SWG#@ApiModel(description = """""")
class MCleanupDetail extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var deletedIngestionsFolders: Integer =_
	def withdeletedIngestionsFolders(p:Integer):this.type ={ 	this.deletedIngestionsFolders = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var deletedPackagedFolders: Integer =_
	def withdeletedPackagedFolders(p:Integer):this.type ={ 	this.deletedPackagedFolders = p; 	this }

}