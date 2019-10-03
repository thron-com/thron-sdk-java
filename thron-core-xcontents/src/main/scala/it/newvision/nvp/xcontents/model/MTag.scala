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
 * Used to identify similar contents. Each Content can have one or more tags, and
 * the contents with the same tag are "similar".
 */
@XmlRootElement(name="MTag") 
@XmlType(name="MTag")
//#SWG#@ApiModel(description = """Used to identify similar contents. Each Content can have one or more tags, and the contents with the same tag are "similar".""")
class MTag extends Serializable {

	/**
	 * DEPRECATED.
	 * used to moderate the insertion of tags. Implemented at client side.
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED.
	//#SWGNL#used to moderate the insertion of tags. Implemented at client side.""")
	@BeanProperty 
	@Deprecated
	var status: String =_
	@Deprecated
	def withstatus(p:String):this.type ={ 	this.status = p; 	this }

	/**
	 * the userId of the user who inserted the tag linked to the content
	 */
	//#SWG#@ApiModelProperty(value = """the userId of the user who inserted the tag linked to the content""")
	@BeanProperty 
	@Deprecated
	var userId: String =_
	@Deprecated
	def withuserId(p:String):this.type ={ 	this.userId = p; 	this }

	/**
	 * value can not contains commas (",").
	 */
	//#SWG#@ApiModelProperty(value = """value can not contains commas (",").""" ,required = true)
	@BeanProperty 
	var value: String =_
	def withvalue(p:String):this.type ={ 	this.value = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		//import org.apache.commons.lang.StringUtils
		//StringUtils.isNotBlank(value)
		Option(value).exists(x=> (x.length<=100 && x.length>0)) && 
		Option(userId).forall(_.length<=50) && 
		Option(status).forall(_.length<=50) &&
		Option(value).isDefined
	}

}