package it.newvision.nvp.identity.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MITag") 
@XmlType(name="MITag")
//#SWG#@ApiModel(description = """""")
class MITag extends Serializable {

	/**
	 * The itag status:
	 * <ul>
	 * 	<li>true = APPROVED </li>
	 * 	<li>false = REJECTED </li>
	 * 	<li>empty = SUGGESTED </li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """The itag status:
	//#SWGNL#<ul>
	//#SWGNL#	<li>true = APPROVED </li>
	//#SWGNL#	<li>false = REJECTED </li>
	//#SWGNL#	<li>empty = SUGGESTED </li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var approved: Boolean =_
	def withapproved(p:Boolean):this.type ={ 	this.approved = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var classificationId: String =_
	def withclassificationId(p:String):this.type ={ 	this.classificationId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var sources: List[MISourceIdentifier] = new ArrayList[MISourceIdentifier]
	def withsources(p:List[MISourceIdentifier]):this.type ={ 	this.sources = p; 	this }

}