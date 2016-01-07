package it.newvision.nvp.xpublisher.services.model.response
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpublisher.model.MPublishedContent
import it.newvision.nvp.xpublisher.model.MRestrictionProperties

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseGetContentsForPlayList") 
@XmlType(name="MResponseGetContentsForPlayList")
//#SWG#@ApiModel(description = """""")
class MResponseGetContentsForPlayList extends MResponsePublisher with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var contents: List[MPublishedContent] = new ArrayList[MPublishedContent]
	def withcontents(p:List[MPublishedContent]):MResponseGetContentsForPlayList ={ 	this.contents = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var properties: MRestrictionProperties =_
	def withproperties(p:MRestrictionProperties):MResponseGetContentsForPlayList ={ 	this.properties = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalResults: Integer =_
	def withtotalResults(p:Integer):MResponseGetContentsForPlayList ={ 	this.totalResults = p; 	this }

}