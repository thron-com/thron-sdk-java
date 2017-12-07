package it.newvision.nvp.identity.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MPropertyIM") 
@XmlType(name="MPropertyIM")
//#SWG#@ApiModel(description = """""")
class MPropertyIM extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var imType: MEExternalIdType =_
	def withimType(p:MEExternalIdType):this.type ={ 	this.imType = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var url: String =_
	def withurl(p:String):this.type ={ 	this.url = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var secure: Boolean  = true
	def withsecure(p:Boolean):this.type ={ 	this.secure = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var conf: List[MMetadata] = new ArrayList[MMetadata]
	def withconf(p:List[MMetadata]):this.type ={ 	this.conf = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init(){

	}

}