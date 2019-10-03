package it.newvision.nvp.xadmin.model
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
 * thumbnail media library.
 * maximum size allowed defined in the xsso client properties, and other image
 * constraints.
 */
@XmlRootElement(name="MThumbnail") 
@XmlType(name="MThumbnail")
//#SWG#@ApiModel(description = """thumbnail media library.
//#SWGNL#maximum size allowed defined in the xsso client properties, and other image constraints.""")
class MThumbnail extends Serializable {

	/**
	 * the original filename, used to store the content in the file system.(filename
	 * with extension)
	 */
	//#SWG#@ApiModelProperty(value = """the original filename, used to store the content in the file system.(filename with extension)""" ,required = true)
	@BeanProperty 
	var fileNameOriginal: String =_
	def withfileNameOriginal(p:String):this.type ={ 	this.fileNameOriginal = p; 	this }

	/**
	 * automatically extracted from the file source
	 */
	//#SWG#@ApiModelProperty(value = """automatically extracted from the file source""")
	@BeanProperty 
	var height: Integer =_
	def withheight(p:Integer):this.type ={ 	this.height = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var mimetype: String =_
	def withmimetype(p:String):this.type ={ 	this.mimetype = p; 	this }

	/**
	 * the filename (without extension), used in administration console to show as
	 * fancy name.
	 */
	//#SWG#@ApiModelProperty(value = """the filename (without extension), used in administration console to show as fancy name.""")
	@BeanProperty 
	var name: String =_
	def withname(p:String):this.type ={ 	this.name = p; 	this }

	/**
	 * thumbnailId of the source saved in xpackager or in other systems. it 's the
	 * primary key for this class.
	 */
	//#SWG#@ApiModelProperty(value = """thumbnailId of the source saved in xpackager or in other systems. it 's the primary key for this class.""" ,required = true)
	@BeanProperty 
	var referenceId: String =_
	def withreferenceId(p:String):this.type ={ 	this.referenceId = p; 	this }

	/**
	 * used to organise the thumbnail library
	 */
	//#SWG#@ApiModelProperty(value = """used to organise the thumbnail library""")
	@BeanProperty 
	var tags: List[String] = new ArrayList[String]
	def withtags(p:List[String]):this.type ={ 	this.tags = p; 	this }

	/**
	 * automatically extracted from the file source.
	 */
	//#SWG#@ApiModelProperty(value = """automatically extracted from the file source.""")
	@BeanProperty 
	var width: Integer =_
	def withwidth(p:Integer):this.type ={ 	this.width = p; 	this }

}