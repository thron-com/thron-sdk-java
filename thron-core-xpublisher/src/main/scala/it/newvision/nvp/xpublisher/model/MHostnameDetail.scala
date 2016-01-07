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
@XmlRootElement(name="MHostnameDetail") 
@XmlType(name="MHostnameDetail")
//#SWG#@ApiModel(description = """""")
class MHostnameDetail extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var hostname: String =_
	def withhostname(p:String):MHostnameDetail ={ 	this.hostname = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var hostnameType: MEHostnameType =_
	def withhostnameType(p:MEHostnameType):MHostnameDetail ={ 	this.hostnameType = p; 	this }

	/**
	 * @param hostname : String
	 * @param hostnameType : MEHostnameType
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(hostname: String, 
			hostnameType: MEHostnameType){
		this()
		this.hostname = hostname
		this.hostnameType = hostnameType
	}

}