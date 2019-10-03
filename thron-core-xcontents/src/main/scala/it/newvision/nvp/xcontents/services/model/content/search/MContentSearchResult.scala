package it.newvision.nvp.xcontents.services.model.content.search
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.content.MResponseContent

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MContentSearchResult") 
@XmlType(name="MContentSearchResult")
//#SWG#@ApiModel(description = """""")
class MContentSearchResult extends MResponseContent with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var estimatedTotalResults: Long =_
	def withestimatedTotalResults(p:Long):this.type ={ 	this.estimatedTotalResults = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var items: List[MContentItems] = new ArrayList[MContentItems]
	def withitems(p:List[MContentItems]):this.type ={ 	this.items = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var nextPageToken: String =_
	def withnextPageToken(p:String):this.type ={ 	this.nextPageToken = p; 	this }

}