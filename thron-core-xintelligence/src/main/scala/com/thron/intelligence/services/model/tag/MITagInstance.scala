package com.thron.intelligence.services.model.tag
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.MLocalization
import com.thron.intelligence.model.MSourceIdentifier

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MITagInstance") 
@XmlType(name="MITagInstance")
//#SWG#@ApiModel(description = """""")
class MITagInstance extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var classificationId: String =_
	def withclassificationId(p:String):MITagInstance ={ 	this.classificationId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):MITagInstance ={ 	this.id = p; 	this }

	/**
	 * prettyId of the Tag
	 */
	//#SWG#@ApiModelProperty(value = """prettyId of the Tag""" ,required = true)
	@BeanProperty 
	var prettyId: String =_
	def withprettyId(p:String):MITagInstance ={ 	this.prettyId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var names: List[MLocalization] = new ArrayList[MLocalization]
	def withnames(p:List[MLocalization]):MITagInstance ={ 	this.names = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var status: MEITagStatus =_
	def withstatus(p:MEITagStatus):MITagInstance ={ 	this.status = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var source: List[MSourceIdentifier] = new ArrayList[MSourceIdentifier]
	def withsource(p:List[MSourceIdentifier]):MITagInstance ={ 	this.source = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		//to be defined
		true
	}

}