package it.newvision.nvp.xadmin.services.model.apps
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.model.MEAppType

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Minimal search criteria for Apps
 */
@XmlRootElement(name="MAppCriteria") 
@XmlType(name="MAppCriteria")
//#SWG#@ApiModel(description = """Minimal search criteria for Apps""")
class MAppCriteria extends Serializable {

	/**
	 * used to define the application "class":
	 * RTIE,CUSTOM...
	 */
	//#SWG#@ApiModelProperty(value = """used to define the application "class":
	//#SWGNL#RTIE,CUSTOM...""")
	@BeanProperty 
	var appType: List[MEAppType] = new ArrayList[MEAppType]
	def withappType(p:List[MEAppType]):this.type ={ 	this.appType = p; 	this }

	/**
	 * used to define the subtype"class" (only with CUSTOM appType)
	 */
	//#SWG#@ApiModelProperty(value = """used to define the subtype"class" (only with CUSTOM appType)""")
	@BeanProperty 
	var appSubType: String =_
	def withappSubType(p:String):this.type ={ 	this.appSubType = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var appIds: List[String] = new ArrayList[String]
	def withappIds(p:List[String]):this.type ={ 	this.appIds = p; 	this }

	/**
	 * prettyId for the APP
	 */
	//#SWG#@ApiModelProperty(value = """prettyId for the APP""")
	@BeanProperty 
	var appPrettyIds: List[String] = new ArrayList[String]
	def withappPrettyIds(p:List[String]):this.type ={ 	this.appPrettyIds = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var appActive: Boolean =_
	def withappActive(p:Boolean):this.type ={ 	this.appActive = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var appDisplayName: String =_
	def withappDisplayName(p:String):this.type ={ 	this.appDisplayName = p; 	this }

	/**
	 * username of the owner of the App.
	 * The user who created the app instance
	 */
	//#SWG#@ApiModelProperty(value = """username of the owner of the App.
	//#SWGNL#The user who created the app instance""")
	@BeanProperty 
	var appOwnerUsername: String =_
	def withappOwnerUsername(p:String):this.type ={ 	this.appOwnerUsername = p; 	this }

	/**
	 * If TRUE the service filters apps where the user has no roles
	 */
	//#SWG#@ApiModelProperty(value = """If TRUE the service filters apps where the user has no roles""")
	@BeanProperty 
	var onlyMyApps: Boolean =_
	def withonlyMyApps(p:Boolean):this.type ={ 	this.onlyMyApps = p; 	this }

}