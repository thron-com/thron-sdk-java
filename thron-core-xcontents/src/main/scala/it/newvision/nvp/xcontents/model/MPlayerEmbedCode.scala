package it.newvision.nvp.xcontents.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MPlayerEmbedCode") 
@XmlType(name="MPlayerEmbedCode")
//#SWG#@ApiModel(description = """""")
class MPlayerEmbedCode extends Serializable {

	/**
	 * Attention, must be unique for each single content. It is used in conjunction
	 * with a custom acl linked to the content.
	 */
	//#SWG#@ApiModelProperty(value = """Attention, must be unique for each single content. It is used in conjunction with a custom acl linked to the content.""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	/**
	 * short name or description of the embed code
	 */
	//#SWG#@ApiModelProperty(value = """short name or description of the embed code""" ,required = true)
	@BeanProperty 
	var name: String =_
	def withname(p:String):this.type ={ 	this.name = p; 	this }

	/**
	 * the id of the template defined in Client.embedTemplates.id (JClient service)
	 */
	//#SWG#@ApiModelProperty(value = """the id of the template defined in Client.embedTemplates.id (JClient service)""" ,required = true)
	@BeanProperty 
	var useTemplateId: String =_
	def withuseTemplateId(p:String):this.type ={ 	this.useTemplateId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var embedTarget: MEEmbedTargets  = MEEmbedTargets.GENERIC
	def withembedTarget(p:MEEmbedTargets):this.type ={ 	this.embedTarget = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var enabled: Boolean  = true
	def withenabled(p:Boolean):this.type ={ 	this.enabled = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var values: List[MMetadata] = new ArrayList[MMetadata]
	def withvalues(p:List[MMetadata]):this.type ={ 	this.values = p; 	this }

	/**
	 * Deprecated
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated""")
	@BeanProperty 
	@Deprecated
	var trackerGA: String =_
	@Deprecated
	def withtrackerGA(p:String):this.type ={ 	this.trackerGA = p; 	this }

	/**
	 * The contextId to use for traking.
	 */
	//#SWG#@ApiModelProperty(value = """The contextId to use for traking.""")
	@BeanProperty 
	var useContextId: String =_
	def withuseContextId(p:String):this.type ={ 	this.useContextId = p; 	this }

}