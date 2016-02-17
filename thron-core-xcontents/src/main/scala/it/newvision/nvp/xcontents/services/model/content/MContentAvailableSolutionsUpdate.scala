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
/**
 * Use this properties to set the available solutions (VIEW,PLAY,MOVE.TALK) for
 * the specified content.
 */
@XmlRootElement(name="MContentAvailableSolutionsUpdate") 
@XmlType(name="MContentAvailableSolutionsUpdate")
//#SWG#@ApiModel(description = """Use this properties to set the available solutions (VIEW,PLAY,MOVE.TALK) for the specified content.""")
class MContentAvailableSolutionsUpdate extends Serializable {

	/**
	 * Use this properties to set the available solutions (VIEW,PLAY,MOVE.TALK) for
	 * the specified content.
	 */
	//#SWG#@ApiModelProperty(value = """Use this properties to set the available solutions (VIEW,PLAY,MOVE.TALK) for the specified content.""")
	@BeanProperty 
	var availableInSolutions: List[String] = new ArrayList[String]
	def withavailableInSolutions(p:List[String]):this.type ={ 	this.availableInSolutions = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def filterEmpty(){
		import collection.JavaConversions._
		availableInSolutions = availableInSolutions filterNot {_.isEmpty}
	}

}