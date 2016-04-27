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
@XmlRootElement(name="MResponseDeliveryGetPlaylistContents") 
@XmlType(name="MResponseDeliveryGetPlaylistContents")
//#SWG#@ApiModel(description = """""")
class MResponseDeliveryGetPlaylistContents extends MResponseDelivery with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var contents: List[MContentWallMinimal] = new ArrayList[MContentWallMinimal]
	def withcontents(p:List[MContentWallMinimal]):this.type ={ 	this.contents = p; 	this }

	/**
	 * The global status of the playlist: DRAFT,PUBLISH_IN_PROGRESS,PUBLISHED,....
	 * The value depends on the status of each single item of the playlist.
	 */
	//#SWG#@ApiModelProperty(value = """The global status of the playlist: DRAFT,PUBLISH_IN_PROGRESS,PUBLISHED,....
	//#SWGNL#The value depends on the status of each single item of the playlist.""" ,required = true)
	@BeanProperty 
	var status: String =_
	def withstatus(p:String):this.type ={ 	this.status = p; 	this }

	/**
	 * total number of results
	 */
	//#SWG#@ApiModelProperty(value = """total number of results""" ,required = true)
	@BeanProperty 
	var totalResults: Integer  = 0
	def withtotalResults(p:Integer):this.type ={ 	this.totalResults = p; 	this }

}