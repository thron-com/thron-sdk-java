package it.newvision.nvp.xadmin.services.model.apps
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MAppKeyInitData") 
@XmlType(name="MAppKeyInitData")
//#SWG#@ApiModel(description = """""")
class MAppKeyInitData extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var note: String =_
	def withnote(p:String):MAppKeyInitData ={ 	this.note = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var active: Boolean  = true
	def withactive(p:Boolean):MAppKeyInitData ={ 	this.active = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(note).forall(s => s.length<=500)
	}

}