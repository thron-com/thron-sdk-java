package it.newvision.nvp.xpublisher.services.model.response
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseGetQuota") 
@XmlType(name="MResponseGetQuota")
//#SWG#@ApiModel(description = """""")
class MResponseGetQuota extends MResponsePublisher with Serializable  {

	/**
	 * total amount of space available in the working Area (in Bytes)
	 */
	//#SWG#@ApiModelProperty(value = """total amount of space available in the working Area (in Bytes)""")
	@BeanProperty 
	var totalSpace: Long =_
	def withtotalSpace(p:Long):this.type ={ 	this.totalSpace = p; 	this }

	/**
	 * total amount of space used in the working Area (in Bytes)
	 */
	//#SWG#@ApiModelProperty(value = """total amount of space used in the working Area (in Bytes)""")
	@BeanProperty 
	var usedSpace: Long =_
	def withusedSpace(p:Long):this.type ={ 	this.usedSpace = p; 	this }

}