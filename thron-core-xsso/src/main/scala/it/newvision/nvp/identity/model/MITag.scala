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

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):MITag ={ 	this.id = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var classificationId: String =_
	def withclassificationId(p:String):MITag ={ 	this.classificationId = p; 	this }

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
	def withapproved(p:Boolean):MITag ={ 	this.approved = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var sources: List[MISourceIdentifier] = new ArrayList[MISourceIdentifier]
	def withsources(p:List[MISourceIdentifier]):MITag ={ 	this.sources = p; 	this }

}