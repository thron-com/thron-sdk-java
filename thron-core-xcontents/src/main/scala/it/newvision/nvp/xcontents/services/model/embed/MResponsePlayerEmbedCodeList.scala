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
@XmlRootElement(name="MResponsePlayerEmbedCodeList") 
@XmlType(name="MResponsePlayerEmbedCodeList")
//#SWG#@ApiModel(description = """""")
class MResponsePlayerEmbedCodeList extends MResponsePlayerEmbed with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var items: List[MPlayerEmbedCodeDetail] = new ArrayList[MPlayerEmbedCodeDetail]
	def withitems(p:List[MPlayerEmbedCodeDetail]):this.type ={ 	this.items = p; 	this }

	/**
	 * Optional. Defined only for the 1st page
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Defined only for the 1st page""")
	@BeanProperty 
	var totalResults: Integer =_
	def withtotalResults(p:Integer):this.type ={ 	this.totalResults = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var nextPage: String =_
	def withnextPage(p:String):this.type ={ 	this.nextPage = p; 	this }

}