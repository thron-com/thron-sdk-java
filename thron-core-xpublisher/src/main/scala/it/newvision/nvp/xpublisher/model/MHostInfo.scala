package it.newvision.nvp.xpublisher.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpublisher.services.model.liveEvents.MHostInfoExtra

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MHostInfo") 
@XmlType(name="MHostInfo")
//#SWG#@ApiModel(description = """""")
class MHostInfo extends Serializable {

	/**
	 * the epoc value used as unique id of the host. this is used to generate the dns
	 * entries.
	 * default  = System.currentTimeMillis()/1000
	 */
	//#SWG#@ApiModelProperty(value = """the epoc value used as unique id of the host. this is used to generate the dns entries.
	//#SWGNL#default  = System.currentTimeMillis()/1000""")
	@BeanProperty 
	var assignedId: Long  = System.currentTimeMillis()/1000
	def withassignedId(p:Long):MHostInfo ={ 	this.assignedId = p; 	this }

	/**
	 * the ec2 instance ID
	 */
	//#SWG#@ApiModelProperty(value = """the ec2 instance ID""" ,required = true)
	@BeanProperty 
	var hostInstanceId: String =_
	def withhostInstanceId(p:String):MHostInfo ={ 	this.hostInstanceId = p; 	this }

	/**
	 * ec2 real hostname
	 */
	//#SWG#@ApiModelProperty(value = """ec2 real hostname""")
	@BeanProperty 
	var hostname: String =_
	def withhostname(p:String):MHostInfo ={ 	this.hostname = p; 	this }

	/**
	 * the elastic IP assigned to the hostname
	 */
	//#SWG#@ApiModelProperty(value = """the elastic IP assigned to the hostname""")
	@BeanProperty 
	var hostStaticIP: String =_
	def withhostStaticIP(p:String):MHostInfo ={ 	this.hostStaticIP = p; 	this }

	/**
	 * the list of registered hostname for the live event.
	 * The default entries are:
	 * http://clientId-eventId-in.4mecloud.it
	 * http://clientId-eventId-rt.4mecloud.it
	 * http://clientId-eventId-stream.4mecloud.it
	 * http://clientId-eventId-app.4mecloud.it
	 */
	//#SWG#@ApiModelProperty(value = """the list of registered hostname for the live event.
	//#SWGNL#The default entries are:
	//#SWGNL#http://clientId-eventId-in.4mecloud.it
	//#SWGNL#http://clientId-eventId-rt.4mecloud.it
	//#SWGNL#http://clientId-eventId-stream.4mecloud.it
	//#SWGNL#http://clientId-eventId-app.4mecloud.it""")
	@BeanProperty 
	var publicHostnames: List[MHostnameDetail] = new ArrayList[MHostnameDetail]
	def withpublicHostnames(p:List[MHostnameDetail]):MHostInfo ={ 	this.publicHostnames = p; 	this }

	/**
	 * the site where the resources have been commissioned.
	 */
	//#SWG#@ApiModelProperty(value = """the site where the resources have been commissioned.""")
	@BeanProperty 
	var siteName: String =_
	def withsiteName(p:String):MHostInfo ={ 	this.siteName = p; 	this }

	/**
	 * used to know if the amazon EC2 host is active or not. Means the Event is ON_AIR
	 * or is CLOSED
	 */
	//#SWG#@ApiModelProperty(value = """used to know if the amazon EC2 host is active or not. Means the Event is ON_AIR or is CLOSED""" ,required = true)
	@BeanProperty 
	var hostIsActive: Boolean  = false
	def withhostIsActive(p:Boolean):MHostInfo ={ 	this.hostIsActive = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var additionalProperties: MHostInfoExtra =_
	def withadditionalProperties(p:MHostInfoExtra):MHostInfo ={ 	this.additionalProperties = p; 	this }

}