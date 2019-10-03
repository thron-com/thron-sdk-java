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
 * Visitor User Full Name class
 */
@XmlRootElement(name="MFullName") 
@XmlType(name="MFullName")
//#SWG#@ApiModel(description = """Visitor User Full Name class""")
class MFullName extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var firstName: String =_
	def withfirstName(p:String):this.type ={ 	this.firstName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var lastName: String =_
	def withlastName(p:String):this.type ={ 	this.lastName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var middleName: String =_
	def withmiddleName(p:String):this.type ={ 	this.middleName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var prefix: String =_
	def withprefix(p:String):this.type ={ 	this.prefix = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var suffix: String =_
	def withsuffix(p:String):this.type ={ 	this.suffix = p; 	this }

	/**
	 * @return String
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def displayName():String ={
		var result:String = ""
		if (org.apache.commons.lang.StringUtils.isNotBlank(this.prefix)) result = result + prefix
		if (org.apache.commons.lang.StringUtils.isNotBlank(this.firstName)) result = result + " "+firstName
		if (org.apache.commons.lang.StringUtils.isNotBlank(this.middleName)) result = result + " "+middleName
		if (org.apache.commons.lang.StringUtils.isNotBlank(this.lastName)) result = result + " "+lastName
		if (org.apache.commons.lang.StringUtils.isNotBlank(this.suffix)) result = result + " "+suffix
		result.trim
	}

}