package it.newvision.nvp.xcontents.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MRatingProperty") 
@XmlType(name="MRatingProperty")
//#SWG#@ApiModel(description = """""")
class MRatingProperty extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var maxDailyVotesForUser: Integer =_
	def withmaxDailyVotesForUser(p:Integer):this.type ={ 	this.maxDailyVotesForUser = p; 	this }

	/**
	 * The user can vote only once.
	 */
	//#SWG#@ApiModelProperty(value = """The user can vote only once.""" ,required = true)
	@BeanProperty 
	var onlyOneVote: Boolean  = true
	def withonlyOneVote(p:Boolean):this.type ={ 	this.onlyOneVote = p; 	this }

}