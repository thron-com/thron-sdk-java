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
@XmlRootElement(name="MGroupList") 
@XmlType(name="MGroupList")
//#SWG#@ApiModel(description = """""")
class MGroupList extends Serializable {

	/**
	 * List of group Ids.
	 * Constraints:
	 * <ul>
	 * 	<li>maximum 50 items</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """List of group Ids. 
	//#SWGNL#Constraints: 
	//#SWGNL#<ul>
	//#SWGNL#	<li>maximum 50 items</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var ids: List[String] = new ArrayList[String]
	def withids(p:List[String]):this.type ={ 	this.ids = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(ids).exists(x=> x.size > 0 && x.size <= 50 )
	}

}