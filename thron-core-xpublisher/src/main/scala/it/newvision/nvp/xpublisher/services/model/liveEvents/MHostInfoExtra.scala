package it.newvision.nvp.xpublisher.services.model.liveEvents
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
 * Additional information where the live instance is deployed.
 */
@XmlRootElement(name="MHostInfoExtra") 
@XmlType(name="MHostInfoExtra")
//#SWG#@ApiModel(description = """Additional information where the live instance is deployed.""")
class MHostInfoExtra extends Serializable {

	/**
	 * ec2 account number
	 */
	//#SWG#@ApiModelProperty(value = """ec2 account number""")
	@BeanProperty 
	var awsAccountNumber: String =_
	def withawsAccountNumber(p:String):this.type ={ 	this.awsAccountNumber = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var awsRegion: String =_
	def withawsRegion(p:String):this.type ={ 	this.awsRegion = p; 	this }

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
	var awsCustomParameters: String =_
	def withawsCustomParameters(p:String):this.type ={ 	this.awsCustomParameters = p; 	this }

	/**
	 * aws account used for cloudfront. Usuallly should be the same of awsAccountnumber
	 */
	//#SWG#@ApiModelProperty(value = """aws account used for cloudfront. Usuallly should be the same of awsAccountnumber""" ,required = true)
	@BeanProperty 
	var awsCfAccountNumber: String =_
	def withawsCfAccountNumber(p:String):this.type ={ 	this.awsCfAccountNumber = p; 	this }

	/**
	 * the CF distribution id
	 */
	//#SWG#@ApiModelProperty(value = """the CF distribution id""")
	@BeanProperty 
	var awsCfDistributionIds: List[String] = new ArrayList[String]
	def withawsCfDistributionIds(p:List[String]):this.type ={ 	this.awsCfDistributionIds = p; 	this }

}