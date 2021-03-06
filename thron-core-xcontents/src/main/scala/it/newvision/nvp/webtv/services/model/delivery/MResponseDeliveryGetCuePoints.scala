package it.newvision.nvp.webtv.services.model.delivery
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MCuePoint

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseDeliveryGetCuePoints") 
@XmlType(name="MResponseDeliveryGetCuePoints")
//#SWG#@ApiModel(description = """""")
class MResponseDeliveryGetCuePoints extends MResponseDelivery with Serializable  {

	/**
	 * list of cue points
	 */
	//#SWG#@ApiModelProperty(value = """list of cue points""")
	@BeanProperty 
	var cuePoints: List[MCuePoint] = new ArrayList[MCuePoint]
	def withcuePoints(p:List[MCuePoint]):this.type ={ 	this.cuePoints = p; 	this }

	/**
	 * total number of results
	 */
	//#SWG#@ApiModelProperty(value = """total number of results""" ,required = true)
	@BeanProperty 
	var totalResults: Integer  = 0
	def withtotalResults(p:Integer):this.type ={ 	this.totalResults = p; 	this }

}