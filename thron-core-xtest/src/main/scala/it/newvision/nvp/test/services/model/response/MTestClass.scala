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
@XmlRootElement(name="MTestClass") 
@XmlType(name="MTestClass")
//#SWG#@ApiModel(description = """""")
@Deprecated
class MTestClass extends MTestBaseClass with Serializable  {

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

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var classa: MTestAClass =_
	def withclassa(p:MTestAClass):this.type ={ 	this.classa = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attInt: Integer =_
	def withattInt(p:Integer):this.type ={ 	this.attInt = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attbool: Boolean =_
	def withattbool(p:Boolean):this.type ={ 	this.attbool = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attdouble: Double =_
	def withattdouble(p:Double):this.type ={ 	this.attdouble = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var buffer: Array[Byte]= new Array[Byte](0)
	def withbuffer(p:Array[Byte]):this.type ={ 	this.buffer = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var lstring: List[String] = new ArrayList[String]
	def withlstring(p:List[String]):this.type ={ 	this.lstring = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attfloat: Float =_
	def withattfloat(p:Float):this.type ={ 	this.attfloat = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var lint: List[Integer] = new ArrayList[Integer]
	def withlint(p:List[Integer]):this.type ={ 	this.lint = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var llong: List[Long] = new ArrayList[Long]
	def withllong(p:List[Long]):this.type ={ 	this.llong = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var ldate: List[Date] = new ArrayList[Date]
	def withldate(p:List[Date]):this.type ={ 	this.ldate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var lenum: List[METestEnum] = new ArrayList[METestEnum]
	def withlenum(p:List[METestEnum]):this.type ={ 	this.lenum = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	@Deprecated
	var lbool: List[Boolean] = new ArrayList[Boolean]
	@Deprecated
	def withlbool(p:List[Boolean]):this.type ={ 	this.lbool = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var testaclasses: List[MTestAClass] = new ArrayList[MTestAClass]
	  def withtestaclasses(p:List[MTestAClass]):this.type ={ 	this.testaclasses = p; 	this }

	/**
	 * attribute note definition
	 */
	@BeanProperty
	//#SWG#@ApiModelProperty(value = """attribute note definition""")
	var attTestClass: MTestClass =_
	  def withattTestClass(p:MTestClass):this.type ={ 	this.attTestClass = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	override def isValid():Boolean ={
		//TODO: implement some validation!
		true
	}

	{
		// default initialisation
		this.attbool = null
	}

}