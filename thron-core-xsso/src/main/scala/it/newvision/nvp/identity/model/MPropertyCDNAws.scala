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
/**
 * Properties for CDN Acceleration.
 */
@XmlRootElement(name="MPropertyCDNAws") 
@XmlType(name="MPropertyCDNAws")
//#SWG#@ApiModel(description = """Properties for CDN Acceleration.""")
class MPropertyCDNAws extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var accountNumber: String =_
	def withaccountNumber(p:String):this.type ={ 	this.accountNumber = p; 	this }

	/**
	 * the list of CF distributions.
	 */
	//#SWG#@ApiModelProperty(value = """the list of CF distributions.""")
	@BeanProperty 
	var awsCfDistributionIds: List[String] = new ArrayList[String]
	def withawsCfDistributionIds(p:List[String]):this.type ={ 	this.awsCfDistributionIds = p; 	this }

	/**
	 * enable the CloudFront Acceleration for the live events.
	 * Live events are accelerated by Akamai (default value)
	 */
	//#SWG#@ApiModelProperty(value = """enable the CloudFront Acceleration for the live events. 
	//#SWGNL#Live events are accelerated by Akamai (default value)""" ,required = true)
	@BeanProperty 
	var cdnAccelerationEnabled: Boolean  = false
	def withcdnAccelerationEnabled(p:Boolean):this.type ={ 	this.cdnAccelerationEnabled = p; 	this }

	/**
	 * CloudFontPriceClass
	 * 1) US and Eurore
	 * 2) US, Europe and Asia
	 * 3) World (best Performance)
	 */
	//#SWG#@ApiModelProperty(value = """CloudFontPriceClass
	//#SWGNL#1) US and Eurore
	//#SWGNL#2) US, Europe and Asia
	//#SWGNL#3) World (best Performance)""" ,required = true)
	@BeanProperty 
	var cdnPriceClass: String =_
	def withcdnPriceClass(p:String):this.type ={ 	this.cdnPriceClass = p; 	this }

}