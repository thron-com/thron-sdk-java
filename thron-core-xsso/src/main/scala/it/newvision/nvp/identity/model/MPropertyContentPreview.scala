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
@XmlRootElement(name="MPropertyContentPreview") 
@XmlType(name="MPropertyContentPreview")
//#SWG#@ApiModel(description = """""")
class MPropertyContentPreview extends Serializable {

	/**
	 * The Id of the REST we service that return the content ready to publish but not
	 * yet published in the CDN
	 */
	//#SWG#@ApiModelProperty(value = """The Id of the REST we service that return the content ready to publish but not yet published in the CDN""" ,required = true)
	@BeanProperty 
	var serviceName: String  = "preview"
	def withserviceName(p:String):MPropertyContentPreview ={ 	this.serviceName = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init(){

	}

}