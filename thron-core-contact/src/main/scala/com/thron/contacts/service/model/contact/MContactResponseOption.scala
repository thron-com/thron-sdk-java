package com.thron.contacts.service.model.contact
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MContactResponseOption") 
@XmlType(name="MContactResponseOption")
//#SWG#@ApiModel(description = """""")
class MContactResponseOption extends Serializable {

	/**
	 * Whether or not result itags will ignore any combining.
	 * <b>
	 * </b><b>Example 1:</b>
	 * itag T1 is combined into itag T2.
	 * Entity E1 is tagged T1.
	 * If <i>ignoreITagCombining</i> is true, E1 itags will include T1; else E1 itags
	 * will include T2.
	 * 
	 * <b>
	 * </b><b>Example 2:</b>
	 * itag T1 is combined into itag T2.
	 * Entity E1 is tagged both T1 and T2.
	 * If <i>ignoreITagCombining</i> is true, E1 itags will include both T1 and T2;
	 * else E1 itags will include T2 only.
	 */
	//#SWG#@ApiModelProperty(value = """Whether or not result itags will ignore any combining.
	//#SWGNL#<b>
	//#SWGNL#</b><b>Example 1:</b>
	//#SWGNL#itag T1 is combined into itag T2.
	//#SWGNL#Entity E1 is tagged T1.
	//#SWGNL#If <i>ignoreITagCombining</i> is true, E1 itags will include T1; else E1 itags will include T2.
	//#SWGNL#
	//#SWGNL#<b>
	//#SWGNL#</b><b>Example 2:</b>
	//#SWGNL#itag T1 is combined into itag T2.
	//#SWGNL#Entity E1 is tagged both T1 and T2.
	//#SWGNL#If <i>ignoreITagCombining</i> is true, E1 itags will include both T1 and T2; else E1 itags will include T2 only.""" ,required = true)
	@BeanProperty 
	var ignoreITagCombining: Boolean  = false
	def withignoreITagCombining(p:Boolean):this.type ={ 	this.ignoreITagCombining = p; 	this }

	/**
	 * return list of itags for each contact
	 */
	//#SWG#@ApiModelProperty(value = """return list of itags for each contact""" ,required = true)
	@BeanProperty 
	var itags: Boolean  = false
	def withitags(p:Boolean):this.type ={ 	this.itags = p; 	this }

	/**
	 * return the key information for each contact
	 */
	//#SWG#@ApiModelProperty(value = """return the key information for each contact""" ,required = true)
	@BeanProperty 
	var keys: Boolean  = false
	def withkeys(p:Boolean):this.type ={ 	this.keys = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var oldIds: Boolean  = false
	def witholdIds(p:Boolean):this.type ={ 	this.oldIds = p; 	this }

}