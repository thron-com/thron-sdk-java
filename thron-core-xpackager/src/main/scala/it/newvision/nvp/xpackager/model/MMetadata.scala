package it.newvision.nvp.xpackager.model
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
 * This class should not be used to store information necessary to be retrieved by
 * a finder.
 * The name attribute is the key of the Metadata class.
 */
@XmlRootElement(name="MMetadata") 
@XmlType(name="MMetadata")
//#SWG#@ApiModel(description = """This class should not be used to store information necessary to be retrieved by a finder. 
//#SWGNL#The name attribute is the key of the Metadata class.""")
class MMetadata extends Serializable {

	/**
	 * Constraints: length <= 50 
	 */
	//#SWG#@ApiModelProperty(value = """Constraints: length <= 50 """ ,required = true)
	@BeanProperty 
	var key: String =_
	def withkey(p:String):this.type ={ 	this.key = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var value: String =_
	def withvalue(p:String):this.type ={ 	this.value = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(key).exists(_.length<=50)
	}

	/**
	 * @param key : String
	 * @param value : String
	 * @return 
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(key: String, 
			value: String){
		this()
		this.key= key
		this.value = value
	}

}