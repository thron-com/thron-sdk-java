package it.newvision.nvp.identity.services.model.vusers
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
 * Class used to define witch details of VUser are required in the response like:
 * <ul>
 * 	<li>the list of ownedAcl</li>
 * 	<li>the list of derivedRolesAndCapabilities</li>
 * </ul>
 */
@XmlRootElement(name="MVUserFieldsOption") 
@XmlType(name="MVUserFieldsOption")
//#SWG#@ApiModel(description = """Class used to define witch details of VUser are required in the response like:
//#SWGNL#<ul>
//#SWGNL#	<li>the list of ownedAcl</li>
//#SWGNL#	<li>the list of derivedRolesAndCapabilities</li>
//#SWGNL#</ul>""")
class MVUserFieldsOption extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var returnOwnAcl: Boolean  = false
	def withreturnOwnAcl(p:Boolean):this.type ={ 	this.returnOwnAcl = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var returnItags: Boolean  = false
	def withreturnItags(p:Boolean):this.type ={ 	this.returnItags = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var returnImetadata: Boolean  = false
	def withreturnImetadata(p:Boolean):this.type ={ 	this.returnImetadata = p; 	this }

}