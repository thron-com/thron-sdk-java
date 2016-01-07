package it.newvision.nvp.xreports.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xreports.model.MQueryWeebo

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JReportsWeebo.create
 */
@XmlRootElement(name="MReportsWeebocreateReq")
@XmlType(name="MReportsWeebocreateReq")
//#SWG#@ApiModel(description = "Request message for service JReportsWeebo.create")
class MReportsWeebocreateReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MReportsWeebocreateReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var query: MQueryWeebo =_
	def withquery(p:MQueryWeebo):MReportsWeebocreateReq ={ 	this.query = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var templateName: String =_
	def withtemplateName(p:String):MReportsWeebocreateReq ={ 	this.templateName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var description: String =_
	def withdescription(p:String):MReportsWeebocreateReq ={ 	this.description = p; 	this }

	/**
	 * Optional
	 */
	//#SWG#@ApiModelProperty(value = """Optional""", required = true)
	@BeanProperty
	var owner: String =_
	def withowner(p:String):MReportsWeebocreateReq ={ 	this.owner = p; 	this }

}