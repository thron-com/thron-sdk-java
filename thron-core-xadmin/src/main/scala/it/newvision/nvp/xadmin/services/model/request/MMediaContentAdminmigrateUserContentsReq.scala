package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MMediaContentAdminmigrateUserContentsReq") 
 @XmlType(name="MMediaContentAdminmigrateUserContentsReq")
class MMediaContentAdminmigrateUserContentsReq extends Serializable {

	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):MMediaContentAdminmigrateUserContentsReq ={ 	this.clientId = p; 	this }

	/**
	 * the source userId
	 */
	@BeanProperty 
	var userId1: String =_
	def withuserId1(p:String):MMediaContentAdminmigrateUserContentsReq ={ 	this.userId1 = p; 	this }

	/**
	 * the targer userId
	 */
	@BeanProperty 
	var userId2: String =_
	def withuserId2(p:String):MMediaContentAdminmigrateUserContentsReq ={ 	this.userId2 = p; 	this }

}