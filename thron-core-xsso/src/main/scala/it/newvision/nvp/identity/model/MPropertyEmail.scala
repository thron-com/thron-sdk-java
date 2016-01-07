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
@XmlRootElement(name="MPropertyEmail") 
@XmlType(name="MPropertyEmail")
//#SWG#@ApiModel(description = """""")
class MPropertyEmail extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var destinationErrorEmails: String  = "support@newvision.it"
	def withdestinationErrorEmails(p:String):MPropertyEmail ={ 	this.destinationErrorEmails = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var defaultEmail: String  = ""
	def withdefaultEmail(p:String):MPropertyEmail ={ 	this.defaultEmail = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var emailFW: String  = "support@newvision.it"
	def withemailFW(p:String):MPropertyEmail ={ 	this.emailFW = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var senderEmailFW: String  = "support@newvision.it"
	def withsenderEmailFW(p:String):MPropertyEmail ={ 	this.senderEmailFW = p; 	this }

	/**
	 * mydomain.it
	 */
	//#SWG#@ApiModelProperty(value = """mydomain.it""" ,required = true)
	@BeanProperty 
	var domainEmail: String =_
	def withdomainEmail(p:String):MPropertyEmail ={ 	this.domainEmail = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var packagedNotificationEmail: String =_
	def withpackagedNotificationEmail(p:String):MPropertyEmail ={ 	this.packagedNotificationEmail = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var publishedNotificationEmail: String =_
	def withpublishedNotificationEmail(p:String):MPropertyEmail ={ 	this.publishedNotificationEmail = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init(){

	}

}