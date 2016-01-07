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
@XmlRootElement(name="MPropertyEvents") 
@XmlType(name="MPropertyEvents")
//#SWG#@ApiModel(description = """""")
class MPropertyEvents extends Serializable {

	/**
	 * Max number of Active Live Events
	 */
	//#SWG#@ApiModelProperty(value = """Max number of Active Live Events""" ,required = true)
	@BeanProperty 
	var maxNumberActiveSpotLiveEvents: Integer  = 5
	def withmaxNumberActiveSpotLiveEvents(p:Integer):MPropertyEvents ={ 	this.maxNumberActiveSpotLiveEvents = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var maxNumberActiveNeverEndingLiveEvents: Integer  = 0
	def withmaxNumberActiveNeverEndingLiveEvents(p:Integer):MPropertyEvents ={ 	this.maxNumberActiveNeverEndingLiveEvents = p; 	this }

	/**
	 * Maximum duration (in hours) for the Spot Live Events
	 */
	//#SWG#@ApiModelProperty(value = """Maximum duration (in hours) for the Spot Live Events""" ,required = true)
	@BeanProperty 
	var maxDurationLiveEventsSpot: Integer  = 12
	def withmaxDurationLiveEventsSpot(p:Integer):MPropertyEvents ={ 	this.maxDurationLiveEventsSpot = p; 	this }

	/**
	 * the name of the config file to use as profile. 
	 */
	//#SWG#@ApiModelProperty(value = """the name of the config file to use as profile. """)
	@BeanProperty 
	var serverProfileName: String =_
	def withserverProfileName(p:String):MPropertyEvents ={ 	this.serverProfileName = p; 	this }

	/**
	 * enable or not the acceleration for the live events. This is a paid service
	 */
	//#SWG#@ApiModelProperty(value = """enable or not the acceleration for the live events. This is a paid service""" ,required = true)
	@BeanProperty 
	var cdnAccelletationEnabled: Boolean  = true
	def withcdnAccelletationEnabled(p:Boolean):MPropertyEvents ={ 	this.cdnAccelletationEnabled = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var awsProperties: MPropertyEventsAws  = new MPropertyEventsAws
	def withawsProperties(p:MPropertyEventsAws):MPropertyEvents ={ 	this.awsProperties = p; 	this }

}