package it.newvision.nvp.xadmin.services.model.adminconsole
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MContentPreview") 
@XmlType(name="MContentPreview")
//#SWG#@ApiModel(description = """""")
class MContentPreview extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var filename: String =_
	def withfilename(p:String):this.type ={ 	this.filename = p; 	this }

	/**
	 * url of the webservice to get the content. Example: http//<client-
	 * hostname>/resources/getpreview?filename
	 */
	//#SWG#@ApiModelProperty(value = """url of the webservice to get the content. Example: http//<client-hostname>/resources/getpreview?filename""" ,required = true)
	@BeanProperty 
	var url: String =_
	def withurl(p:String):this.type ={ 	this.url = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var siteName: String =_
	def withsiteName(p:String):this.type ={ 	this.siteName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var size: Long =_
	def withsize(p:Long):this.type ={ 	this.size = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var mimetype: String =_
	def withmimetype(p:String):this.type ={ 	this.mimetype = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var path: String =_
	def withpath(p:String):this.type ={ 	this.path = p; 	this }

}