package it.newvision.nvp.identity.services.model.vusers
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

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var classificationId: String =_
	def withclassificationId(p:String):this.type ={ 	this.classificationId = p; 	this }

	/**
	 * The itag source Type:
	 * USER/APP/ENGINE.
	 * This attibute is used to filter the tags coming from a specific source.
	 */
	//#SWG#@ApiModelProperty(value = """The itag source Type:
	//#SWGNL#USER/APP/ENGINE.
	//#SWGNL#This attibute is used to filter the tags coming from a specific source.""")
	@BeanProperty 
	var stypes: List[String] = new ArrayList[String]
	def withstypes(p:List[String]):this.type ={ 	this.stypes = p; 	this }

}