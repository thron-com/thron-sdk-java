package it.newvision.nvp.identity.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MMailAddress") 
@XmlType(name="MMailAddress")
//#SWG#@ApiModel(description = """""")
class MMailAddress extends Serializable {

	/**
	 * HOME/WORK/PRIVATE...
	 */
	//#SWG#@ApiModelProperty(value = """HOME/WORK/PRIVATE...""")
	@BeanProperty 
	var emailCategory: String =_
	def withemailCategory(p:String):MMailAddress ={ 	this.emailCategory = p; 	this }

	/**
	 * A valid e-mail address
	 * Constraints:
	 * -) max lenght = 1000
	 * -) valid email format
	 */
	//#SWG#@ApiModelProperty(value = """A valid e-mail address
	//#SWGNL#Constraints: 
	//#SWGNL#-) max lenght = 1000
	//#SWGNL#-) valid email format""" ,required = true)
	@BeanProperty 
	var email: String =_
	def withemail(p:String):MMailAddress ={ 	this.email = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(this.email).forall(_.matches("""(?i)^.+@.+\..+$""")) &&
		org.apache.commons.lang.StringUtils.length(this.email)<=1000
	}

}