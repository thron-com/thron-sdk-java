package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.common.MCredential
import it.newvision.nvp.xcontents.model.MCategory4Locale
import it.newvision.nvp.xcontents.services.model.category.MCategoryUpdate

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JCategory.createCategory
 */
@XmlRootElement(name="MCategorycreateCategoryReq")
@XmlType(name="MCategorycreateCategoryReq")
//#SWG#@ApiModel(description = "Request message for service JCategory.createCategory")
class MCategorycreateCategoryReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var client: MCredential =_
	def withclient(p:MCredential):this.type ={ 	this.client = p; 	this }

	/**
	 * Optional. Id or prettyId of the parent category.
	 * Used to create categories with a tree structure.
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Id or prettyId of the parent category. 
	//#SWGNL#Used to create categories with a tree structure.""", required = true)
	@BeanProperty
	var upCatId: String =_
	def withupCatId(p:String):this.type ={ 	this.upCatId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var catLocales: MCategory4Locale =_
	def withcatLocales(p:MCategory4Locale):this.type ={ 	this.catLocales = p; 	this }

	/**
	 * Deprecated
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated""", required = true)
	@BeanProperty
	var solution: String =_
	def withsolution(p:String):this.type ={ 	this.solution = p; 	this }

	/**
	 * Optional.
	 * Init values for the category
	 */
	//#SWG#@ApiModelProperty(value = """Optional.
	//#SWGNL#Init values for the category""", required = true)
	@BeanProperty
	var options: MCategoryUpdate =_
	def withoptions(p:MCategoryUpdate):this.type ={ 	this.options = p; 	this }

}