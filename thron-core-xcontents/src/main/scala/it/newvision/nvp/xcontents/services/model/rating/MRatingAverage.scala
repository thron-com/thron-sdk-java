package it.newvision.nvp.xcontents.services.model.rating
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MRatingAverage") 
@XmlType(name="MRatingAverage")
//#SWG#@ApiModel(description = """""")
class MRatingAverage extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var numberOfVotes: Integer =_
	def withnumberOfVotes(p:Integer):this.type ={ 	this.numberOfVotes = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var scoreAverage: Double =_
	def withscoreAverage(p:Double):this.type ={ 	this.scoreAverage = p; 	this }

}