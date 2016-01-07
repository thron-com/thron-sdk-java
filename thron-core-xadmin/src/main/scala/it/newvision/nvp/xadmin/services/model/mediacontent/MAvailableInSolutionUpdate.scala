package it.newvision.nvp.xadmin.services.model.mediacontent
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MAvailableInSolutionUpdate") 
@XmlType(name="MAvailableInSolutionUpdate")
//#SWG#@ApiModel(description = """""")
class MAvailableInSolutionUpdate extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var availableInSolutions: List[String] = new ArrayList[String]
	def withavailableInSolutions(p:List[String]):MAvailableInSolutionUpdate ={ 	this.availableInSolutions = p; 	this }

}