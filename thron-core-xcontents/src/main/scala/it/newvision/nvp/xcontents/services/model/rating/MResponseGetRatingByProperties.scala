package it.newvision.nvp.xcontents.services.model.rating
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MRating

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseGetRatingByProperties") 
@XmlType(name="MResponseGetRatingByProperties")
//#SWG#@ApiModel(description = """""")
class MResponseGetRatingByProperties extends MResponseRating with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var rates: List[MRating] = new ArrayList[MRating]
	def withrates(p:List[MRating]):this.type ={ 	this.rates = p; 	this }

	/**
	 * total number of results
	 */
	//#SWG#@ApiModelProperty(value = """total number of results""" ,required = true)
	@BeanProperty 
	var totalResults: Integer  = 0
	def withtotalResults(p:Integer):this.type ={ 	this.totalResults = p; 	this }

}