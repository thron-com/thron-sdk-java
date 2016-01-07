package it.newvision.nvp.xcontents.services.model.category
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MPrettyId

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseCategoryVerifyPrettyId") 
@XmlType(name="MResponseCategoryVerifyPrettyId")
//#SWG#@ApiModel(description = """""")
class MResponseCategoryVerifyPrettyId extends MResponseCategory with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var bestPrettyId: MPrettyId =_
	def withbestPrettyId(p:MPrettyId):MResponseCategoryVerifyPrettyId ={ 	this.bestPrettyId = p; 	this }

	/**
	 * List of alternative valid category prettyIds
	 */
	//#SWG#@ApiModelProperty(value = """List of alternative valid category prettyIds""")
	@BeanProperty 
	var suggestedPrettyIds: List[MPrettyId] = new ArrayList[MPrettyId]
	def withsuggestedPrettyIds(p:List[MPrettyId]):MResponseCategoryVerifyPrettyId ={ 	this.suggestedPrettyIds = p; 	this }

}