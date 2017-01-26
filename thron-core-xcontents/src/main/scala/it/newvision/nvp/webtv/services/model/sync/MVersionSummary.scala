package it.newvision.nvp.webtv.services.model.sync
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MVersionSummary") 
@XmlType(name="MVersionSummary")
//#SWG#@ApiModel(description = """""")
class MVersionSummary extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var createdDate: Date =_
	def withcreatedDate(p:Date):this.type ={ 	this.createdDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var modifiedDate: Date =_
	def withmodifiedDate(p:Date):this.type ={ 	this.modifiedDate = p; 	this }

}