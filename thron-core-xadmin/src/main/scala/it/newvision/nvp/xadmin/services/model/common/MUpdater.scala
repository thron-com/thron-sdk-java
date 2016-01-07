package it.newvision.nvp.xadmin.services.model.common
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
 * Abstract class used as template for the different "Update" classes used in
 * update services.
 */
@XmlRootElement(name="MUpdater") 
@XmlType(name="MUpdater")
//#SWG#@ApiModel(description = """Abstract class used as template for the different "Update" classes used in update services.""")
abstract class MUpdater extends Serializable {

	/**
	 * Optional. the patch operator
	 */
	//#SWG#@ApiModelProperty(value = """Optional. the patch operator""")
	@BeanProperty 
	var patch: List[MPatch] =_
	def withpatch(p:List[MPatch]):MUpdater ={ 	this.patch = p; 	this }

}