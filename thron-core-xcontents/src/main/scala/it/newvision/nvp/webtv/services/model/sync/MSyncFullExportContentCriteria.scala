package it.newvision.nvp.webtv.services.model.sync
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
 * 	<li>linkedCategoryOp.linkedCategoryIds: max number of elements 50 (when
 * cascade is true)</li>
 * </ul>
 */
@XmlRootElement(name="MSyncFullExportContentCriteria") 
@XmlType(name="MSyncFullExportContentCriteria")
//#SWG#@ApiModel(description = """<b>Constraints: </b>
//#SWGNL#<ul>
//#SWGNL#	<li>linkedCategoryOp.linkedCategoryIds: max number of elements 50 (when cascade is true)</li>
//#SWGNL#</ul>""")
class MSyncFullExportContentCriteria extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var fromReferenceId: String =_
	def withfromReferenceId(p:String):this.type ={ 	this.fromReferenceId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var ids: List[String] = new ArrayList[String]
	def withids(p:List[String]):this.type ={ 	this.ids = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var tag: List[MExportTagCriteria] = new ArrayList[MExportTagCriteria]
	def withtag(p:List[MExportTagCriteria]):this.type ={ 	this.tag = p; 	this }

}