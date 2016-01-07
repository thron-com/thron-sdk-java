package it.newvision.nvp.xreports.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * only one collection can be filled
 */
@XmlRootElement(name="MReportWeebo") 
@XmlType(name="MReportWeebo")
//#SWG#@ApiModel(description = """only one collection can be filled""")
class MReportWeebo extends MReport with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var query: MQueryWeebo =_
	def withquery(p:MQueryWeebo):MReportWeebo ={ 	this.query = p; 	this }

}