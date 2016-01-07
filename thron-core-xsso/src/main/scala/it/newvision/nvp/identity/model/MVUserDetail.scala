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
 * The user detail class where are collected all data like emails, phone,
 * addresses....
 */
@XmlRootElement(name="MVUserDetail") 
@XmlType(name="MVUserDetail")
//#SWG#@ApiModel(description = """The user detail class where are collected all data like emails, phone, addresses....""")
class MVUserDetail extends Serializable {

	/**
	 * the birthdate, only for personal profile.
	 */
	//#SWG#@ApiModelProperty(value = """the birthdate, only for personal profile.""")
	@BeanProperty 
	var dob: Date =_
	def withdob(p:Date):MVUserDetail ={ 	this.dob = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var gender: MEGender =_
	def withgender(p:MEGender):MVUserDetail ={ 	this.gender = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var contactType: MEContactType  = MEContactType.PERSON
	def withcontactType(p:MEContactType):MVUserDetail ={ 	this.contactType = p; 	this }

	/**
	 * additional information
	 */
	//#SWG#@ApiModelProperty(value = """additional information""")
	@BeanProperty 
	var note: String =_
	def withnote(p:String):MVUserDetail ={ 	this.note = p; 	this }

	/**
	 * When customer data is stored in an external system, this field is used to
	 * record the user ID in external system.
	 */
	//#SWG#@ApiModelProperty(value = """When customer data is stored in an external system, this field is used to record the user ID in external system.""")
	@BeanProperty 
	var externalReferenceId: String =_
	def withexternalReferenceId(p:String):MVUserDetail ={ 	this.externalReferenceId = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var icalls: List[MInternetCall] = new ArrayList[MInternetCall]
	  def withicalls(p:List[MInternetCall]):MVUserDetail ={ 	this.icalls = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var name: MFullName =_
	  def withname(p:MFullName):MVUserDetail ={ 	this.name = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var phoneNumbers: List[MPhoneAddress] = new ArrayList[MPhoneAddress]
	  def withphoneNumbers(p:List[MPhoneAddress]):MVUserDetail ={ 	this.phoneNumbers = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var emails: List[MMailAddress] = new ArrayList[MMailAddress]
	  def withemails(p:List[MMailAddress]):MVUserDetail ={ 	this.emails = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var businessDetail: MBusinnessDetail =_
	  def withbusinessDetail(p:MBusinnessDetail):MVUserDetail ={ 	this.businessDetail = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var imcontacts: List[MIstantMessaging] = new ArrayList[MIstantMessaging]
	  def withimcontacts(p:List[MIstantMessaging]):MVUserDetail ={ 	this.imcontacts = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var addresses: List[MAddress] = new ArrayList[MAddress]
	  def withaddresses(p:List[MAddress]):MVUserDetail ={ 	this.addresses = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var urls: List[MUrl] = new ArrayList[MUrl]
	  def withurls(p:List[MUrl]):MVUserDetail ={ 	this.urls = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var image: MImage =_
	  def withimage(p:MImage):MVUserDetail ={ 	this.image = p; 	this }

	/**
	 * @return String
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def displayName():String ={
		var result:String = ""
		Option(this.name) foreach{n=> result = n.displayName}
		result
	}

}