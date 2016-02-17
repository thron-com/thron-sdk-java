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
@XmlRootElement(name="MCuePointList") 
@XmlType(name="MCuePointList")
//#SWG#@ApiModel(description = """""")
class MCuePointList extends Serializable {

	/**
	 * list of cue points
	 */
	//#SWG#@ApiModelProperty(value = """list of cue points""")
	@BeanProperty 
	var cuePoints: List[MCuePoint] = new ArrayList[MCuePoint]
	def withcuePoints(p:List[MCuePoint]):this.type ={ 	this.cuePoints = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def filterEmpty(){
		import collection.JavaConversions._
		cuePoints = cuePoints filterNot {_ == null}
	}

}