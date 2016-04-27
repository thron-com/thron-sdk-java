package com.thron.intelligence.model.itag
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
	 * @param id : String
	 * @param status : MEStatus
	 * @param idType : MEIdType
	 * @return 
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(id: String, 
			status: MEStatus, 
			idType: MEIdType){
		this()
		this.id = id
		Option(status).foreach{x=> this.status = x}
		this.idType = idType
	}

	/**
	 * @param eid : MExternalId
	 * @param status : MEStatus
	 * @return 
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(eid: MExternalId, 
			status: MEStatus){
		//this()
		//this.id = eid.getExtId
		//Option(status).foreach{x=>this.status =
		//x }
		//this.idType = com.thron.intelligence.
		//model.MEIdType.EXTERNAL

		this()
		this.id = eid.getExtId
		Option(status).foreach{x=>this.status = x }
		this.idType = com.thron.intelligence.model.MEIdType.EXTERNAL
	}

}