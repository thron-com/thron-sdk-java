package it.newvision.nvp.identity.services.model.client
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
 * for internal use
 */
@XmlRootElement(name="MResponseGetPlayerInfo") 
@XmlType(name="MResponseGetPlayerInfo")
//#SWG#@ApiModel(description = """for internal use""")
class MResponseGetPlayerInfo extends MResponseClient with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var playerInfo: List[MPlayerInfo] = new ArrayList[MPlayerInfo]
	def withplayerInfo(p:List[MPlayerInfo]):this.type ={ 	this.playerInfo = p; 	this }

}