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
@XmlRootElement(name="MAppOptions") 
@XmlType(name="MAppOptions")
//#SWG#@ApiModel(description = """""")
class MAppOptions extends Serializable {

	/**
	 * the root category Id for the App.
	 * Each App should be linked to a root category.
	 */
	//#SWG#@ApiModelProperty(value = """the root category Id for the App.
	//#SWGNL#Each App should be linked to a root category.""")
	@BeanProperty 
	var rootCategoryId: String =_
	def withrootCategoryId(p:String):this.type ={ 	this.rootCategoryId = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var caps: MAppAddCapability =_
	  def withcaps(p:MAppAddCapability):this.type ={ 	this.caps = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(caps).forall(_.isValid())
	}

}