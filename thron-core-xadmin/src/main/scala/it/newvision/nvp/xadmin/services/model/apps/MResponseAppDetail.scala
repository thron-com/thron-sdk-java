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
@XmlRootElement(name="MResponseAppDetail") 
@XmlType(name="MResponseAppDetail")
//#SWG#@ApiModel(description = """""")
class MResponseAppDetail extends MResponseApp with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var app: MAppDetail =_
	def withapp(p:MAppDetail):this.type ={ 	this.app = p; 	this }

	/**
	 * the application token Id to use with subsequent calls (only with loginApp)
	 */
	//#SWG#@ApiModelProperty(value = """the application token Id to use with subsequent calls (only with loginApp)""")
	@BeanProperty 
	var appUserTokenId: String =_
	def withappUserTokenId(p:String):this.type ={ 	this.appUserTokenId = p; 	this }

}