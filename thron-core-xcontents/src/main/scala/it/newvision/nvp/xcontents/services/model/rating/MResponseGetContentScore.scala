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
@XmlRootElement(name="MResponseGetContentScore") 
@XmlType(name="MResponseGetContentScore")
//#SWG#@ApiModel(description = """""")
class MResponseGetContentScore extends MResponseRating with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var score: MRatingAverage =_
	def withscore(p:MRatingAverage):MResponseGetContentScore ={ 	this.score = p; 	this }

}