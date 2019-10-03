package it.newvision.nvp.xadmin.model.version
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
 * Used to identify a specific source
 */
@XmlRootElement(name="MVersionSourceIdentifier") 
@XmlType(name="MVersionSourceIdentifier")
//#SWG#@ApiModel(description = """Used to identify a specific source""")
class MVersionSourceIdentifier extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var displayName: String =_
	def withdisplayName(p:String):this.type ={ 	this.displayName = p; 	this }

	/**
	 * username
	 */
	//#SWG#@ApiModelProperty(value = """username""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import org.apache.commons.lang.StringUtils
				StringUtils.isNotBlank(id)
	}

}