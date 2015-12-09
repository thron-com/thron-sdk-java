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
 * Request message for service JTestService.put
 */
@XmlRootElement(name="MTestServiceputReq")
@XmlType(name="MTestServiceputReq")
//#SWG#@ApiModel(description = "Request message for service JTestService.put")
class MTestServiceputReq extends Serializable {

	/**
	 * false, return the response filled with the parameters values
	 */
	//#SWG#@ApiModelProperty(value = """false, return the response filled with the parameters values""", required = true)
	@BeanProperty
	var fakeResponse: Boolean =_
	def withfakeResponse(p:Boolean):MTestServiceputReq ={ 	this.fakeResponse = p; 	this }

	/**
	 * Optional.
	 */
	//#SWG#@ApiModelProperty(value = """Optional.""", required = true)
	@BeanProperty
	var pstring: String =_
	def withpstring(p:String):MTestServiceputReq ={ 	this.pstring = p; 	this }

	/**
	 * Optional.
	 */
	//#SWG#@ApiModelProperty(value = """Optional.""", required = true)
	@BeanProperty
	var pdate: Date =_
	def withpdate(p:Date):MTestServiceputReq ={ 	this.pdate = p; 	this }

	/**
	 * Optional.
	 */
	//#SWG#@ApiModelProperty(value = """Optional.""", required = true)
	@BeanProperty
	var penum: METestEnum =_
	def withpenum(p:METestEnum):MTestServiceputReq ={ 	this.penum = p; 	this }

	/**
	 * Optional.
	 */
	//#SWG#@ApiModelProperty(value = """Optional.""", required = true)
	@BeanProperty
	var plong: Long =_
	def withplong(p:Long):MTestServiceputReq ={ 	this.plong = p; 	this }

	/**
	 * Optional.
	 */
	//#SWG#@ApiModelProperty(value = """Optional.""", required = true)
	@BeanProperty
	var pparams: MTestClass =_
	def withpparams(p:MTestClass):MTestServiceputReq ={ 	this.pparams = p; 	this }

	/**
	 * Optional.
	 */
	//#SWG#@ApiModelProperty(value = """Optional.""", required = true)
	@BeanProperty
	var pint: Integer =_
	def withpint(p:Integer):MTestServiceputReq ={ 	this.pint = p; 	this }

	/**
	 * Optional.
	 */
	//#SWG#@ApiModelProperty(value = """Optional.""", required = true)
	@BeanProperty
	var pbool: Boolean =_
	def withpbool(p:Boolean):MTestServiceputReq ={ 	this.pbool = p; 	this }

	/**
	 * Optional.
	 */
	//#SWG#@ApiModelProperty(value = """Optional.""", required = true)
	@BeanProperty
	var pdouble: Double =_
	def withpdouble(p:Double):MTestServiceputReq ={ 	this.pdouble = p; 	this }

	/**
	 * Optional.
	 */
	//#SWG#@ApiModelProperty(value = """Optional.""", required = true)
	@BeanProperty
	var pfloat: Float =_
	def withpfloat(p:Float):MTestServiceputReq ={ 	this.pfloat = p; 	this }

}