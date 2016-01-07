package it.newvision.nvp.xadmin.services.model.weebo
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
 * This class should be used to store additional information.
 * The name attribute is the key of the ContentMetadata class and it is locale
 * independent. Only the value fields depends on a specific locale.
 */
@XmlRootElement(name="MContentMetadata") 
@XmlType(name="MContentMetadata")
//#SWG#@ApiModel(description = """This class should be used to store additional information. 
//#SWGNL#The name attribute is the key of the ContentMetadata class and it is locale independent. Only the value fields depends on a specific locale.""")
class MContentMetadata extends Serializable {

	/**
	 * Constraints: length < 50
	 */
	//#SWG#@ApiModelProperty(value = """Constraints: length < 50""" ,required = true)
	@BeanProperty 
	var name: String =_
	def withname(p:String):MContentMetadata ={ 	this.name = p; 	this }

	/**
	 * Constraints: length < 2000000
	 */
	//#SWG#@ApiModelProperty(value = """Constraints: length < 2000000""")
	@BeanProperty 
	var value: String =_
	def withvalue(p:String):MContentMetadata ={ 	this.value = p; 	this }

	/**
	 * Locale code (ISO639-1)
	 */
	//#SWG#@ApiModelProperty(value = """Locale code (ISO639-1)""")
	@BeanProperty 
	var locale: String =_
	def withlocale(p:String):MContentMetadata ={ 	this.locale = p; 	this }

	/**
	 * @param other : MContentMetadata
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isEqual(other: MContentMetadata):Boolean ={
		 Option(other) match{
		      case Some(v) =>
		        (Option(other.name) match{
		            case Some(n) => name == n
		            case None => true
		          }) &&
		        (Option(other.locale) match{
		            case Some(l) => locale == l
		            case None => true
		          }) &&
		        (Option(other.value) match{
		            case Some(s) => value == s
		            case None => true
		          })
		      case None => false
		    }
	
	}

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		org.apache.commons.lang.StringUtils.isNotBlank(name) &&
		org.apache.commons.lang.StringUtils.length(name)<=50 &&
		org.apache.commons.lang.StringUtils.length(value)<=2000000
	}

	/**
	 * @param key : String
	 * @param value : String
	 * @param locale : String
	 * @return 
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(key: String, 
			value: String, 
			locale: String){
		this()
		this.name= key
		this.locale = locale
		this.value = value
	}

}