package it.newvision.nvp.xadmin.services.model.content
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MContentAdminSourceOpt") 
@XmlType(name="MContentAdminSourceOpt")
//#SWG#@ApiModel(description = """""")
class MContentAdminSourceOpt extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var thronToken: MSourceThronTokenOpt =_
	def withthronToken(p:MSourceThronTokenOpt):this.type ={ 	this.thronToken = p; 	this }

}