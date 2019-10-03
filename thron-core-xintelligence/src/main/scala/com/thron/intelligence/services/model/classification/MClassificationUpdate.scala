package com.thron.intelligence.services.model.classification
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.classification.MClassificationEntity
import com.thron.intelligence.model.MLocalization
import com.thron.intelligence.services.model.common.MUpdater

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Empty attributes are not updated in the platform.
 * You cannot update a single element of an array or a complex attribute, all of
 * its elements must be included, otherwise they will be overwritten. To remove a
 * specific attribute instead, you will have to include it within the "patch"
 * parameter, as illustrated in the model description.
 */
@XmlRootElement(name="MClassificationUpdate") 
@XmlType(name="MClassificationUpdate")
//#SWG#@ApiModel(description = """Empty attributes are not updated in the platform.
//#SWGNL#You cannot update a single element of an array or a complex attribute, all of its elements must be included, otherwise they will be overwritten. To remove a specific attribute instead, you will have to include it within the "patch" parameter, as illustrated in the model description.""")
class MClassificationUpdate extends MUpdater with Serializable  {

	/**
	 * v
	 */
	//#SWG#@ApiModelProperty(value = """v""")
	@BeanProperty 
	var active: Boolean =_
	def withactive(p:Boolean):this.type ={ 	this.active = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var entities: List[MClassificationEntity] =_
	def withentities(p:List[MClassificationEntity]):this.type ={ 	this.entities = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var names: List[MLocalization] =_
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
		Option(names).forall(_.forall(_.isValid())) &&
		Option(entities).forall(_.forall(_.isValid()) && (istarget() || istopic()))
	}

}