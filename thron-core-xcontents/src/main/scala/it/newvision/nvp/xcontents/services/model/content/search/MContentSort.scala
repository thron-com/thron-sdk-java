package it.newvision.nvp.xcontents.services.model.content.search
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
 * Contents sorts.
 * Only one choice must be defined.
 * If more than one is defined, only the first in the model order should be taken.
 */
@XmlRootElement(name="MContentSort") 
@XmlType(name="MContentSort")
//#SWG#@ApiModel(description = """Contents sorts.
//#SWGNL#Only one choice must be defined.
//#SWGNL#If more than one is defined, only the first in the model order should be taken.""")
class MContentSort extends Serializable {

	/**
	 * Sort for last update.
	 */
	//#SWG#@ApiModelProperty(value = """Sort for last update.""")
	@BeanProperty 
	var lastUpdate: MSimpleSort =_
	def withlastUpdate(p:MSimpleSort):this.type ={ 	this.lastUpdate = p; 	this }

	/**
	 * Sort for creation date.
	 */
	//#SWG#@ApiModelProperty(value = """Sort for creation date.""")
	@BeanProperty 
	var creationDate: MSimpleSort =_
	def withcreationDate(p:MSimpleSort):this.type ={ 	this.creationDate = p; 	this }

	/**
	 * Sort for ranking.
	 */
	//#SWG#@ApiModelProperty(value = """Sort for ranking.""")
	@BeanProperty 
	var ranking: MSimpleSort =_
	def withranking(p:MSimpleSort):this.type ={ 	this.ranking = p; 	this }

	/**
	 * Sort content for name. Name is Localized.
	 */
	//#SWG#@ApiModelProperty(value = """Sort content for name. Name is Localized.""")
	@BeanProperty 
	var name: MLocaleSort =_
	def withname(p:MLocaleSort):this.type ={ 	this.name = p; 	this }

}