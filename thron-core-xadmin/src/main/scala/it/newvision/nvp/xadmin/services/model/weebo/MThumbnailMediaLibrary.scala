package it.newvision.nvp.xadmin.services.model.weebo
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MThumbnailMediaLibrary") 
@XmlType(name="MThumbnailMediaLibrary")
//#SWG#@ApiModel(description = """""")
class MThumbnailMediaLibrary extends Serializable {

	/**
	 * thumbnail reference id
	 */
	//#SWG#@ApiModelProperty(value = """thumbnail reference id""" ,required = true)
	@BeanProperty 
	var thumbnailId: String =_
	def withthumbnailId(p:String):MThumbnailMediaLibrary ={ 	this.thumbnailId = p; 	this }

}