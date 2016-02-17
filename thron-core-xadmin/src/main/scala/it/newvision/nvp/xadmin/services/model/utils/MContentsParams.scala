package it.newvision.nvp.xadmin.services.model.utils
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MContentsParams") 
@XmlType(name="MContentsParams")
//#SWG#@ApiModel(description = """""")
class MContentsParams extends Serializable {

	/**
	 * Optional.
	 */
	//#SWG#@ApiModelProperty(value = """Optional.""")
	@BeanProperty 
	var newUserId: String =_
	def withnewUserId(p:String):this.type ={ 	this.newUserId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var xcontentIds: List[String] = new ArrayList[String]
	def withxcontentIds(p:List[String]):this.type ={ 	this.xcontentIds = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		!xcontentIds.isEmpty
	}

}