package it.newvision.nvp.identity.services.model.vusers
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MITagCriteria") 
@XmlType(name="MITagCriteria")
//#SWG#@ApiModel(description = """""")
class MITagCriteria extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var classificationId: String =_
	def withclassificationId(p:String):this.type ={ 	this.classificationId = p; 	this }

	/**
	 * Default value FALSE.
	 * If true, the service exclude from the search the user tagged with a subtree of
	 * the give tag.
	 * Example:
	 * Tagdefinitions:
	 * - tag1
	 *  - tag1.1
	 * User:
	 * - user1 tagged with tag1.1
	 * 
	 * Request 1) {id:tag1, excludeSubNodes:true}
	 *    resultSet = empty
	 * Request 2) {id:tag1, excludeSubNodes:false}
	 *    resultSet = user1
	 */
	//#SWG#@ApiModelProperty(value = """Default value FALSE.
	//#SWGNL#If true, the service exclude from the search the user tagged with a subtree of the give tag.
	//#SWGNL#Example: 
	//#SWGNL#Tagdefinitions:
	//#SWGNL#- tag1
	//#SWGNL#  - tag1.1
	//#SWGNL#User:
	//#SWGNL#- user1 tagged with tag1.1
	//#SWGNL#
	//#SWGNL#Request 1) {id:tag1, excludeSubNodes:true} 
	//#SWGNL#    resultSet = empty
	//#SWGNL#Request 2) {id:tag1, excludeSubNodes:false}
	//#SWGNL#    resultSet = user1""")
	@BeanProperty 
	var excludeSubTree: Boolean =_
	def withexcludeSubTree(p:Boolean):this.type ={ 	this.excludeSubTree = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

}