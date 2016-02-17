package it.newvision.nvp.xpublisher.model
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
 * This class should not be used to store information necessary to by retrieved by
 * a finder.
 * The name attribute is the key of the Metadata class and it is locale
 * independent. Only the value fields depend on a specific locale.
 */
@XmlRootElement(name="MMetadata") 
@XmlType(name="MMetadata")
//#SWG#@ApiModel(description = """This class should not be used to store information necessary to by retrieved by a finder. 
//#SWGNL#The name attribute is the key of the Metadata class and it is locale independent. Only the value fields depend on a specific locale.""")
class MMetadata extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var name: String =_
	def withname(p:String):this.type ={ 	this.name = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var value: String =_
	def withvalue(p:String):this.type ={ 	this.value = p; 	this }

	/**
	 * @param other : MMetadata
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isEqual(other: MMetadata):Boolean ={
		   Option(other) exists{ v =>
		      (Option(other.name) forall{n=> name == n}) &&
		      (Option(other.value) forall{s=> value == s})
		    }
	}

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		(name != null)
	}

	/**
	 * @param name : String
	 * @param value : String
	 * @return 
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(name: String, 
			value: String){
		this()
		this.name = name
		this.value = value
	}

}