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
@XmlRootElement(name="MAddress") 
@XmlType(name="MAddress")
//#SWG#@ApiModel(description = """""")
class MAddress extends Serializable {

	/**
	 * HOME/WORK/...
	 */
	//#SWG#@ApiModelProperty(value = """HOME/WORK/...""")
	@BeanProperty 
	var addressCategory: String =_
	def withaddressCategory(p:String):this.type ={ 	this.addressCategory = p; 	this }

	/**
	 * County / Area
	 */
	//#SWG#@ApiModelProperty(value = """County / Area""")
	@BeanProperty 
	var area: String =_
	def witharea(p:String):this.type ={ 	this.area = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var city: String =_
	def withcity(p:String):this.type ={ 	this.city = p; 	this }

	/**
	 * country / region
	 */
	//#SWG#@ApiModelProperty(value = """country / region""")
	@BeanProperty 
	var country: String =_
	def withcountry(p:String):this.type ={ 	this.country = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var localArea: String =_
	def withlocalArea(p:String):this.type ={ 	this.localArea = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var pobox: String =_
	def withpobox(p:String):this.type ={ 	this.pobox = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var postcode: String =_
	def withpostcode(p:String):this.type ={ 	this.postcode = p; 	this }

	/**
	 * used to identify the primary address
	 */
	//#SWG#@ApiModelProperty(value = """used to identify the primary address""")
	@BeanProperty 
	var primary: Boolean  = false
	def withprimary(p:Boolean):this.type ={ 	this.primary = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var street: String =_
	def withstreet(p:String):this.type ={ 	this.street = p; 	this }

}