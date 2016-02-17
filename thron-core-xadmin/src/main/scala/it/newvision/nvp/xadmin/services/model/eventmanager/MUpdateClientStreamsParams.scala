package it.newvision.nvp.xadmin.services.model.eventmanager
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MUpdateClientStreamsParams") 
@XmlType(name="MUpdateClientStreamsParams")
//#SWG#@ApiModel(description = """""")
class MUpdateClientStreamsParams extends Serializable {

	/**
	 * ClientStreams can only contain [0-9a-zA-Z-_.] characters
	 */
	//#SWG#@ApiModelProperty(value = """ClientStreams can only contain [0-9a-zA-Z-_.] characters""")
	@BeanProperty 
	var clientStreams: List[String] = new ArrayList[String]
	def withclientStreams(p:List[String]):this.type ={ 	this.clientStreams = p; 	this }

}