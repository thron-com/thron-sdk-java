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
/**
 * This sort works with an fallback chain, define in your client.
 * The first language in order was the preferred language.
 * If the preferred language missed in the content, the order was evaluated with
 * the following language defined in the fallback.
 * This chain was changed with the help of our customer service.
 */
@XmlRootElement(name="MLocaleSort") 
@XmlType(name="MLocaleSort")
//#SWG#@ApiModel(description = """This sort works with an fallback chain, define in your client.
//#SWGNL#The first language in order was the preferred language.
//#SWGNL#If the preferred language missed in the content, the order was evaluated with the following language defined in the fallback.
//#SWGNL#This chain was changed with the help of our customer service.""")
class MLocaleSort extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var order: MESortOrder =_
	def withorder(p:MESortOrder):this.type ={ 	this.order = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var langPreferred: String =_
	def withlangPreferred(p:String):this.type ={ 	this.langPreferred = p; 	this }

}