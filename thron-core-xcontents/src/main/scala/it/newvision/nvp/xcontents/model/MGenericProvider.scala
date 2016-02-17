package it.newvision.nvp.xcontents.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MGenericProvider") 
@XmlType(name="MGenericProvider")
//#SWG#@ApiModel(description = """""")
class MGenericProvider extends MProvider with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var providerName: String =_
	def withproviderName(p:String):this.type ={ 	this.providerName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var url: String =_
	def withurl(p:String):this.type ={ 	this.url = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		(providerName != null && url != null)
	}

}