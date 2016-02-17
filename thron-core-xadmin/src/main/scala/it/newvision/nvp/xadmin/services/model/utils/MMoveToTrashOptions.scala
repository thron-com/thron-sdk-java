package it.newvision.nvp.xadmin.services.model.utils
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MMoveToTrashOptions") 
@XmlType(name="MMoveToTrashOptions")
//#SWG#@ApiModel(description = """""")
class MMoveToTrashOptions extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var removeRatings: Boolean  = false
	def withremoveRatings(p:Boolean):this.type ={ 	this.removeRatings = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var removeLinkedContents: Boolean  = false
	def withremoveLinkedContents(p:Boolean):this.type ={ 	this.removeLinkedContents = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var removeComments: Boolean  = false
	def withremoveComments(p:Boolean):this.type ={ 	this.removeComments = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var removeCuePoints: Boolean  = false
	def withremoveCuePoints(p:Boolean):this.type ={ 	this.removeCuePoints = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var removeCustomMetadata: Boolean  = false
	def withremoveCustomMetadata(p:Boolean):this.type ={ 	this.removeCustomMetadata = p; 	this }

}