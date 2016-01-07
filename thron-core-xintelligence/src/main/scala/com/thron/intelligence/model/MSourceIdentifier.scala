package com.thron.intelligence.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Used to identify a specific source.
 * Some object can be created/modified by different source like users, or engines.
 */
@XmlRootElement(name="MSourceIdentifier") 
@XmlType(name="MSourceIdentifier")
//#SWG#@ApiModel(description = """Used to identify a specific source.
//#SWGNL#Some object can be created/modified by different source like users, or engines.""")
class MSourceIdentifier extends Serializable {

	/**
	 * username or appId or engineId
	 */
	//#SWG#@ApiModelProperty(value = """username or appId or engineId""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):MSourceIdentifier ={ 	this.id = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var sourceType: MESourceType =_
	def withsourceType(p:MESourceType):MSourceIdentifier ={ 	this.sourceType = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var displayName: String =_
	def withdisplayName(p:String):MSourceIdentifier ={ 	this.displayName = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import org.apache.commons.lang.StringUtils
				StringUtils.isNotBlank(id) &&
		      Option(sourceType).isDefined
	}

}