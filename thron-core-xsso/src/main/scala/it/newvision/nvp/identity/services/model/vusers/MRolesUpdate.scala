package it.newvision.nvp.identity.services.model.vusers
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MRolesUpdate") 
@XmlType(name="MRolesUpdate")
//#SWG#@ApiModel(description = """""")
class MRolesUpdate extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var roles: List[String] = new ArrayList[String]
	def withroles(p:List[String]):this.type ={ 	this.roles = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import scala.collection.JavaConversions._
		Option(roles).exists(_.nonEmpty)
	}

}