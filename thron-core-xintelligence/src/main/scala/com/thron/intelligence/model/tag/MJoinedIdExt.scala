package com.thron.intelligence.model.tag
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.MEIdType
import com.thron.intelligence.model.MExternalId

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * <ul>
 * 	<li></li>
 * </ul>
 */
@XmlRootElement(name="MJoinedIdExt") 
@XmlType(name="MJoinedIdExt")
//#SWG#@ApiModel(description = """<ul>
//#SWGNL#	<li></li>
//#SWGNL#</ul>""")
class MJoinedIdExt extends MJoinedId with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var idType: MEIdType =_
	def withidType(p:MEIdType):this.type ={ 	this.idType = p; 	this }

	/**
	 * source iTagDefinition Id. Used to identify the combined tag Id
	 */
	//#SWG#@ApiModelProperty(value = """source iTagDefinition Id. Used to identify the combined tag Id""")
	@BeanProperty 
	var sourceTagId: String =_
	def withsourceTagId(p:String):this.type ={ 	this.sourceTagId = p; 	this }

	/**
	 * @param id : String
	 * @param status : MEStatus
	 * @param idType : MEIdType
	 * @param sourceTagId : String
	 * @return 
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(id: String, 
			status: MEStatus, 
			idType: MEIdType, 
			sourceTagId: String){
		this()
		this.id = id
		Option(status).foreach{x=> this.status = x}
		Option(sourceTagId).foreach{x=> this.sourceTagId = x}
		this.idType = idType
	}

	/**
	 * @param eid : MExternalId
	 * @param status : MEStatus
	 * @param sourceTagId : String
	 * @return 
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(eid: MExternalId, 
			status: MEStatus, 
			sourceTagId: String){
		this()
		this.id = eid.getExtId
		Option(status).foreach{x=>this.status = x }
		Option(sourceTagId).foreach{x=>this.sourceTagId = x }
		this.idType = com.thron.intelligence.model.MEIdType.EXTERNAL
	}

}