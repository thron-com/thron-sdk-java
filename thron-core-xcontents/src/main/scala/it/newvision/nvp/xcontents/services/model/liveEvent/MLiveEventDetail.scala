package it.newvision.nvp.xcontents.services.model.liveEvent
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MELiveEventStatus
import it.newvision.nvp.xcontents.model.MLiveEvent

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MLiveEventDetail") 
@XmlType(name="MLiveEventDetail")
//#SWG#@ApiModel(description = """""")
class MLiveEventDetail extends MLiveEvent with Serializable  {

	/**
	 * the current status of the event
	 */
	//#SWG#@ApiModelProperty(value = """the current status of the event""" ,required = true)
	@BeanProperty 
	var eventStatus: MELiveEventStatus =_
	def witheventStatus(p:MELiveEventStatus):this.type ={ 	this.eventStatus = p; 	this }

	/**
	 * @param c : MLiveEvent
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(c: MLiveEvent){
		this()
		import scala.reflect._
		import scala.collection.JavaConversions._
	
		classOf[MLiveEvent].getMethods filter {
		  m => m.getName.indexOf("_$eq") != -1
		} foreach {  m1 =>
			val getMname = m1.getName.substring(0, m1.getName.indexOf("_$eq"))
			val m1get = classOf[MLiveEvent].getMethod(getMname)
			m1.invoke(this, m1get.invoke(c))
		}
	}

}