package it.newvision.nvp.identity.services.model.common
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * used to define the region (in pixel)
 */
@XmlRootElement(name="MArea") 
@XmlType(name="MArea")
//#SWG#@ApiModel(description = """used to define the region (in pixel)""")
class MArea extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var x: Integer =_
	def withx(p:Integer):this.type ={ 	this.x = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var y: Integer =_
	def withy(p:Integer):this.type ={ 	this.y = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var height: Integer =_
	def withheight(p:Integer):this.type ={ 	this.height = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var width: Integer =_
	def withwidth(p:Integer):this.type ={ 	this.width = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(x).exists(_.intValue >= 0) &&
		Option(y).exists(_.intValue >= 0) &&
		Option(height).exists(_.intValue > 0) &&
		Option(width).exists(_.intValue > 0)
	}

}