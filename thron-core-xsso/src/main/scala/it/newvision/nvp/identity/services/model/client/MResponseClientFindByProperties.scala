package it.newvision.nvp.identity.services.model.client
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.model.MClient

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * List of registered clients in the platform matching the provided criteria.
 */
@XmlRootElement(name="MResponseClientFindByProperties") 
@XmlType(name="MResponseClientFindByProperties")
//#SWG#@ApiModel(description = """List of registered clients in the platform matching the provided criteria.""")
class MResponseClientFindByProperties extends MResponseClient with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var client: List[MClient] = new ArrayList[MClient]
	def withclient(p:List[MClient]):this.type ={ 	this.client = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalResults: Integer =_
	def withtotalResults(p:Integer):this.type ={ 	this.totalResults = p; 	this }

}