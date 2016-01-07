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
@XmlRootElement(name="MContentPageletParams") 
@XmlType(name="MContentPageletParams")
//#SWG#@ApiModel(description = """""")
class MContentPageletParams extends Serializable {

	/**
	 * -> MContent.owner
	 */
	//#SWG#@ApiModelProperty(value = """-> MContent.owner""")
	@BeanProperty 
	var owner: String =_
	def withowner(p:String):MContentPageletParams ={ 	this.owner = p; 	this }

	/**
	 * Default empty. Used only for UGC Contents. This should be the username of owner.
	 * The field is mapped in MContent.userId
	 */
	//#SWG#@ApiModelProperty(value = """Default empty. Used only for UGC Contents. This should be the username of owner. The field is mapped in MContent.userId""")
	@BeanProperty 
	@Deprecated
	var userId: String =_
	@Deprecated
	def withuserId(p:String):MContentPageletParams ={ 	this.userId = p; 	this }

	/**
	 * raw body source (html or other formats).
	 * constraints: length < 2000000 chars (2.000.000 bytes)
	 */
	//#SWG#@ApiModelProperty(value = """raw body source (html or other formats).
	//#SWGNL#constraints: length < 2000000 chars (2.000.000 bytes)""" ,required = true)
	@BeanProperty 
	var body: String =_
	def withbody(p:String):MContentPageletParams ={ 	this.body = p; 	this }

	/**
	 * Used to specify the mime type of the body value.
	 */
	//#SWG#@ApiModelProperty(value = """Used to specify the mime type of the body value.""" ,required = true)
	@BeanProperty 
	var mimeType: String =_
	def withmimeType(p:String):MContentPageletParams ={ 	this.mimeType = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(owner).forall(_.length<=50) &&
		Option(body).isDefined &&
		Option(mimeType).isDefined &&
		org.apache.commons.lang.StringUtils.length(body)<=2000000
	}

}