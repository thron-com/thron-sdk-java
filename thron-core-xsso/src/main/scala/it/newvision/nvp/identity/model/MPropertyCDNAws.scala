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

	/**
	 * enable or not the acceleration for the live events. This is a paid service
	 */
	//#SWG#@ApiModelProperty(value = """enable or not the acceleration for the live events. This is a paid service""" ,required = true)
	@BeanProperty 
	var cdnAccelerationEnabled: Boolean  = false
	def withcdnAccelerationEnabled(p:Boolean):MPropertyCDNAws ={ 	this.cdnAccelerationEnabled = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var accountNumber: String =_
	def withaccountNumber(p:String):MPropertyCDNAws ={ 	this.accountNumber = p; 	this }

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
	def withcdnPriceClass(p:String):MPropertyCDNAws ={ 	this.cdnPriceClass = p; 	this }

	/**
	 * the list of CF distributions.
	 */
	//#SWG#@ApiModelProperty(value = """the list of CF distributions.""")
	@BeanProperty 
	var awsCfDistributionIds: List[String] = new ArrayList[String]
	def withawsCfDistributionIds(p:List[String]):MPropertyCDNAws ={ 	this.awsCfDistributionIds = p; 	this }

}