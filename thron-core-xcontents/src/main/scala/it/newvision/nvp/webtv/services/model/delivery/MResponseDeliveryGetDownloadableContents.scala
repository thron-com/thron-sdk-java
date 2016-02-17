package it.newvision.nvp.webtv.services.model.delivery
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseDeliveryGetDownloadableContents") 
@XmlType(name="MResponseDeliveryGetDownloadableContents")
//#SWG#@ApiModel(description = """""")
class MResponseDeliveryGetDownloadableContents extends MResponseDelivery with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var contents: List[MContentWallMinimal] = new ArrayList[MContentWallMinimal]
	def withcontents(p:List[MContentWallMinimal]):this.type ={ 	this.contents = p; 	this }

	/**
	 * total number of results
	 */
	//#SWG#@ApiModelProperty(value = """total number of results""" ,required = true)
	@BeanProperty 
	var totalResults: Integer  = 0
	def withtotalResults(p:Integer):this.type ={ 	this.totalResults = p; 	this }

}