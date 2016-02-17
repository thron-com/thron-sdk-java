package it.newvision.nvp.identity.services.model.vusers
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.model.MVUserPreferences

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MVUserParams") 
@XmlType(name="MVUserParams")
//#SWG#@ApiModel(description = """""")
class MVUserParams extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var userPreferences: MVUserPreferences =_
	def withuserPreferences(p:MVUserPreferences):this.type ={ 	this.userPreferences = p; 	this }

}