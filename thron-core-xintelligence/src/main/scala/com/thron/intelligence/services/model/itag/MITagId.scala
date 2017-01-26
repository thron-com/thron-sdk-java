package com.thron.intelligence.services.model.itag
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MITagId") 
@XmlType(name="MITagId")
//#SWG#@ApiModel(description = """""")
class MITagId extends Serializable {

	/**
	 * the tag definition id.
	 * TagDefinition.id, ITagDefinition.prettyId or ITagDefinition.externalId
	 */
	//#SWG#@ApiModelProperty(value = """the tag definition id.
	//#SWGNL#TagDefinition.id, ITagDefinition.prettyId or ITagDefinition.externalId""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import collection.JavaConversions._
		import org.apache.commons.lang.StringUtils
		StringUtils.isNotBlank(id) 
		//&& Option(score).forall(x=> x<=100)
	}

}