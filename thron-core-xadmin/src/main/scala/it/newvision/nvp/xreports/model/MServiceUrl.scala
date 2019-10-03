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
 * select where querystring like serviceUrl and (queryArg[1] = .... and ....)
 */
@XmlRootElement(name="MServiceUrl") 
@XmlType(name="MServiceUrl")
//#SWG#@ApiModel(description = """select where querystring like serviceUrl and (queryArg[1] = .... and ....)""")
class MServiceUrl extends Serializable {

	/**
	 * the query params are as AND clause
	 */
	//#SWG#@ApiModelProperty(value = """the query params are as AND clause""")
	@BeanProperty 
	var queryParams: List[String] = new ArrayList[String]
	def withqueryParams(p:List[String]):this.type ={ 	this.queryParams = p; 	this }

	/**
	 * only the service name not the full url:
	 * example:
	 * getContentDescriptor
	 * getContent
	 */
	//#SWG#@ApiModelProperty(value = """only the service name not the full url:
	//#SWGNL#example:
	//#SWGNL#getContentDescriptor
	//#SWGNL#getContent""" ,required = true)
	@BeanProperty 
	var serviceUrl: String =_
	def withserviceUrl(p:String):this.type ={ 	this.serviceUrl = p; 	this }

}