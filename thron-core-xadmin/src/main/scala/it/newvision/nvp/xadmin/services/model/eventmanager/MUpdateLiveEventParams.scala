package it.newvision.nvp.xadmin.services.model.eventmanager
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MUpdateLiveEventParams") 
@XmlType(name="MUpdateLiveEventParams")
//#SWG#@ApiModel(description = """""")
class MUpdateLiveEventParams extends Serializable {

	/**
	 * epoc date in milliseconds. Validto can be an epoc date of the past.
	 */
	//#SWG#@ApiModelProperty(value = """epoc date in milliseconds. Validto can be an epoc date of the past.""")
	@BeanProperty 
	var validTo: Long =_
	def withvalidTo(p:Long):this.type ={ 	this.validTo = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(validTo).forall(_.longValue > System.currentTimeMillis())
	}

}