package it.newvision.nvp.xcontents.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MViewDetail") 
@XmlType(name="MViewDetail")
//#SWG#@ApiModel(description = """""")
class MViewDetail extends Serializable {

	/**
	 * total number of views
	 */
	//#SWG#@ApiModelProperty(value = """total number of views""")
	@BeanProperty 
	var counter: Long =_
	def withcounter(p:Long):MViewDetail ={ 	this.counter = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var lastView: Date =_
	def withlastView(p:Date):MViewDetail ={ 	this.lastView = p; 	this }

}