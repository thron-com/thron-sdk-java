package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.embed.MPlayerEmbedTemplateRoleList

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JPlayerEmbedTemplate.addRoles
 */
@XmlRootElement(name="MPlayerEmbedTemplateaddRolesReq")
@XmlType(name="MPlayerEmbedTemplateaddRolesReq")
//#SWG#@ApiModel(description = "Request message for service JPlayerEmbedTemplate.addRoles")
class MPlayerEmbedTemplateaddRolesReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var roles: MPlayerEmbedTemplateRoleList =_
	def withroles(p:MPlayerEmbedTemplateRoleList):this.type ={ 	this.roles = p; 	this }

}