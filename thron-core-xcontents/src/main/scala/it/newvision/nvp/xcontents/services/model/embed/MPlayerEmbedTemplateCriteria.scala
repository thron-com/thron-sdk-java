package it.newvision.nvp.xcontents.services.model.embed
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MPlayerEmbedTemplateCriteria") 
@XmlType(name="MPlayerEmbedTemplateCriteria")
//#SWG#@ApiModel(description = """""")
class MPlayerEmbedTemplateCriteria extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var ids: List[String] = new ArrayList[String]
	def withids(p:List[String]):this.type ={ 	this.ids = p; 	this }

	/**
	 * text search on names and description by token.
	 * Example: "red apple" text search match labels like "red ...", "apple ...", "red
	 * and Apple are..."
	 */
	//#SWG#@ApiModelProperty(value = """text search on names and description by token.
	//#SWGNL#Example: "red apple" text search match labels like "red ...", "apple ...", "red and Apple are..."""")
	@BeanProperty 
	var text: String =_
	def withtext(p:String):this.type ={ 	this.text = p; 	this }

	/**
	 * filter removed templates. Default value false
	 */
	//#SWG#@ApiModelProperty(value = """filter removed templates. Default value false""")
	@BeanProperty 
	var removed: Boolean  = false
	def withremoved(p:Boolean):this.type ={ 	this.removed = p; 	this }

	/**
	 * filter playerEmbedTemplates where I have Manage roles
	 */
	//#SWG#@ApiModelProperty(value = """filter playerEmbedTemplates where I have Manage roles""")
	@BeanProperty 
	var canBeManaged: Boolean =_
	def withcanBeManaged(p:Boolean):this.type ={ 	this.canBeManaged = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var createdBy: String =_
	def withcreatedBy(p:String):this.type ={ 	this.createdBy = p; 	this }

}