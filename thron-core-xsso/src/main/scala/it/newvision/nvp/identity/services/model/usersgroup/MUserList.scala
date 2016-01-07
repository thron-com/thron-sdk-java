package it.newvision.nvp.identity.services.model.usersgroup
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MUserList") 
@XmlType(name="MUserList")
//#SWG#@ApiModel(description = """""")
class MUserList extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var usernames: List[String] = new ArrayList[String]
	def withusernames(p:List[String]):MUserList ={ 	this.usernames = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(usernames).exists(_.size > 0)
	}

}