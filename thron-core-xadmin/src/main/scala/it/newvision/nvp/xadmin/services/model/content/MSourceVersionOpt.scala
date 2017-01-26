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
@XmlRootElement(name="MSourceVersionOpt") 
@XmlType(name="MSourceVersionOpt")
//#SWG#@ApiModel(description = """""")
class MSourceVersionOpt extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var versionId: String =_
	def withversionId(p:String):this.type ={ 	this.versionId = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def validate(){
		import org.apache.commons.lang.StringUtils
		if(StringUtils.isBlank(this.versionId)) throw new IllegalArgumentException("Missing versionId parameter")
	}

}