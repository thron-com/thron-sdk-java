package it.newvision.nvp.xcontents.services.model.category
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MCategory
import it.newvision.nvp.xcontents.model.MCategoryUserSpecificProperties

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MCategoryResult") 
@XmlType(name="MCategoryResult")
//#SWG#@ApiModel(description = """""")
class MCategoryResult extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var category: MCategory =_
	def withcategory(p:MCategory):MCategoryResult ={ 	this.category = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var userSpecificValues: MCategoryUserSpecificProperties =_
	def withuserSpecificValues(p:MCategoryUserSpecificProperties):MCategoryResult ={ 	this.userSpecificValues = p; 	this }

	/**
	 * total number of contents linked to the category (based on ACL rules)
	 */
	//#SWG#@ApiModelProperty(value = """total number of contents linked to the category (based on ACL rules)""")
	@BeanProperty 
	var numberOfContents: Integer =_
	def withnumberOfContents(p:Integer):MCategoryResult ={ 	this.numberOfContents = p; 	this }

	/**
	 * number of contents not read by the user in the category
	 */
	//#SWG#@ApiModelProperty(value = """number of contents not read by the user in the category""")
	@BeanProperty 
	var numberOfUnreadContents: Integer =_
	def withnumberOfUnreadContents(p:Integer):MCategoryResult ={ 	this.numberOfUnreadContents = p; 	this }

	/**
	 * number of contents not read by the user in the sub-categories
	 */
	//#SWG#@ApiModelProperty(value = """number of contents not read by the user in the sub-categories""")
	@BeanProperty 
	var numberOfUnreadContentsInSubCategories: Integer =_
	def withnumberOfUnreadContentsInSubCategories(p:Integer):MCategoryResult ={ 	this.numberOfUnreadContentsInSubCategories = p; 	this }

	/**
	 * number of child Categories
	 */
	//#SWG#@ApiModelProperty(value = """number of child Categories""")
	@BeanProperty 
	var numberOfSubCategories: Integer =_
	def withnumberOfSubCategories(p:Integer):MCategoryResult ={ 	this.numberOfSubCategories = p; 	this }

	/**
	 * the fullname of the category's owner (based on acl)
	 */
	//#SWG#@ApiModelProperty(value = """the fullname of the category's owner (based on acl)""")
	@BeanProperty 
	var ownerFullname: String =_
	def withownerFullname(p:String):MCategoryResult ={ 	this.ownerFullname = p; 	this }

}