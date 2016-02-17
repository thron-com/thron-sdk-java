package it.newvision.nvp.xcontents.model
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
 * Used to identify a specific source.
 * Some object can be created/modified by different source like users, or engines.
 */
@XmlRootElement(name="MISourceIdentifier") 
@XmlType(name="MISourceIdentifier")
//#SWG#@ApiModel(description = """Used to identify a specific source.
//#SWGNL#Some object can be created/modified by different source like users, or engines.""")
class MISourceIdentifier extends Serializable {

	/**
	 * username or appId or engineId
	 */
	//#SWG#@ApiModelProperty(value = """username or appId or engineId""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	/**
	 * The source Type:
	 * USER/APPLICATION/ENGINE
	 */
	//#SWG#@ApiModelProperty(value = """The source Type:
	//#SWGNL#USER/APPLICATION/ENGINE""" ,required = true)
	@BeanProperty 
	var stype: String =_
	def withstype(p:String):this.type ={ 	this.stype = p; 	this }

}