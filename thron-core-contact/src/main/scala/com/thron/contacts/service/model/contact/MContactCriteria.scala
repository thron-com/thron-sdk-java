package com.thron.contacts.service.model.contact
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.contacts.service.model.MDateRange
import com.thron.contacts.model.MIdentityKey

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MContactCriteria") 
@XmlType(name="MContactCriteria")
//#SWG#@ApiModel(description = """""")
class MContactCriteria extends Serializable {

	/**
	 * filter by accessed date.
	 */
	//#SWG#@ApiModelProperty(value = """filter by accessed date.""")
	@BeanProperty 
	var accessedDateRange: MDateRange =_
	def withaccessedDateRange(p:MDateRange):this.type ={ 	this.accessedDateRange = p; 	this }

	/**
	 * contact Ids or contact oldIds
	 */
	//#SWG#@ApiModelProperty(value = """contact Ids or contact oldIds""")
	@BeanProperty 
	var ids: List[String] = new ArrayList[String]
	def withids(p:List[String]):this.type ={ 	this.ids = p; 	this }

	/**
	 * list of identity keys:
	 * iks.keys should be in lowercase.
	 */
	//#SWG#@ApiModelProperty(value = """list of identity keys:
	//#SWGNL#iks.keys should be in lowercase.""")
	@BeanProperty 
	var iks: List[MIdentityKey] = new ArrayList[MIdentityKey]
	def withiks(p:List[MIdentityKey]):this.type ={ 	this.iks = p; 	this }

	/**
	 * search contacts with specific intelligence tags. The list of elements use the
	 * AND/OR operator.
	 * 
	 * Constraints:
	 * <ul>
	 * 	<li>max length 5</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """search contacts with specific intelligence tags. The list of elements use the AND/OR operator.
	//#SWGNL#
	//#SWGNL#Constraints:
	//#SWGNL#<ul>
	//#SWGNL#	<li>max length 5</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var itagOp: MITagCriteriaOption =_
	def withitagOp(p:MITagCriteriaOption):this.type ={ 	this.itagOp = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var contactType: MEContactType =_
	def withcontactType(p:MEContactType):this.type ={ 	this.contactType = p; 	this }

}