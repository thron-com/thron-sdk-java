package it.newvision.nvp.xpublisher.services.model.liveEvents
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpublisher.model.MHostnameDetail

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MHostnameDetails") 
@XmlType(name="MHostnameDetails")
//#SWG#@ApiModel(description = """""")
class MHostnameDetails extends Serializable {

	/**
	 * the list of registered hostname for the live event.
	 * The default entries are:
	 * http://clientId-eventId-in.4mecloud.it
	 * http://clientId-eventId-rt.4mecloud.it
	 * http://clientId-eventId-stream.4mecloud.it
	 * http://clientId-eventId-app.4mecloud.it
	 */
	//#SWG#@ApiModelProperty(value = """the list of registered hostname for the live event.
	//#SWGNL#The default entries are:
	//#SWGNL#http://clientId-eventId-in.4mecloud.it
	//#SWGNL#http://clientId-eventId-rt.4mecloud.it
	//#SWGNL#http://clientId-eventId-stream.4mecloud.it
	//#SWGNL#http://clientId-eventId-app.4mecloud.it""")
	@BeanProperty 
	var publicHostnames: List[MHostnameDetail] = new ArrayList[MHostnameDetail]
	def withpublicHostnames(p:List[MHostnameDetail]):MHostnameDetails ={ 	this.publicHostnames = p; 	this }

}