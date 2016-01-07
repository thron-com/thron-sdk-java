package it.newvision.nvp.xcontents.services.model.metadata
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MMetadata

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Be aware that each metadata already defined for the specific contentId will be
 * overwritten by those defined in the body of the request; therefore, if specific
 * value is omitted, related metadata will be deleted; on the other hand, if an
 * empty value is included in the request, its metadata value will be set to null.
 */
@XmlRootElement(name="MMetadataUpdate") 
@XmlType(name="MMetadataUpdate")
//#SWG#@ApiModel(description = """Be aware that each metadata already defined for the specific contentId will be overwritten by those defined in the body of the request; therefore, if specific value is omitted, related metadata will be deleted; on the other hand, if an empty value is included in the request, its metadata value will be set to null.""")
class MMetadataUpdate extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var metadata: List[MMetadata] = new ArrayList[MMetadata]
	def withmetadata(p:List[MMetadata]):MMetadataUpdate ={ 	this.metadata = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def filterEmpty(){
		import collection.JavaConversions._
		metadata = metadata filterNot {_ == null}
	}

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import scala.collection.JavaConversions._
		metadata.exists(m=> m.isValid())
	}

}