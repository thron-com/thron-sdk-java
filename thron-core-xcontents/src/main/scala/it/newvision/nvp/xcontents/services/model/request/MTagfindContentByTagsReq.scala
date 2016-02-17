package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.common.MCredential
import it.newvision.nvp.xcontents.services.model.tag.MTagCriteria

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MTagfindContentByTagsReq") 
 @XmlType(name="MTagfindContentByTagsReq")
class MTagfindContentByTagsReq extends Serializable {

	@BeanProperty 
	var client: MCredential =_
	def withclient(p:MCredential):this.type ={ 	this.client = p; 	this }

	@BeanProperty 
	var criteria: MTagCriteria =_
	def withcriteria(p:MTagCriteria):this.type ={ 	this.criteria = p; 	this }

	@BeanProperty 
	var offset: Integer =_
	def withoffset(p:Integer):this.type ={ 	this.offset = p; 	this }

	@BeanProperty 
	var numberOfResult: Integer =_
	def withnumberOfResult(p:Integer):this.type ={ 	this.numberOfResult = p; 	this }

}