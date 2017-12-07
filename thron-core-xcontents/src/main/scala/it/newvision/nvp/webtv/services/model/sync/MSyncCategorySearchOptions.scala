package it.newvision.nvp.webtv.services.model.sync
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MSyncCategorySearchOptions") 
@XmlType(name="MSyncCategorySearchOptions")
//#SWG#@ApiModel(description = """""")
class MSyncCategorySearchOptions extends Serializable {

	/**
	 * used to filter the contents linked to the given categories. Commonly used to
	 * have the list of Contents linked to a category or subcategories.
	 * Category id or prettyId are supported.
	 * 
	 * <b>Constraints: </b>
	 * <ul>
	 * 	<li>max number of elements 50 (when cascade is true)</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """used to filter the contents linked to the given categories. Commonly used to have the list of Contents linked to a category or subcategories.
	//#SWGNL#Category id or prettyId are supported.
	//#SWGNL#
	//#SWGNL#<b>Constraints: </b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>max number of elements 50 (when cascade is true)</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var linkedCategoryIds: List[String] = new ArrayList[String]
	def withlinkedCategoryIds(p:List[String]):this.type ={ 	this.linkedCategoryIds = p; 	this }

	/**
	 * For all linkedCategoryIds search in sub-categories.
	 */
	//#SWG#@ApiModelProperty(value = """For all linkedCategoryIds search in sub-categories.""" ,required = true)
	@BeanProperty 
	var cascade: Boolean  = false
	def withcascade(p:Boolean):this.type ={ 	this.cascade = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import org.apache.commons.lang.BooleanUtils
		Option(linkedCategoryIds).forall(x=> x.size()<=50 && BooleanUtils.isTrue(cascade)) || BooleanUtils.isNotTrue(cascade)
	}

}