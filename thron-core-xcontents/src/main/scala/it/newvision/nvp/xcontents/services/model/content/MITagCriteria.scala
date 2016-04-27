package it.newvision.nvp.xcontents.services.model.content
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MITagCriteria") 
@XmlType(name="MITagCriteria")
//#SWG#@ApiModel(description = """""")
class MITagCriteria extends Serializable {

	/**
	 * Search on ITagDefinition.id/prettyId (and children)
	 * With a ITagDefinition tree structure like this:
	 * <ul>
	 * 	<li>A->B->C->D</li>
	 * </ul>
	 * Searching contents with itag B returns all contents also tagged with C,D
	 */
	//#SWG#@ApiModelProperty(value = """Search on ITagDefinition.id/prettyId (and children)
	//#SWGNL#With a ITagDefinition tree structure like this:
	//#SWGNL#<ul>
	//#SWGNL#	<li>A->B->C->D</li>
	//#SWGNL#</ul>
	//#SWGNL#Searching contents with itag B returns all contents also tagged with C,D""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var classificationId: String =_
	def withclassificationId(p:String):this.type ={ 	this.classificationId = p; 	this }

}