package it.newvision.nvp.identity.services.model.vusers
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MVUserProperties") 
@XmlType(name="MVUserProperties")
//#SWG#@ApiModel(description = """""")
class MVUserProperties extends Serializable {

	/**
	 * true = the user is active
	 * false  the user is not active
	 */
	//#SWG#@ApiModelProperty(value = """true = the user is active
	//#SWGNL#false  the user is not active""")
	@BeanProperty 
	var active: Boolean =_
	def withactive(p:Boolean):this.type ={ 	this.active = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var expiryDate: Date =_
	def withexpiryDate(p:Date):this.type ={ 	this.expiryDate = p; 	this }

}