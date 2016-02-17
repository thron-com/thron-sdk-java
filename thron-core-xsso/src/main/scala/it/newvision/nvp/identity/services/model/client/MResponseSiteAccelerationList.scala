package it.newvision.nvp.identity.services.model.client
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
 * for internal use
 */
@XmlRootElement(name="MResponseSiteAccelerationList") 
@XmlType(name="MResponseSiteAccelerationList")
//#SWG#@ApiModel(description = """for internal use""")
class MResponseSiteAccelerationList extends MResponseClient with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var siteList: List[MClientSiteProperties] = new ArrayList[MClientSiteProperties]
	def withsiteList(p:List[MClientSiteProperties]):this.type ={ 	this.siteList = p; 	this }

}