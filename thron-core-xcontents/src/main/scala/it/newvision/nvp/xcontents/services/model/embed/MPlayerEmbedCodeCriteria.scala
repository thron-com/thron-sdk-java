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
@XmlRootElement(name="MPlayerEmbedCodeCriteria") 
@XmlType(name="MPlayerEmbedCodeCriteria")
//#SWG#@ApiModel(description = """""")
class MPlayerEmbedCodeCriteria extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var ids: List[String] = new ArrayList[String]
	def withids(p:List[String]):this.type ={ 	this.ids = p; 	this }

	/**
	 * text search on names by token.
	 * Example: "red apple" text search match labels like "red ...", "apple ...", "red
	 * and Apple are..."
	 */
	//#SWG#@ApiModelProperty(value = """text search on names by token.
	//#SWGNL#Example: "red apple" text search match labels like "red ...", "apple ...", "red and Apple are..."""")
	@BeanProperty 
	var text: String =_
	def withtext(p:String):this.type ={ 	this.text = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var enabled: Boolean =_
	def withenabled(p:Boolean):this.type ={ 	this.enabled = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var templateOp: MTemplateSearchOption =_
	def withtemplateOp(p:MTemplateSearchOption):this.type ={ 	this.templateOp = p; 	this }

	/**
	 * ContextId to use for tracking
	 */
	//#SWG#@ApiModelProperty(value = """ContextId to use for tracking""")
	@BeanProperty 
	var useContextId: String =_
	def withuseContextId(p:String):this.type ={ 	this.useContextId = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def validate(){
		Option(templateOp).foreach(_.validate())
	}

}