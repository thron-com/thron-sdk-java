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
/**
 * Basic User Detail class.
 */
@XmlRootElement(name="MUserDetail") 
@XmlType(name="MUserDetail")
//#SWG#@ApiModel(description = """Basic User Detail class.""")
class MUserDetail extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var firstname: String =_
	def withfirstname(p:String):this.type ={ 	this.firstname = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var lastname: String =_
	def withlastname(p:String):this.type ={ 	this.lastname = p; 	this }

	/**
	 * A valid e-mail address
	 * Constraints:
	 * -) max lenght = 1000
	 * -) valid email format
	 */
	//#SWG#@ApiModelProperty(value = """A valid e-mail address
	//#SWGNL#Constraints:
	//#SWGNL#-) max lenght = 1000
	//#SWGNL#-) valid email format""")
	@BeanProperty 
	var email: String =_
	def withemail(p:String):this.type ={ 	this.email = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var phoneNumber: String =_
	def withphoneNumber(p:String):this.type ={ 	this.phoneNumber = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var image: MImage =_
	def withimage(p:MImage):this.type ={ 	this.image = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var metadatas: List[MMetadata] = new ArrayList[MMetadata]
	  def withmetadatas(p:List[MMetadata]):this.type ={ 	this.metadatas = p; 	this }

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