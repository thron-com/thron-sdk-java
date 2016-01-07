package it.newvision.nvp.xpublisher.services.model.response
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseFindContentsByMetadata") 
@XmlType(name="MResponseFindContentsByMetadata")
//#SWG#@ApiModel(description = """""")
class MResponseFindContentsByMetadata extends MResponsePublisher with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalResults: Integer =_
	def withtotalResults(p:Integer):MResponseFindContentsByMetadata ={ 	this.totalResults = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var contents: List[MPublishedContentExt] = new ArrayList[MPublishedContentExt]
	  def withcontents(p:List[MPublishedContentExt]):MResponseFindContentsByMetadata ={ 	this.contents = p; 	this }

}