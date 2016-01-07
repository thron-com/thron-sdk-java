package it.newvision.nvp.xadmin.services.model.weebo
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MLiveEventRecParams") 
@XmlType(name="MLiveEventRecParams")
//#SWG#@ApiModel(description = """""")
class MLiveEventRecParams extends Serializable {

	/**
	 * the mediacontentId of the liveEvent necessary to know where the recorded files
	 * and to start the special specific publishing process. Optional
	 */
	//#SWG#@ApiModelProperty(value = """the mediacontentId of the liveEvent necessary to know where the recorded files and to start the special specific publishing process. Optional""")
	@BeanProperty 
	var mediaContentId: String =_
	def withmediaContentId(p:String):MLiveEventRecParams ={ 	this.mediaContentId = p; 	this }

}