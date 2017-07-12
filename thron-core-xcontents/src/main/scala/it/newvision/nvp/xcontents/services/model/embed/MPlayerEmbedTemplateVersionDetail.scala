package it.newvision.nvp.xcontents.services.model.embed
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MMetadata

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MPlayerEmbedTemplateVersionDetail") 
@XmlType(name="MPlayerEmbedTemplateVersionDetail")
//#SWG#@ApiModel(description = """""")
class MPlayerEmbedTemplateVersionDetail extends Serializable {

	/**
	 * template version
	 */
	//#SWG#@ApiModelProperty(value = """template version""" ,required = true)
	@BeanProperty 
	var version: Integer =_
	def withversion(p:Integer):this.type ={ 	this.version = p; 	this }

	/**
	 * Optional. The owner of the PlayerEmbedTemplate
	 */
	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var createdBy: String =_
	def withcreatedBy(p:String):this.type ={ 	this.createdBy = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var createdDate: Date =_
	def withcreatedDate(p:Date):this.type ={ 	this.createdDate = p; 	this }

	/**
	 * Version notes
	 */
	//#SWG#@ApiModelProperty(value = """Version notes""")
	@BeanProperty 
	var note: String =_
	def withnote(p:String):this.type ={ 	this.note = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var playerVersion: String =_
	def withplayerVersion(p:String):this.type ={ 	this.playerVersion = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var values: List[MMetadata] = new ArrayList[MMetadata]
	def withvalues(p:List[MMetadata]):this.type ={ 	this.values = p; 	this }

	/**
	 * Custom Javascript resource URL
	 */
	//#SWG#@ApiModelProperty(value = """Custom Javascript resource URL""")
	@BeanProperty 
	var jsUrl: String =_
	def withjsUrl(p:String):this.type ={ 	this.jsUrl = p; 	this }

	/**
	 * Custom CSS resource URL
	 */
	//#SWG#@ApiModelProperty(value = """Custom CSS resource URL""")
	@BeanProperty 
	var cssUrl: String =_
	def withcssUrl(p:String):this.type ={ 	this.cssUrl = p; 	this }

	/**
	 * link to the platform template Id (CE1,CE2...) used to set the playerVersion
	 */
	//#SWG#@ApiModelProperty(value = """link to the platform template Id (CE1,CE2...) used to set the playerVersion""" ,required = true)
	@BeanProperty 
	var platformTemplateId: String =_
	def withplatformTemplateId(p:String):this.type ={ 	this.platformTemplateId = p; 	this }

	/**
	 * Optional. If missing, template latest version will be used.
	 */
	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var platformTemplateVersion: Integer =_
	def withplatformTemplateVersion(p:Integer):this.type ={ 	this.platformTemplateVersion = p; 	this }

}