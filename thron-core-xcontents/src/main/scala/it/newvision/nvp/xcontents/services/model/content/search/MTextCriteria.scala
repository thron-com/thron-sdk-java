package it.newvision.nvp.xcontents.services.model.content.search
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MTextCriteria") 
@XmlType(name="MTextCriteria")
//#SWG#@ApiModel(description = """""")
class MTextCriteria extends Serializable {

	/**
	 * Required.
	 */
	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var lang: String =_
	def withlang(p:String):this.type ={ 	this.lang = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var text: String =_
	def withtext(p:String):this.type ={ 	this.text = p; 	this }

	/**
	 * phrase_match, all_word_match
	 */
	//#SWG#@ApiModelProperty(value = """phrase_match, all_word_match""" ,required = true)
	@BeanProperty 
	var textMatch: METextMatch =_
	def withtextMatch(p:METextMatch):this.type ={ 	this.textMatch = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		true
	}

}