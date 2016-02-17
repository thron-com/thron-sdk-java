package it.newvision.nvp.xadmin.services.model.apps
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.model.MAppKey

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseAppKeyDetail") 
@XmlType(name="MResponseAppKeyDetail")
//#SWG#@ApiModel(description = """""")
class MResponseAppKeyDetail extends MResponseApp with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var app: MAppDetail =_
	def withapp(p:MAppDetail):this.type ={ 	this.app = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var keys: List[MAppKey] = new ArrayList[MAppKey]
	def withkeys(p:List[MAppKey]):this.type ={ 	this.keys = p; 	this }

}