package it.newvision.nvp.xpackager.services.model.repository
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MMetaInfo") 
@XmlType(name="MMetaInfo")
//#SWG#@ApiModel(description = """""")
class MMetaInfo extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var key: String =_
	def withkey(p:String):MMetaInfo ={ 	this.key = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var value: String =_
	def withvalue(p:String):MMetaInfo ={ 	this.value = p; 	this }

}