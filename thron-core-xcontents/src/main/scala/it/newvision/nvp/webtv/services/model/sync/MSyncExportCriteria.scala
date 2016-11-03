package it.newvision.nvp.webtv.services.model.sync
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MEContentType

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MSyncExportCriteria") 
@XmlType(name="MSyncExportCriteria")
//#SWG#@ApiModel(description = """""")
class MSyncExportCriteria extends Serializable {

	/**
	 * Filter all contents having contentType in the specified list.
	 */
	//#SWG#@ApiModelProperty(value = """Filter all contents having contentType in the specified list.""")
	@BeanProperty 
	var contentType: List[MEContentType] = new ArrayList[MEContentType]
	def withcontentType(p:List[MEContentType]):this.type ={ 	this.contentType = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var linkedCategoryOp: MSyncCategorySearchOptions =_
	def withlinkedCategoryOp(p:MSyncCategorySearchOptions):this.type ={ 	this.linkedCategoryOp = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def filterEmpty(){
		import collection.JavaConversions._
		contentType = contentType filterNot {_ == null}
	}

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import collection.JavaConversions._
	
		Option(linkedCategoryOp).forall(_.isValid()) &&
		Option(linkedCategoryOp).forall(_.linkedCategoryIds.nonEmpty)
	}

}