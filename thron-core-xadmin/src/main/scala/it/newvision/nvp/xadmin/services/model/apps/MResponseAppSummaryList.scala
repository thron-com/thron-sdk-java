package it.newvision.nvp.xadmin.services.model.apps
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseAppSummaryList") 
@XmlType(name="MResponseAppSummaryList")
//#SWG#@ApiModel(description = """""")
class MResponseAppSummaryList extends MResponseApp with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var apps: List[MAppSummary] = new ArrayList[MAppSummary]
	def withapps(p:List[MAppSummary]):this.type ={ 	this.apps = p; 	this }

}