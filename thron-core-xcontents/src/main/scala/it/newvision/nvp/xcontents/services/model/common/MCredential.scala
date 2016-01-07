package it.newvision.nvp.xcontents.services.model.common
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
 * this class was used to pass the clientId information the services.
 */
@XmlRootElement(name="MCredential") 
@XmlType(name="MCredential")
//#SWG#@ApiModel(description = """this class was used to pass the clientId information the services.""")
class MCredential extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):MCredential ={ 	this.clientId = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		!(this.clientId==null)
	}

	/**
	 * @param id : String
	 * @return 
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(id: String){
		this()
		this.clientId = id
	}

}