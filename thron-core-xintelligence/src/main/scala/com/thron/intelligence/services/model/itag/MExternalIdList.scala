package com.thron.intelligence.services.model.itag
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.MExternalId

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MExternalIdList") 
@XmlType(name="MExternalIdList")
//#SWG#@ApiModel(description = """""")
class MExternalIdList extends Serializable {

	/**
	 * list of externalId
	 */
	//#SWG#@ApiModelProperty(value = """list of externalId""")
	@BeanProperty 
	var ids: List[MExternalId] = new ArrayList[MExternalId]
	def withids(p:List[MExternalId]):this.type ={ 	this.ids = p; 	this }

}