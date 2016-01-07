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

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var snippet: MSnippet =_
	def withsnippet(p:MSnippet):MResponseSnippetLogin ={ 	this.snippet = p; 	this }

	/**
	 * the identifier of the linked App
	 */
	//#SWG#@ApiModelProperty(value = """the identifier of the linked App""" ,required = true)
	@BeanProperty 
	var appId: String =_
	def withappId(p:String):MResponseSnippetLogin ={ 	this.appId = p; 	this }

	/**
	 * the new 4me tokenId to use inside the snippet calls
	 */
	//#SWG#@ApiModelProperty(value = """the new 4me tokenId to use inside the snippet calls""")
	@BeanProperty 
	var appUserTokenId: String =_
	def withappUserTokenId(p:String):MResponseSnippetLogin ={ 	this.appUserTokenId = p; 	this }

	/**
	 * the root category Id for the App.
	 * The App will use only the contents linked to the specified category tree.
	 */
	//#SWG#@ApiModelProperty(value = """the root category Id for the App.
	//#SWGNL#The App will use only the contents linked to the specified category tree.""")
	@BeanProperty 
	var rootCategoryId: String =_
	def withrootCategoryId(p:String):MResponseSnippetLogin ={ 	this.rootCategoryId = p; 	this }

}