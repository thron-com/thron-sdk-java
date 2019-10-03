package it.newvision.nvp.xcontents.services.model.contentCategory
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MContentsList") 
@XmlType(name="MContentsList")
//#SWG#@ApiModel(description = """""")
class MContentsList extends Serializable {

	/**
	 * list of xcontent ids.
	 * <b>
	 * </b><b>Constraints:</b>
	 * <ul>
	 * 	<li>ids.size <= 50</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """list of xcontent ids. 
	//#SWGNL#<b>
	//#SWGNL#</b><b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>ids.size <= 50</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var ids: List[String] = new ArrayList[String]
	def withids(p:List[String]):this.type ={ 	this.ids = p; 	this }

}