package it.newvision.nvp.xcontents.services.model.export
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
 * <b>Constraints: </b>
 * <ul>
 * 	<li>ids must be less or equal than 100</li>
 * </ul>
 */
@XmlRootElement(name="MExportFullExportCategoryCriteria") 
@XmlType(name="MExportFullExportCategoryCriteria")
//#SWG#@ApiModel(description = """<b>Constraints: </b>
//#SWGNL#<ul>
//#SWGNL#	<li>ids must be less or equal than 100</li>
//#SWGNL#</ul>""")
class MExportFullExportCategoryCriteria extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var ancestorId: String =_
	def withancestorId(p:String):this.type ={ 	this.ancestorId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	/**
	 * based on entityCreationDate
	 */
	//#SWG#@ApiModelProperty(value = """based on entityCreationDate""")
	@BeanProperty 
	var fromReferenceId: String =_
	def withfromReferenceId(p:String):this.type ={ 	this.fromReferenceId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var ids: List[String] = new ArrayList[String]
	def withids(p:List[String]):this.type ={ 	this.ids = p; 	this }

}