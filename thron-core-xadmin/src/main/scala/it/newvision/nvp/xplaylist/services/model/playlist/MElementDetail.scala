package it.newvision.nvp.xplaylist.services.model.playlist
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
 * generic content element inside a list
 */
@XmlRootElement(name="MElementDetail") 
@XmlType(name="MElementDetail")
//#SWG#@ApiModel(description = """generic content element inside a list""")
class MElementDetail extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var position: Integer =_
	def withposition(p:Integer):this.type ={ 	this.position = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var xcontentId: String =_
	def withxcontentId(p:String):this.type ={ 	this.xcontentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var xpublisherId: String =_
	def withxpublisherId(p:String):this.type ={ 	this.xpublisherId = p; 	this }

	/**
	 * match the EContentType in xcontent
	 */
	//#SWG#@ApiModelProperty(value = """match the EContentType in xcontent""" ,required = true)
	@BeanProperty 
	var contentType: String =_
	def withcontentType(p:String):this.type ={ 	this.contentType = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var name: String =_
	def withname(p:String):this.type ={ 	this.name = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):this.type ={ 	this.description = p; 	this }

	/**
	 * summary of the content
	 */
	//#SWG#@ApiModelProperty(value = """summary of the content""")
	@BeanProperty 
	var excerpt: String =_
	def withexcerpt(p:String):this.type ={ 	this.excerpt = p; 	this }

	/**
	 * The content url , or descriptor url.
	 */
	//#SWG#@ApiModelProperty(value = """The content url , or descriptor url.""")
	@BeanProperty 
	var url: String =_
	def withurl(p:String):this.type ={ 	this.url = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var thumbnails: MThumbnailDetail =_
	def withthumbnails(p:MThumbnailDetail):this.type ={ 	this.thumbnails = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var duration: Long =_
	def withduration(p:Long):this.type ={ 	this.duration = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var metadata: List[MMetadataDetail] = new ArrayList[MMetadataDetail]
	def withmetadata(p:List[MMetadataDetail]):this.type ={ 	this.metadata = p; 	this }

}