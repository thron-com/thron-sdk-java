package it.newvision.nvp.xpublisher.services.model.hosting
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResourceFile") 
@XmlType(name="MResourceFile")
//#SWG#@ApiModel(description = """""")
class MResourceFile extends Serializable {

	/**
	 * filename or folder name
	 */
	//#SWG#@ApiModelProperty(value = """filename or folder name""" ,required = true)
	@BeanProperty 
	var name: String =_
	def withname(p:String):this.type ={ 	this.name = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var isFolder: Boolean =_
	def withisFolder(p:Boolean):this.type ={ 	this.isFolder = p; 	this }

	/**
	 * total size of the resource.
	 */
	//#SWG#@ApiModelProperty(value = """total size of the resource.""" ,required = true)
	@BeanProperty 
	var size: Long =_
	def withsize(p:Long):this.type ={ 	this.size = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var url: String =_
	def withurl(p:String):this.type ={ 	this.url = p; 	this }

}