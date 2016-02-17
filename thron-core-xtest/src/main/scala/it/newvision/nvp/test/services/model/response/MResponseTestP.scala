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
	def withattString(p:String):this.type ={ 	this.attString = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attDate: Date =_
	def withattDate(p:Date):this.type ={ 	this.attDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attenum: METestEnum =_
	def withattenum(p:METestEnum):this.type ={ 	this.attenum = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attlong: Long =_
	def withattlong(p:Long):this.type ={ 	this.attlong = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attInt: Integer =_
	def withattInt(p:Integer):this.type ={ 	this.attInt = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var testClass: MTestClass =_
	def withtestClass(p:MTestClass):this.type ={ 	this.testClass = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attdouble: Double =_
	def withattdouble(p:Double):this.type ={ 	this.attdouble = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attbool: Boolean =_
	def withattbool(p:Boolean):this.type ={ 	this.attbool = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attfloat: Float =_
	def withattfloat(p:Float):this.type ={ 	this.attfloat = p; 	this }

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