package it.newvision.nvp.webtv.services.model.sync
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MSyncUpdatedContentResult") 
@XmlType(name="MSyncUpdatedContentResult")
//#SWG#@ApiModel(description = """""")
class MSyncUpdatedContentResult extends MSyncExportResult with Serializable  {

	/**
	 * used to show whether the content has been removed from the platform.
	 */
	//#SWG#@ApiModelProperty(value = """used to show whether the content has been removed from the platform.""")
	@BeanProperty 
	var removed: Boolean =_
	def withremoved(p:Boolean):this.type ={ 	this.removed = p; 	this }

}