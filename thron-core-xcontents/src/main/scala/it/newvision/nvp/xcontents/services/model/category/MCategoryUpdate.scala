package it.newvision.nvp.xcontents.services.model.category
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MMetadata
import it.newvision.nvp.xcontents.model.MCategory
import it.newvision.nvp.xcontents.services.model.common.MUpdater

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
@XmlRootElement(name="MCategoryUpdate") 
@XmlType(name="MCategoryUpdate")
//#SWG#@ApiModel(description = """Empty attributes are not updated in the platform.
//#SWGNL#You cannot update a single element of an array or a complex attribute, all of its elements must be included, otherwise they will be overwritten. To remove a specific attribute instead, you will have to include it within the "patch" parameter, as illustrated in the model description.""")
class MCategoryUpdate extends MUpdater with Serializable  {

	/**
	 * used to "mark" and filter the categories based on a specific solution (Apps). A
	 * category can be used by one ore more Applications.
	 */
	//#SWG#@ApiModelProperty(value = """used to "mark" and filter the categories based on a specific solution (Apps). A category can be used by one ore more Applications.""")
	@BeanProperty 
	@Deprecated
	var availableInSolutions: List[String] =_
	@Deprecated
	def withavailableInSolutions(p:List[String]):MCategoryUpdate ={ 	this.availableInSolutions = p; 	this }

	/**
	 * Deprecated.
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated.""")
	@BeanProperty 
	@Deprecated
	var metadatas: List[MMetadata] =_
	@Deprecated
	def withmetadatas(p:List[MMetadata]):MCategoryUpdate ={ 	this.metadatas = p; 	this }

	/**
	 * used for custom lexicographical order of categories. The field in used in
	 * JCategory.findByProperties (MECategoryOrderBy.sortingField_A/D) to sort the
	 * result set.
	 */
	//#SWG#@ApiModelProperty(value = """used for custom lexicographical order of categories. The field in used in JCategory.findByProperties (MECategoryOrderBy.sortingField_A/D) to sort the result set.""")
	@BeanProperty 
	var sortingField: String =_
	def withsortingField(p:String):MCategoryUpdate ={ 	this.sortingField = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def filterEmpty(){
		import collection.JavaConversions._
		Option(availableInSolutions) foreach {x=> availableInSolutions = x filterNot {_.isEmpty}}
		Option(metadatas) foreach {x=> metadatas = x filterNot {_ == null}}
	}

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import collection.JavaConversions._
		Option(metadatas).forall(ms=> !ms.exists {m =>
					metadatas.filterNot(_.eq(m)).exists(_m => _m.locale == m.locale && _m.name == m.name)
				 })
	}

	/**
	 * update the CategoryUpdate with the values of the object Category
	 * @param c : MCategory
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(c: MCategory){
		this()
		Option(c.availableInSolutions)foreach (this.availableInSolutions=_)
		Option(c.metadatas)foreach (this.metadatas=_)
		Option(c.sortingField)foreach (this.sortingField=_)
	}

}