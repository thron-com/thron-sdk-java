package com.thron.intelligence.model.classification
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.MSourceIdentifier
import com.thron.intelligence.model.MLocalization

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * The Classification class for intelligence.
 * Is a class that identifies a criteria to group instances of a certain entity
 * type; an example of classification is the TARGET. Each classification can
 * define constraints necessary  for the membership of the instances of a certain
 * type of entity. These constraints may be imposed as a condition to create
 * instances of that type of entity (eg. I want for every new content, the target
 * must be specified).
 * To better understand the goal of the classification, is possible to define a
 * question (ClassificationEntity.question attribute) necessary to drive the
 * definition of tags.
 * 
 * Constraints:
 * <ul>
 * 	<li>entities.realtionType: Only one relationtype "IS" inside the array </li>
 * 	<li>entities.applicableTo: duplicates for the same entity are not allowed.
 * </li>
 * </ul>
 */
@XmlRootElement(name="MClassification") 
@XmlType(name="MClassification")
//#SWG#@ApiModel(description = """The Classification class for intelligence.
//#SWGNL#Is a class that identifies a criteria to group instances of a certain entity type; an example of classification is the TARGET. Each classification can define constraints necessary  for the membership of the instances of a certain type of entity. These constraints may be imposed as a condition to create instances of that type of entity (eg. I want for every new content, the target  must be specified).
//#SWGNL#To better understand the goal of the classification, is possible to define a question (ClassificationEntity.question attribute) necessary to drive the definition of tags.
//#SWGNL#
//#SWGNL#Constraints:
//#SWGNL#<ul>
//#SWGNL#	<li>entities.realtionType: Only one relationtype "IS" inside the array </li>
//#SWGNL#	<li>entities.applicableTo: duplicates for the same entity are not allowed. </li>
//#SWGNL#</ul>""")
class MClassification extends Serializable {

	/**
	 * visibile in Reports
	 */
	//#SWG#@ApiModelProperty(value = """""" ,required = true)
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

	/**
	 * userId of the owner
	 */
	//#SWG#@ApiModelProperty(value = """userId of the owner""")
	@BeanProperty 
	var createdBy: MSourceIdentifier =_
	def withcreatedBy(p:MSourceIdentifier):this.type ={ 	this.createdBy = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var createdDate: Date  = new Date()
	def withcreatedDate(p:Date):this.type ={ 	this.createdDate = p; 	this }

	/**
	 * Automatically generated
	 */
	//#SWG#@ApiModelProperty(value = """Automatically generated""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var modifiedDate: Date =_
	def withmodifiedDate(p:Date):this.type ={ 	this.modifiedDate = p; 	this }

	/**
	 * label and description values for the classification in multilocale
	 */
	//#SWG#@ApiModelProperty(value = """label and description values for the classification in multilocale""")
	@BeanProperty 
	var names: List[MLocalization] = new ArrayList[MLocalization]
	def withnames(p:List[MLocalization]):this.type ={ 	this.names = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var removed: Boolean  = false
	def withremoved(p:Boolean):this.type ={ 	this.removed = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var entities: List[MClassificationEntity] = new ArrayList[MClassificationEntity]
	  def withentities(p:List[MClassificationEntity]):this.type ={ 	this.entities = p; 	this }

	/**
	 * CUSTOM classification can be like TOPIC or TARGET classes, based on the entities setup.
	 * @return MEClassificationType
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def classLike():MEClassificationType ={
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
	
		this.classificationType match{
			case MEClassificationType.CUSTOM =>
			if(istopic()){
					MEClassificationType.TOPIC
			}else if(istarget()){
					MEClassificationType.TARGET
			} else {
				MEClassificationType.CUSTOM
			}
			case _=> this.classificationType
		}
	
	
	
	
	
	
	}

}