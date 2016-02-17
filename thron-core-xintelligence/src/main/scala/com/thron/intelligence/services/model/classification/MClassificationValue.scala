package com.thron.intelligence.services.model.classification
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.classification.MEClassificationType
import com.thron.intelligence.model.classification.MClassificationEntity
import com.thron.intelligence.model.MLocalization

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MClassificationValue") 
@XmlType(name="MClassificationValue")
//#SWG#@ApiModel(description = """""")
class MClassificationValue extends Serializable {

	/**
	 * visibile in Reports
	 */
	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var active: Boolean  = true
	def withactive(p:Boolean):this.type ={ 	this.active = p; 	this }

	/**
	 * can be TARGET/TOPIC/CUSTOM
	 */
	//#SWG#@ApiModelProperty(value = """can be TARGET/TOPIC/CUSTOM""" ,required = true)
	@BeanProperty 
	var classificationType: MEClassificationType =_
	def withclassificationType(p:MEClassificationType):this.type ={ 	this.classificationType = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var entities: List[MClassificationEntity] = new ArrayList[MClassificationEntity]
	def withentities(p:List[MClassificationEntity]):this.type ={ 	this.entities = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var names: List[MLocalization] = new ArrayList[MLocalization]
	def withnames(p:List[MLocalization]):this.type ={ 	this.names = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import scala.collection.JavaConversions._
		import com.thron.intelligence.model.classification._
	
		def istopic()={
			//topic must have relation IS for CONTENT
			this.entities.exists{e=> 
					e.relationType == MEEntityTagRelationType.IS && 
					e.applicableTo==MEClassificationEntityType.CONTENT
			}&& this.entities.exists{e=> 
					e.relationType == MEEntityTagRelationType.INTERESTED && 
					e.applicableTo==MEClassificationEntityType.USER
			}  
		}
		def istarget()={
			//topic must have relation IS for USER
			this.entities.exists{e=> 
					e.relationType == MEEntityTagRelationType.IS && 
					e.applicableTo==MEClassificationEntityType.USER
			}&& this.entities.exists{e=> 
					e.relationType == MEEntityTagRelationType.INTERESTED && 
					e.applicableTo==MEClassificationEntityType.CONTENT
			}  
		}
		Option(classificationType).isDefined &&
		Option(names).exists(_.forall(_.isValid())) &&
		Option(entities).exists(_.forall(_.isValid())) &&
		(
		this.classificationType match{
		 case MEClassificationType.TOPIC => istopic()
		 case MEClassificationType.TARGET => istarget()
		 case MEClassificationType.CUSTOM => istarget() || istopic()	
		}
		)
	}

}