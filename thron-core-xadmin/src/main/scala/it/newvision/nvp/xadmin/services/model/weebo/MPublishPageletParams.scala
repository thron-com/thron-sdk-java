package it.newvision.nvp.xadmin.services.model.weebo
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MPublishPageletParams") 
@XmlType(name="MPublishPageletParams")
//#SWG#@ApiModel(description = """""")
class MPublishPageletParams extends MPublishInWeebo with Serializable  {

	/**
	 * raw body source (html or other formats).
	 * constraints: length < 2000000 chars (2.000.000 bytes)
	 */
	//#SWG#@ApiModelProperty(value = """raw body source (html or other formats).
	//#SWGNL#constraints: length < 2000000 chars (2.000.000 bytes)""" ,required = true)
	@BeanProperty 
	var body: String =_
	def withbody(p:String):MPublishPageletParams ={ 	this.body = p; 	this }

	/**
	 * Used to specify the mime type of the body value.
	 */
	//#SWG#@ApiModelProperty(value = """Used to specify the mime type of the body value.""" ,required = true)
	@BeanProperty 
	var mimeType: String =_
	def withmimeType(p:String):MPublishPageletParams ={ 	this.mimeType = p; 	this }

}