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

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var awsProperties: MPropertyEventsAws  = new MPropertyEventsAws
	def withawsProperties(p:MPropertyEventsAws):this.type ={ 	this.awsProperties = p; 	this }

	/**
	 * enable the CloudFront Acceleration for the live events.
	 * Live events are accelerated by Akamai (default value)
	 */
	//#SWG#@ApiModelProperty(value = """enable the CloudFront Acceleration for the live events. 
	//#SWGNL#Live events are accelerated by Akamai (default value)""" ,required = true)
	@BeanProperty 
	var cdnAccelerationEnabled: Boolean  = true
	def withcdnAccelerationEnabled(p:Boolean):this.type ={ 	this.cdnAccelerationEnabled = p; 	this }

	/**
	 * Maximum duration (in hours) for the Spot Live Events
	 */
	//#SWG#@ApiModelProperty(value = """Maximum duration (in hours) for the Spot Live Events""" ,required = true)
	@BeanProperty 
	var maxDurationLiveEventsSpot: Integer  = 12
	def withmaxDurationLiveEventsSpot(p:Integer):this.type ={ 	this.maxDurationLiveEventsSpot = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var maxNumberActiveNeverEndingLiveEvents: Integer  = 0
	def withmaxNumberActiveNeverEndingLiveEvents(p:Integer):this.type ={ 	this.maxNumberActiveNeverEndingLiveEvents = p; 	this }

	/**
	 * Max number of Active Live Events
	 */
	//#SWG#@ApiModelProperty(value = """Max number of Active Live Events""" ,required = true)
	@BeanProperty 
	var maxNumberActiveSpotLiveEvents: Integer  = 5
	def withmaxNumberActiveSpotLiveEvents(p:Integer):this.type ={ 	this.maxNumberActiveSpotLiveEvents = p; 	this }

	/**
	 * the name of the config file to use as profile. 
	 */
	//#SWG#@ApiModelProperty(value = """the name of the config file to use as profile. """)
	@BeanProperty 
	var serverProfileName: String =_
	def withserverProfileName(p:String):this.type ={ 	this.serverProfileName = p; 	this }

}