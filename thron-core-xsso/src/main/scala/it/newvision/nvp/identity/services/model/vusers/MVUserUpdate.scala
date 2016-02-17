package it.newvision.nvp.identity.services.model.vusers
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.model.MMetadata
import it.newvision.nvp.identity.model.MVUserPreferences
import it.newvision.nvp.identity.model.MVUserDetail
import it.newvision.nvp.identity.services.model.common.MUpdater

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Empty attributes are not updated in the platform.
 * You cannot update a single element of an array or a complex attribute, all of
 * its elements must be included, otherwise they will be overwritten. To remove a
 * specific attribute instead, you will have to include it within the "patch"
 * parameter, as illustrated in the model description.
 */
@XmlRootElement(name="MVUserUpdate") 
@XmlType(name="MVUserUpdate")
//#SWG#@ApiModel(description = """Empty attributes are not updated in the platform.
//#SWGNL#You cannot update a single element of an array or a complex attribute, all of its elements must be included, otherwise they will be overwritten. To remove a specific attribute instead, you will have to include it within the "patch" parameter, as illustrated in the model description.""")
class MVUserUpdate extends MUpdater with Serializable  {

	/**
	 * Deprecated.
	 * Optional. List of generic custom metadata for the group.
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated.
	//#SWGNL#Optional. List of generic custom metadata for the group.""")
	@BeanProperty 
	@Deprecated
	var metadata: List[MMetadata] =_
	@Deprecated
	def withmetadata(p:List[MMetadata]):this.type ={ 	this.metadata = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var userPreferences: MVUserPreferences =_
	def withuserPreferences(p:MVUserPreferences):this.type ={ 	this.userPreferences = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var detail: MVUserDetail =_
	def withdetail(p:MVUserDetail):this.type ={ 	this.detail = p; 	this }

}