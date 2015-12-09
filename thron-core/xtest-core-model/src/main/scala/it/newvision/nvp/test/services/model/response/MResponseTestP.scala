package it.newvision.nvp.test.services.model.response
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.test.services.model.msg.METestEnum

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseTestP") 
@XmlType(name="MResponseTestP")
//#SWG#@ApiModel(description = """""")
class MResponseTestP extends MResponseTest with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attString: String =_
	def withattString(p:String):MResponseTestP ={ 	this.attString = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attDate: Date =_
	def withattDate(p:Date):MResponseTestP ={ 	this.attDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attenum: METestEnum =_
	def withattenum(p:METestEnum):MResponseTestP ={ 	this.attenum = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attlong: Long =_
	def withattlong(p:Long):MResponseTestP ={ 	this.attlong = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	@Deprecated
	var attInt: Integer =_
	@Deprecated
	def withattInt(p:Integer):MResponseTestP ={ 	this.attInt = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var testClass: MTestClass =_
	def withtestClass(p:MTestClass):MResponseTestP ={ 	this.testClass = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attdouble: Double =_
	def withattdouble(p:Double):MResponseTestP ={ 	this.attdouble = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attbool: Boolean =_
	def withattbool(p:Boolean):MResponseTestP ={ 	this.attbool = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attfloat: Float =_
	def withattfloat(p:Float):MResponseTestP ={ 	this.attfloat = p; 	this }

	/**
	 * @param param1 : String
	 * @return MTestClass
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def methodWithArray(param1: String):List[MTestClass] ={
		new ArrayList[MTestClass]
	}

}