package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float}  
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.common.MCredential
import it.newvision.nvp.xcontents.model.MWeeboProvider

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MProviderpublishInWeeboReq") 
 @XmlType(name="MProviderpublishInWeeboReq")
class MProviderpublishInWeeboReq extends Serializable {

	@BeanProperty 
	var credential: MCredential =_
	def withcredential(p:MCredential):MProviderpublishInWeeboReq ={ 	this.credential = p; 	this }

	@BeanProperty 
	var contentId: String =_
	def withcontentId(p:String):MProviderpublishInWeeboReq ={ 	this.contentId = p; 	this }

	@BeanProperty 
	var provider: MWeeboProvider =_
	def withprovider(p:MWeeboProvider):MProviderpublishInWeeboReq ={ 	this.provider = p; 	this }

	/**
	 * Optional. For Acl validation
	 */
	@BeanProperty 
	var categoryIdForAcl: String =_
	def withcategoryIdForAcl(p:String):MProviderpublishInWeeboReq ={ 	this.categoryIdForAcl = p; 	this }

}