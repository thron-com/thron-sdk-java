package it.newvision.nvp.xcontents.services.model.cuepoint
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MCuePoint

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Return the list of inserted Cue Points, with the right ids values
 */
@XmlRootElement(name="MResponseAddCuePoints") 
@XmlType(name="MResponseAddCuePoints")
//#SWG#@ApiModel(description = """Return the list of inserted Cue Points, with the right ids values""")
class MResponseAddCuePoints extends MResponseCuePoint with Serializable  {

	/**
	 * list of cue points
	 */
	//#SWG#@ApiModelProperty(value = """list of cue points""")
	@BeanProperty 
	var cuePoints: List[MCuePoint] = new ArrayList[MCuePoint]
	def withcuePoints(p:List[MCuePoint]):this.type ={ 	this.cuePoints = p; 	this }

}