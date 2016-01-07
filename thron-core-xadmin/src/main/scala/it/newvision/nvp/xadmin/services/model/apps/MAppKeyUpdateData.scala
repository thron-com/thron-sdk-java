package it.newvision.nvp.xadmin.services.model.apps
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.common.MUpdater

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * App update class
 */
@XmlRootElement(name="MAppKeyUpdateData") 
@XmlType(name="MAppKeyUpdateData")
//#SWG#@ApiModel(description = """App update class""")
class MAppKeyUpdateData extends MUpdater with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var active: Boolean =_
	def withactive(p:Boolean):MAppKeyUpdateData ={ 	this.active = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var note: String =_
	def withnote(p:String):MAppKeyUpdateData ={ 	this.note = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(note).forall(s => s.length<=500)
	}

}