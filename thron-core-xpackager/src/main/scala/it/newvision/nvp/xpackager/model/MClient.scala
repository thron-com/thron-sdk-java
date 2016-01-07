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
@XmlRootElement(name="MClient") 
@XmlType(name="MClient")
//#SWG#@ApiModel(description = """""")
class MClient extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):MClient ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var packages: List[MPackagedContent] = new ArrayList[MPackagedContent]
	def withpackages(p:List[MPackagedContent]):MClient ={ 	this.packages = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var thumbnails: List[MThumbnail] = new ArrayList[MThumbnail]
	  def withthumbnails(p:List[MThumbnail]):MClient ={ 	this.thumbnails = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var repositoryFiles: List[MFile] = new ArrayList[MFile]
	  def withrepositoryFiles(p:List[MFile]):MClient ={ 	this.repositoryFiles = p; 	this }

}