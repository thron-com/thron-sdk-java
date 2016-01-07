package it.newvision.nvp.xcontents.services.model.client
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MClient

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseFindClient") 
@XmlType(name="MResponseFindClient")
//#SWG#@ApiModel(description = """""")
class MResponseFindClient extends MResponseClient with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var clients: List[MClient] = new ArrayList[MClient]
	def withclients(p:List[MClient]):MResponseFindClient ={ 	this.clients = p; 	this }

	/**
	 * total number of results
	 */
	//#SWG#@ApiModelProperty(value = """total number of results""" ,required = true)
	@BeanProperty 
	var totalResults: Integer  = 0
	def withtotalResults(p:Integer):MResponseFindClient ={ 	this.totalResults = p; 	this }

}