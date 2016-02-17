package it.newvision.nvp.xpackager.model
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
 * maximum size allowed:
 * 320x240
 */
@XmlRootElement(name="MThumbnail") 
@XmlType(name="MThumbnail")
//#SWG#@ApiModel(description = """thumbnail media library.
//#SWGNL#maximum size allowed:
//#SWGNL#320x240""")
class MThumbnail extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	/**
	 * byte[]
	 */
	//#SWG#@ApiModelProperty(value = """byte[]""")
	@BeanProperty 
	var source: Array[Byte]= new Array[Byte](0)
	def withsource(p:Array[Byte]):this.type ={ 	this.source = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var width: Integer =_
	def withwidth(p:Integer):this.type ={ 	this.width = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var height: Integer =_
	def withheight(p:Integer):this.type ={ 	this.height = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var mimetype: String =_
	def withmimetype(p:String):this.type ={ 	this.mimetype = p; 	this }

}