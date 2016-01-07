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
	def withposition(p:Integer):MElementDetail ={ 	this.position = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var xcontentId: String =_
	def withxcontentId(p:String):MElementDetail ={ 	this.xcontentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var xpublisherId: String =_
	def withxpublisherId(p:String):MElementDetail ={ 	this.xpublisherId = p; 	this }

	/**
	 * match the EContentType in xcontent
	 */
	//#SWG#@ApiModelProperty(value = """match the EContentType in xcontent""" ,required = true)
	@BeanProperty 
	var contentType: String =_
	def withcontentType(p:String):MElementDetail ={ 	this.contentType = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var name: String =_
	def withname(p:String):MElementDetail ={ 	this.name = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):MElementDetail ={ 	this.description = p; 	this }

	/**
	 * summary of the content
	 */
	//#SWG#@ApiModelProperty(value = """summary of the content""")
	@BeanProperty 
	var excerpt: String =_
	def withexcerpt(p:String):MElementDetail ={ 	this.excerpt = p; 	this }

	/**
	 * The content url , or descriptor url.
	 */
	//#SWG#@ApiModelProperty(value = """The content url , or descriptor url.""")
	@BeanProperty 
	var url: String =_
	def withurl(p:String):MElementDetail ={ 	this.url = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var thumbnails: MThumbnailDetail =_
	def withthumbnails(p:MThumbnailDetail):MElementDetail ={ 	this.thumbnails = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var duration: Long =_
	def withduration(p:Long):MElementDetail ={ 	this.duration = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var metadata: List[MMetadataDetail] = new ArrayList[MMetadataDetail]
	def withmetadata(p:List[MMetadataDetail]):MElementDetail ={ 	this.metadata = p; 	this }

}