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
 * List of properties values for the region where the live istance should be
 * deployed.
 */
@XmlRootElement(name="MPropertyEventsAws") 
@XmlType(name="MPropertyEventsAws")
//#SWG#@ApiModel(description = """List of properties values for the region where the live istance should be deployed.""")
class MPropertyEventsAws extends Serializable {

	/**
	 * the default region where the should be active the live instances.
	 */
	//#SWG#@ApiModelProperty(value = """the default region where the should be active the live instances.""")
	@BeanProperty 
	var defaultRegion: String =_
	def withdefaultRegion(p:String):MPropertyEventsAws ={ 	this.defaultRegion = p; 	this }

	/**
	 * Syntax: formUrlEncoded, with ; separator.
	 * ec2InstanceType=...
	 * amiId=...
	 * 
	 * example:
	 * ec2InstanceType=m1.micro;amiId=xxxy
	 */
	//#SWG#@ApiModelProperty(value = """Syntax: formUrlEncoded, with ; separator.
	//#SWGNL#ec2InstanceType=...
	//#SWGNL#amiId=...
	//#SWGNL#
	//#SWGNL#example:
	//#SWGNL#ec2InstanceType=m1.micro;amiId=xxxy""")
	@BeanProperty 
	var customParameters: String =_
	def withcustomParameters(p:String):MPropertyEventsAws ={ 	this.customParameters = p; 	this }

	/**
	 * CloudFontPriceClass
	 * 1) US and Eurore
	 * 2) US, Europe and Asia
	 * 3) World (best Performance)
	 */
	//#SWG#@ApiModelProperty(value = """CloudFontPriceClass
	//#SWGNL#1) US and Eurore
	//#SWGNL#2) US, Europe and Asia
	//#SWGNL#3) World (best Performance)""")
	@BeanProperty 
	var cdnPriceClass: String =_
	def withcdnPriceClass(p:String):MPropertyEventsAws ={ 	this.cdnPriceClass = p; 	this }

}