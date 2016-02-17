package it.newvision.nvp.xpublisher.model
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
 * The files published for a particular channel are stored within Weebo, following
 * a policy of not overwriting the contents, so if for some reason the file
 * already exists in the published folder, the file is published with an unique
 * name.
 */
@XmlRootElement(name="MFile") 
@XmlType(name="MFile")
//#SWG#@ApiModel(description = """The files published for a particular channel are stored within Weebo, following a policy of not overwriting the contents, so if for some reason the file already exists in the published folder, the file is published with an unique name.""")
class MFile extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var localPath: String =_
	def withlocalPath(p:String):this.type ={ 	this.localPath = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var url: String =_
	def withurl(p:String):this.type ={ 	this.url = p; 	this }

}