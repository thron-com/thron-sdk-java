package it.newvision.nvp.xadmin.model.version
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.model.MMetadata

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MRef") 
@XmlType(name="MRef")
//#SWG#@ApiModel(description = """""")
class MRef extends Serializable {

	/**
	 * creation Date in the Platform
	 */
	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var creationDate: Date =_
	def withcreationDate(p:Date):this.type ={ 	this.creationDate = p; 	this }

	/**
	 * Optional. External reference Id (repository file)
	 */
	//#SWG#@ApiModelProperty(value = """Optional. External reference Id (repository file)""")
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var metadata: List[MMetadata] = new ArrayList[MMetadata]
	def withmetadata(p:List[MMetadata]):this.type ={ 	this.metadata = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var mimetype: String =_
	def withmimetype(p:String):this.type ={ 	this.mimetype = p; 	this }

	/**
	 * Optional. name of the resource (fileName or url)
	 */
	//#SWG#@ApiModelProperty(value = """Optional. name of the resource (fileName or url)""")
	@BeanProperty 
	var name: String =_
	def withname(p:String):this.type ={ 	this.name = p; 	this }

	/**
	 * Size in bytes
	 */
	//#SWG#@ApiModelProperty(value = """Size in bytes""")
	@BeanProperty 
	var size: Long =_
	def withsize(p:Long):this.type ={ 	this.size = p; 	this }

}