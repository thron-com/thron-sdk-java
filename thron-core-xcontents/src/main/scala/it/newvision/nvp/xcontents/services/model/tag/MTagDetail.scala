package it.newvision.nvp.xcontents.services.model.tag
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MTagDetail") 
@XmlType(name="MTagDetail")
//#SWG#@ApiModel(description = """""")
class MTagDetail extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var value: String =_
	def withvalue(p:String):this.type ={ 	this.value = p; 	this }

	/**
	 * Number of contents having the specified tag. This information is used to build
	 * a Tag cloud.
	 */
	//#SWG#@ApiModelProperty(value = """Number of contents having the specified tag. This information is used to build a Tag cloud.""")
	@BeanProperty 
	var weight: Integer =_
	def withweight(p:Integer):this.type ={ 	this.weight = p; 	this }

}