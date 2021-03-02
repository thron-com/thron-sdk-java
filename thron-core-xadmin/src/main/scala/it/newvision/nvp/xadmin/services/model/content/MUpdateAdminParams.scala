package it.newvision.nvp.xadmin.services.model.content
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MUpdateAdminParams") 
@XmlType(name="MUpdateAdminParams")
//#SWG#@ApiModel(description = """""")
class MUpdateAdminParams extends MPublishGenericParams with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var preserveThumb: Boolean =_
	def withpreserveThumb(p:Boolean):this.type ={ 	this.preserveThumb = p; 	this }

}