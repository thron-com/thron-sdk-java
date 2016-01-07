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
 * A template used to customize the Player layout
 */
@XmlRootElement(name="MPlayerEmbedTemplate") 
@XmlType(name="MPlayerEmbedTemplate")
//#SWG#@ApiModel(description = """A template used to customize the Player layout""")
class MPlayerEmbedTemplate extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):MPlayerEmbedTemplate ={ 	this.id = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var name: String =_
	def withname(p:String):MPlayerEmbedTemplate ={ 	this.name = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):MPlayerEmbedTemplate ={ 	this.description = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var default: Boolean =_
	def withdefault(p:Boolean):MPlayerEmbedTemplate ={ 	this.default = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var active: Boolean  = false
	def withactive(p:Boolean):MPlayerEmbedTemplate ={ 	this.active = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var values: List[MMetadata] = new ArrayList[MMetadata]
	def withvalues(p:List[MMetadata]):MPlayerEmbedTemplate ={ 	this.values = p; 	this }

}