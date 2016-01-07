package it.newvision.nvp.xadmin.services.model.mediacontent
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
 * The MediaContentUpdate keep all information that can be updated into the
 * MediaContent object.
 */
@XmlRootElement(name="MMediaContentUpdate") 
@XmlType(name="MMediaContentUpdate")
//#SWG#@ApiModel(description = """The MediaContentUpdate keep all information that can be updated into the MediaContent object.""")
class MMediaContentUpdate extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var creationDate: Date =_
	def withcreationDate(p:Date):MMediaContentUpdate ={ 	this.creationDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var owner: String =_
	def withowner(p:String):MMediaContentUpdate ={ 	this.owner = p; 	this }

}