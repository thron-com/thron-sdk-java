package it.newvision.nvp.identity.services.model.client
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MClientSearchCriteria") 
@XmlType(name="MClientSearchCriteria")
//#SWG#@ApiModel(description = """""")
class MClientSearchCriteria extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var activeOnly: Boolean  = false
	def withactiveOnly(p:Boolean):this.type ={ 	this.activeOnly = p; 	this }

	/**
	 * Available values:
	 * <ul>
	 * 	<li>4me.it</li>
	 * 	<li>thron.com</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """Available values:
	//#SWGNL#<ul>
	//#SWGNL#	<li>4me.it</li>
	//#SWGNL#	<li>thron.com</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var domain: String =_
	def withdomain(p:String):this.type ={ 	this.domain = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var fromDate: Date =_
	def withfromDate(p:Date):this.type ={ 	this.fromDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var toDate: Date =_
	def withtoDate(p:Date):this.type ={ 	this.toDate = p; 	this }

}