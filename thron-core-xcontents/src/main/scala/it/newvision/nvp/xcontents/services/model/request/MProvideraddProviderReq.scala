package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float}  
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.common.MCredential
import it.newvision.nvp.xcontents.model.MGenericProvider

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MProvideraddProviderReq") 
 @XmlType(name="MProvideraddProviderReq")
class MProvideraddProviderReq extends Serializable {

	@BeanProperty 
	var credential: MCredential =_
	def withcredential(p:MCredential):MProvideraddProviderReq ={ 	this.credential = p; 	this }

	@BeanProperty 
	var contentId: String =_
	def withcontentId(p:String):MProvideraddProviderReq ={ 	this.contentId = p; 	this }

	@BeanProperty 
	var provider: MGenericProvider =_
	def withprovider(p:MGenericProvider):MProvideraddProviderReq ={ 	this.provider = p; 	this }

	/**
	 * Optional. For Acl validation
	 */
	@BeanProperty 
	var categoryIdForAcl: String =_
	def withcategoryIdForAcl(p:String):MProvideraddProviderReq ={ 	this.categoryIdForAcl = p; 	this }

}