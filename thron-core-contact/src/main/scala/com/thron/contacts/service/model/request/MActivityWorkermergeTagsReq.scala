package com.thron.contacts.service.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.contacts.service.model.contact.MITagList
import com.thron.contacts.model.MITagLink

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JActivityWorker.mergeTags
 */
@XmlRootElement(name="MActivityWorkermergeTagsReq")
@XmlType(name="MActivityWorkermergeTagsReq")
//#SWG#@ApiModel(description = "Request message for service JActivityWorker.mergeTags")
class MActivityWorkermergeTagsReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var source: MITagList =_
	def withsource(p:MITagList):this.type ={ 	this.source = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var target: MITagLink =_
	def withtarget(p:MITagLink):this.type ={ 	this.target = p; 	this }

}