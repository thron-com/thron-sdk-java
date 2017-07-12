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
@XmlRootElement(name="MPlayerEmbedTemplateVersionValue") 
@XmlType(name="MPlayerEmbedTemplateVersionValue")
//#SWG#@ApiModel(description = """""")
class MPlayerEmbedTemplateVersionValue extends Serializable {

	/**
	 * Optional. Version notes
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Version notes""")
	@BeanProperty 
	var note: String =_
	def withnote(p:String):this.type ={ 	this.note = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var values: List[MMetadata] = new ArrayList[MMetadata]
	def withvalues(p:List[MMetadata]):this.type ={ 	this.values = p; 	this }

	/**
	 * Custom Javascript code.
	 * 
	 * Base64 String encoded with UTF-8 charset.
	 * Max size: 1MB
	 */
	//#SWG#@ApiModelProperty(value = """Custom Javascript code.
	//#SWGNL#
	//#SWGNL#Base64 String encoded with UTF-8 charset.
	//#SWGNL#Max size: 1MB""")
	@BeanProperty 
	var js: String =_
	def withjs(p:String):this.type ={ 	this.js = p; 	this }

	/**
	 * Custom CSS code.
	 * 
	 * Base64 String encoded with UTF-8 charset.
	 * Max size: 1MB
	 */
	//#SWG#@ApiModelProperty(value = """Custom CSS code.
	//#SWGNL#
	//#SWGNL#Base64 String encoded with UTF-8 charset.
	//#SWGNL#Max size: 1MB""")
	@BeanProperty 
	var css: String =_
	def withcss(p:String):this.type ={ 	this.css = p; 	this }

	/**
	 * Optional. If missing, template latest version will be used.
	 */
	//#SWG#@ApiModelProperty(value = """Optional. If missing, template latest version will be used.""")
	@BeanProperty 
	var platformTemplateVersion: Integer =_
	def withplatformTemplateVersion(p:Integer):this.type ={ 	this.platformTemplateVersion = p; 	this }

}