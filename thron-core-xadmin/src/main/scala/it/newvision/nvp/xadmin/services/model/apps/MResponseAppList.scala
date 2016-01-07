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
@XmlRootElement(name="MResponseAppList") 
@XmlType(name="MResponseAppList")
//#SWG#@ApiModel(description = """""")
class MResponseAppList extends MResponseApp with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var apps: List[MAppDetail] = new ArrayList[MAppDetail]
	def withapps(p:List[MAppDetail]):MResponseAppList ={ 	this.apps = p; 	this }

}