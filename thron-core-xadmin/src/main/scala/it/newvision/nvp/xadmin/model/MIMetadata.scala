package it.newvision.nvp.xadmin.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MIMetadata") 
@XmlType(name="MIMetadata")
//#SWG#@ApiModel(description = """""")
class MIMetadata extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var classificationId: String =_
	def withclassificationId(p:String):this.type ={ 	this.classificationId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var key: Integer =_
	def withkey(p:Integer):this.type ={ 	this.key = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var value: Integer =_
	def withvalue(p:Integer):this.type ={ 	this.value = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var lang: Integer =_
	def withlang(p:Integer):this.type ={ 	this.lang = p; 	this }

}