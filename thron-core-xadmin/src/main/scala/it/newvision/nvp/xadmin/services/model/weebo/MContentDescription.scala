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
/**
 * Used to update the content information of the published content.
 */
@XmlRootElement(name="MContentDescription") 
@XmlType(name="MContentDescription")
//#SWG#@ApiModel(description = """Used to update the content information of the published content.""")
class MContentDescription extends Serializable {

	/**
	 * Follows the MContent4Locale.description constraints (length < 150)
	 */
	//#SWG#@ApiModelProperty(value = """Follows the MContent4Locale.description constraints (length < 150)""" ,required = true)
	@BeanProperty 
	var name: String =_
	def withname(p:String):this.type ={ 	this.name = p; 	this }

	/**
	 * Follows the MContent4Locale.description constraints (length < 10000)
	 */
	//#SWG#@ApiModelProperty(value = """Follows the MContent4Locale.description constraints (length < 10000)""")
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):this.type ={ 	this.description = p; 	this }

	/**
	 * summary of the content.
	 * Follows the MContent4Locale.excerpt constraints (length < 500)
	 */
	//#SWG#@ApiModelProperty(value = """summary of the content.
	//#SWGNL#Follows the MContent4Locale.excerpt constraints (length < 500)""")
	@BeanProperty 
	var excerpt: String =_
	def withexcerpt(p:String):this.type ={ 	this.excerpt = p; 	this }

	/**
	 * desired prettyId for the content and locale. See reference xcontent.MPrettyId
	 */
	//#SWG#@ApiModelProperty(value = """desired prettyId for the content and locale. See reference xcontent.MPrettyId""")
	@BeanProperty 
	var prettyId: String =_
	def withprettyId(p:String):this.type ={ 	this.prettyId = p; 	this }

	/**
	 * Locale code (ISO639-1)
	 */
	//#SWG#@ApiModelProperty(value = """Locale code (ISO639-1)""" ,required = true)
	@BeanProperty 
	var locale: String =_
	def withlocale(p:String):this.type ={ 	this.locale = p; 	this }

	/**
	 * not required. 
	 */
	//#SWG#@ApiModelProperty(value = """not required. """)
	@BeanProperty 
	var categoryId: String =_
	def withcategoryId(p:String):this.type ={ 	this.categoryId = p; 	this }

	/**
	 * Optional. List of tags as comma separated values.
	 */
	//#SWG#@ApiModelProperty(value = """Optional. List of tags as comma separated values.""")
	@BeanProperty 
	var tags: String =_
	def withtags(p:String):this.type ={ 	this.tags = p; 	this }

	/**
	 * Default empty. Used only for UGC Contents. This should be the username of owner.
	 * The field is mapped in MContent.userId
	 */
	//#SWG#@ApiModelProperty(value = """Default empty. Used only for UGC Contents. This should be the username of owner. The field is mapped in MContent.userId""")
	@BeanProperty 
	@Deprecated
	var userId: String =_
	@Deprecated
	def withuserId(p:String):this.type ={ 	this.userId = p; 	this }

	/**
	 * The display name of the Author. Free text used to show the full name of the
	 * author. The field is mapped in MContent.owner
	 */
	//#SWG#@ApiModelProperty(value = """The display name of the Author. Free text used to show the full name of the author. The field is mapped in MContent.owner""")
	@BeanProperty 
	var owner: String =_
	def withowner(p:String):this.type ={ 	this.owner = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	@Deprecated
	var metadata: List[MContentMetadata] = new ArrayList[MContentMetadata]
	@Deprecated
	def withmetadata(p:List[MContentMetadata]):this.type ={ 	this.metadata = p; 	this }

	/**
	 * values belonging to MEContentProperties (xcontent component), like:
	 * UNLINKABLE, RATINGALLOWED
	 */
	//#SWG#@ApiModelProperty(value = """values belonging to MEContentProperties (xcontent component), like:
	//#SWGNL#UNLINKABLE, RATINGALLOWED""")
	@BeanProperty 
	var properties: List[String] = new ArrayList[String]
	def withproperties(p:List[String]):this.type ={ 	this.properties = p; 	this }

}