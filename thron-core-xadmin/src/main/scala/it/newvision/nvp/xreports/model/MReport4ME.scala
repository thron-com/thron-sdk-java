package it.newvision.nvp.xreports.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MReport4ME") 
@XmlType(name="MReport4ME")
//#SWG#@ApiModel(description = """""")
class MReport4ME extends MReport with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var query: MQuery4ME =_
	def withquery(p:MQuery4ME):MReport4ME ={ 	this.query = p; 	this }

}