package it.newvision.nvp.xadmin.services.model.apps
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.model.MSnippet

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseSnippetLogin") 
@XmlType(name="MResponseSnippetLogin")
//#SWG#@ApiModel(description = """""")
class MResponseSnippetLogin extends MResponseApp with Serializable  {

	/**
	 * the identifier of the linked App
	 */
	//#SWG#@ApiModelProperty(value = """the identifier of the linked App""" ,required = true)
	@BeanProperty 
	var appId: String =_
	def withappId(p:String):this.type ={ 	this.appId = p; 	this }

	/**
	 * the application token Id to use with subsequent calls
	 */
	//#SWG#@ApiModelProperty(value = """the application token Id to use with subsequent calls""")
	@BeanProperty 
	var appUserTokenId: String =_
	def withappUserTokenId(p:String):this.type ={ 	this.appUserTokenId = p; 	this }

	/**
	 * the root category Id for the App.
	 * The App will use only the contents linked to the specified category tree.
	 */
	//#SWG#@ApiModelProperty(value = """the root category Id for the App.
	//#SWGNL#The App will use only the contents linked to the specified category tree.""")
	@BeanProperty 
	var rootCategoryId: String =_
	def withrootCategoryId(p:String):this.type ={ 	this.rootCategoryId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var snippet: MSnippet =_
	def withsnippet(p:MSnippet):this.type ={ 	this.snippet = p; 	this }

}