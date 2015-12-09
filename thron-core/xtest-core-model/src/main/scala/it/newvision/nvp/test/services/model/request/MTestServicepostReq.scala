package it.newvision.nvp.test.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.test.services.model.msg.METestEnum
import it.newvision.nvp.test.services.model.response.MTestClass

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JTestService.post
 */
@XmlRootElement(name="MTestServicepostReq")
@XmlType(name="MTestServicepostReq")
//#SWG#@ApiModel(description = "Request message for service JTestService.post")
class MTestServicepostReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MTestServicepostReq ={ 	this.clientId = p; 	this }

	/**
	 * Optional.false, return the response filled with the parameters values
	 */
	//#SWG#@ApiModelProperty(value = """Optional.false, return the response filled with the parameters values""", required = true)
	@BeanProperty
	var fakeResponse: Boolean =_
	def withfakeResponse(p:Boolean):MTestServicepostReq ={ 	this.fakeResponse = p; 	this }

	/**
	 * Optional.
	 */
	//#SWG#@ApiModelProperty(value = """Optional.""", required = true)
	@BeanProperty
	var pstring: String =_
	def withpstring(p:String):MTestServicepostReq ={ 	this.pstring = p; 	this }

	/**
	 * Optional.
	 */
	//#SWG#@ApiModelProperty(value = """Optional.""", required = true)
	@BeanProperty
	var pdate: Date =_
	def withpdate(p:Date):MTestServicepostReq ={ 	this.pdate = p; 	this }

	/**
	 * Optional.
	 */
	//#SWG#@ApiModelProperty(value = """Optional.""", required = true)
	@BeanProperty
	var penum: METestEnum =_
	def withpenum(p:METestEnum):MTestServicepostReq ={ 	this.penum = p; 	this }

	/**
	 * Optional.
	 */
	//#SWG#@ApiModelProperty(value = """Optional.""", required = true)
	@BeanProperty
	var plong: Long =_
	def withplong(p:Long):MTestServicepostReq ={ 	this.plong = p; 	this }

	/**
	 * Optional.
	 */
	//#SWG#@ApiModelProperty(value = """Optional.""", required = true)
	@BeanProperty
	var pparams: MTestClass =_
	def withpparams(p:MTestClass):MTestServicepostReq ={ 	this.pparams = p; 	this }

	/**
	 * Optional.
	 */
	//#SWG#@ApiModelProperty(value = """Optional.""", required = true)
	@BeanProperty
	var pint: Integer =_
	def withpint(p:Integer):MTestServicepostReq ={ 	this.pint = p; 	this }

	/**
	 * Optional.
	 */
	//#SWG#@ApiModelProperty(value = """Optional.""", required = true)
	@BeanProperty
	var pbool: Boolean =_
	def withpbool(p:Boolean):MTestServicepostReq ={ 	this.pbool = p; 	this }

	/**
	 * Optional.
	 */
	//#SWG#@ApiModelProperty(value = """Optional.""", required = true)
	@BeanProperty
	var pdouble: Double =_
	def withpdouble(p:Double):MTestServicepostReq ={ 	this.pdouble = p; 	this }

	/**
	 * Optional.
	 */
	//#SWG#@ApiModelProperty(value = """Optional.""", required = true)
	@BeanProperty
	var pfloat: Float =_
	def withpfloat(p:Float):MTestServicepostReq ={ 	this.pfloat = p; 	this }

}