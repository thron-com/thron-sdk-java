package it.newvision.nvp.xcontents.services.model.liveEvent
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseLiveEventFindByProperties") 
@XmlType(name="MResponseLiveEventFindByProperties")
//#SWG#@ApiModel(description = """""")
class MResponseLiveEventFindByProperties extends MResponseLiveEvent with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var liveEvents: List[MLiveEventDetail] = new ArrayList[MLiveEventDetail]
	def withliveEvents(p:List[MLiveEventDetail]):this.type ={ 	this.liveEvents = p; 	this }

	/**
	 * total number of results
	 */
	//#SWG#@ApiModelProperty(value = """total number of results""" ,required = true)
	@BeanProperty 
	var totalResults: Integer  = 0
	def withtotalResults(p:Integer):this.type ={ 	this.totalResults = p; 	this }

}