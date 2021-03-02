package it.newvision.nvp.xcontents.services.model.content.search
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MContentProductCriteria") 
@XmlType(name="MContentProductCriteria")
//#SWG#@ApiModel(description = """""")
class MContentProductCriteria extends Serializable {

	/**
	 * Used to filter content by the aliases of products they are linked to
	 */
	//#SWG#@ApiModelProperty(value = """Used to filter content by the aliases of products they are linked to""")
	@BeanProperty 
	var aliases: List[String] =_
	def withaliases(p:List[String]):this.type ={ 	this.aliases = p; 	this }

	/**
	 * Used to filter content by the ids of products they are linked to
	 */
	//#SWG#@ApiModelProperty(value = """Used to filter content by the ids of products they are linked to""")
	@BeanProperty 
	var ids: List[String] =_
	def withids(p:List[String]):this.type ={ 	this.ids = p; 	this }

}