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
class MTestClass extends MTestBaseClass with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attString: String =_
	def withattString(p:String):MTestClass ={ 	this.attString = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attDate: Date =_
	def withattDate(p:Date):MTestClass ={ 	this.attDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attenum: METestEnum =_
	def withattenum(p:METestEnum):MTestClass ={ 	this.attenum = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attlong: Long =_
	def withattlong(p:Long):MTestClass ={ 	this.attlong = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var classa: MTestAClass =_
	def withclassa(p:MTestAClass):MTestClass ={ 	this.classa = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attInt: Integer =_
	def withattInt(p:Integer):MTestClass ={ 	this.attInt = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attbool: Boolean =_
	def withattbool(p:Boolean):MTestClass ={ 	this.attbool = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attdouble: Double =_
	def withattdouble(p:Double):MTestClass ={ 	this.attdouble = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var buffer: Array[Byte]= new Array[Byte](0)
	def withbuffer(p:Array[Byte]):MTestClass ={ 	this.buffer = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var lstring: List[String] = new ArrayList[String]
	def withlstring(p:List[String]):MTestClass ={ 	this.lstring = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var attfloat: Float =_
	def withattfloat(p:Float):MTestClass ={ 	this.attfloat = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var lint: List[Integer] = new ArrayList[Integer]
	def withlint(p:List[Integer]):MTestClass ={ 	this.lint = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var llong: List[Long] = new ArrayList[Long]
	def withllong(p:List[Long]):MTestClass ={ 	this.llong = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var ldate: List[Date] = new ArrayList[Date]
	def withldate(p:List[Date]):MTestClass ={ 	this.ldate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var lenum: List[METestEnum] = new ArrayList[METestEnum]
	def withlenum(p:List[METestEnum]):MTestClass ={ 	this.lenum = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var lbool: List[Boolean] = new ArrayList[Boolean]
	def withlbool(p:List[Boolean]):MTestClass ={ 	this.lbool = p; 	this }

	/**
	 * attribute note definition
	 */
	@BeanProperty
	//#SWG#@ApiModelProperty(value = """attribute note definition""")
	var attTestClass: MTestClass =_
	  def withattTestClass(p:MTestClass):MTestClass ={ 	this.attTestClass = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var testaclasses: List[MTestAClass] = new ArrayList[MTestAClass]
	  def withtestaclasses(p:List[MTestAClass]):MTestClass ={ 	this.testaclasses = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		//TODO: to implement some validation
		true
	}

	{
		// default initialisation
		this.attbool = null
	}

}