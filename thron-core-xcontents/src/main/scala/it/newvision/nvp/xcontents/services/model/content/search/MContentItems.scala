package it.newvision.nvp.xcontents.services.model.content.search
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MEContentType

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * The ContentWall class has all necessary information to fill a webtv wall.
 */
@XmlRootElement(name="MContentItems") 
@XmlType(name="MContentItems")
//#SWG#@ApiModel(description = """The ContentWall class has all necessary information to fill a webtv wall.""")
class MContentItems extends Serializable {

	/**
	 * the content identifier 
	 */
	//#SWG#@ApiModelProperty(value = """the content identifier """ ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var contentType: MEContentType =_
	def withcontentType(p:MEContentType):this.type ={ 	this.contentType = p; 	this }

	/**
	 * The creation date of the content.
	 */
	//#SWG#@ApiModelProperty(value = """The creation date of the content.""")
	@BeanProperty 
	var creationDate: Date =_
	def withcreationDate(p:Date):this.type ={ 	this.creationDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var details: MContentExtendedDetails =_
	def withdetails(p:MContentExtendedDetails):this.type ={ 	this.details = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var thumbs: List[MThumbsUrlDetails] = new ArrayList[MThumbsUrlDetails]
	def withthumbs(p:List[MThumbsUrlDetails]):this.type ={ 	this.thumbs = p; 	this }

}