package it.newvision.nvp.xcontents.services.model.content
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * This class is used to filter contents by imetadata (only metadata definition of
 * type KEY)
 */
@XmlRootElement(name="MIMetadataKeyCriteriaOption") 
@XmlType(name="MIMetadataKeyCriteriaOption")
//#SWG#@ApiModel(description = """This class is used to filter contents by imetadata (only metadata definition of type KEY)""")
class MIMetadataKeyCriteriaOption extends Serializable {

	/**
	 * constraints: max size 5
	 */
	//#SWG#@ApiModelProperty(value = """constraints: max size 5""")
	@BeanProperty 
	var imetadata: List[MIMetadataCriteria] = new ArrayList[MIMetadataCriteria]
	def withimetadata(p:List[MIMetadataCriteria]):this.type ={ 	this.imetadata = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import collection.JavaConversions._
		import org.apache.commons.lang.StringUtils
		imetadata.forall(i=>StringUtils.isNotEmpty(i.classificationId) && 
		StringUtils.isNotEmpty(i.key) &&
		Option(i.value).isDefined
		) && imetadata.size()<=5
	}

}