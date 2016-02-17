package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.classification.MClassificationSearchCriteria
import com.thron.intelligence.services.model.classification.MEClassificationOrderBy

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JClassification.list
 */
@XmlRootElement(name="MClassificationlistReq")
@XmlType(name="MClassificationlistReq")
//#SWG#@ApiModel(description = "Request message for service JClassification.list")
class MClassificationlistReq extends Serializable {

	/**
	 * Optional
	 */
	//#SWG#@ApiModelProperty(value = """Optional""", required = true)
	@BeanProperty
	var criteria: MClassificationSearchCriteria =_
	def withcriteria(p:MClassificationSearchCriteria):this.type ={ 	this.criteria = p; 	this }

	/**
	 * Optional
	 */
	//#SWG#@ApiModelProperty(value = """Optional""", required = true)
	@BeanProperty
	var orderBy: MEClassificationOrderBy =_
	def withorderBy(p:MEClassificationOrderBy):this.type ={ 	this.orderBy = p; 	this }

	/**
	 * Optional.
	 * Default value is 0
	 */
	//#SWG#@ApiModelProperty(value = """Optional.
	//#SWGNL#Default value is 0""", required = true)
	@BeanProperty
	var offset: Integer =_
	def withoffset(p:Integer):this.type ={ 	this.offset = p; 	this }

	/**
	 * Optional. Default value is 50
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Default value is 50""", required = true)
	@BeanProperty
	var limit: Integer =_
	def withlimit(p:Integer):this.type ={ 	this.limit = p; 	this }

}