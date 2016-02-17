package it.newvision.nvp.xpublisher.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MThumbnail") 
@XmlType(name="MThumbnail")
//#SWG#@ApiModel(description = """""")
class MThumbnail extends Serializable {

	/**
	 * identifier of the thumbnail, used client side.
	 */
	//#SWG#@ApiModelProperty(value = """identifier of the thumbnail, used client side.""" ,required = true)
	@BeanProperty 
	var tncode: String =_
	def withtncode(p:String):this.type ={ 	this.tncode = p; 	this }

	/**
	 * thumbnail url
	 */
	//#SWG#@ApiModelProperty(value = """thumbnail url""")
	@BeanProperty 
	var url: String =_
	def withurl(p:String):this.type ={ 	this.url = p; 	this }

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

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		(tncode != null)
	}

}