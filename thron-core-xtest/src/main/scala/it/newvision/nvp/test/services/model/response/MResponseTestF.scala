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
@XmlRootElement(name="MResponseTestF") 
@XmlType(name="MResponseTestF")
//#SWG#@ApiModel(description = """""")
class MResponseTestF extends MResponseTest with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attString: String =_
	def withattString(p:String):MResponseTestF ={ 	this.attString = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attDate: Date =_
	def withattDate(p:Date):MResponseTestF ={ 	this.attDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attenum: METestEnum =_
	def withattenum(p:METestEnum):MResponseTestF ={ 	this.attenum = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attlong: Long =_
	def withattlong(p:Long):MResponseTestF ={ 	this.attlong = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attInt: Integer =_
	def withattInt(p:Integer):MResponseTestF ={ 	this.attInt = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attdouble: Double =_
	def withattdouble(p:Double):MResponseTestF ={ 	this.attdouble = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attbool: Boolean =_
	def withattbool(p:Boolean):MResponseTestF ={ 	this.attbool = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attfloat: Float =_
	def withattfloat(p:Float):MResponseTestF ={ 	this.attfloat = p; 	this }

}