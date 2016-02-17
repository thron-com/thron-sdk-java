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
@XmlRootElement(name="MClient") 
@XmlType(name="MClient")
//#SWG#@ApiModel(description = """""")
class MClient extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	/**
	 * the specific Credential used to interact with the OS
	 */
	//#SWG#@ApiModelProperty(value = """the specific Credential used to interact with the OS""" ,required = true)
	@BeanProperty 
	var credentialOS: MCredentialFull =_
	def withcredentialOS(p:MCredentialFull):this.type ={ 	this.credentialOS = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var clientPolicies: MPolicies  = new MPolicies()
	def withclientPolicies(p:MPolicies):this.type ={ 	this.clientPolicies = p; 	this }

	/**
	 * client creation date
	 */
	//#SWG#@ApiModelProperty(value = """client creation date""" ,required = true)
	@BeanProperty 
	var creationDate: Date  = new Date()
	def withcreationDate(p:Date):this.type ={ 	this.creationDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var clientCapabilities: MCapabilities  = new MCapabilities()
	def withclientCapabilities(p:MCapabilities):this.type ={ 	this.clientCapabilities = p; 	this }

	/**
	 * date from which the client has passed to the inactive state.
	 * When a client is in inactive state, it can be remove (permanently) from the DB
	 */
	//#SWG#@ApiModelProperty(value = """date from which the client has passed to the inactive state.
	//#SWGNL#When a client is in inactive state, it can be remove (permanently) from the DB""")
	@BeanProperty 
	var inactiveFrom: Date =_
	def withinactiveFrom(p:Date):this.type ={ 	this.inactiveFrom = p; 	this }

	/**
	 * the possible date of expiry of the contract
	 */
	//#SWG#@ApiModelProperty(value = """the possible date of expiry of the contract""")
	@BeanProperty 
	var expiryDate: Date =_
	def withexpiryDate(p:Date):this.type ={ 	this.expiryDate = p; 	this }

	/**
	 * The end date of the service. This is the end of the paid contract with the
	 * customer
	 */
	//#SWG#@ApiModelProperty(value = """The end date of the service. This is the end of the paid contract with the customer""")
	@BeanProperty 
	var endOfService: Date =_
	def withendOfService(p:Date):this.type ={ 	this.endOfService = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var clientStatus: MEClientStatus =_
	def withclientStatus(p:MEClientStatus):this.type ={ 	this.clientStatus = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var domain: String  = "4me.it"
	def withdomain(p:String):this.type ={ 	this.domain = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var properties: MProperty =_
	  def withproperties(p:MProperty):this.type ={ 	this.properties = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var credentials: List[MUserCredential] = new ArrayList[MUserCredential]
	  def withcredentials(p:List[MUserCredential]):this.type ={ 	this.credentials = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		clientId != null && this.getCredentialOS != null
	}

	/**
	 * @return MEClientStatus
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def getStatus():MEClientStatus ={
		Option(this.inactiveFrom) match{
							case Some(x) => MEClientStatus.INACTIVE
							case None => 
									Option(this.expiryDate) match{
										case Some(ed) =>
										if(ed.compareTo(new Date)>0){
											this.clientStatus
										}else{
											MEClientStatus.EXPIRED
										}
										case None => Option(this.clientStatus).getOrElse(MEClientStatus.ACTIVE)
									}
						}
	}

}