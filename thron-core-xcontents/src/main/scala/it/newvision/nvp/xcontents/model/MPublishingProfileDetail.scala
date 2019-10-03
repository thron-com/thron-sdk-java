package it.newvision.nvp.xcontents.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MPublishingProfileDetail") 
@XmlType(name="MPublishingProfileDetail")
//#SWG#@ApiModel(description = """""")
class MPublishingProfileDetail extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var active: Boolean  = false
	def withactive(p:Boolean):this.type ={ 	this.active = p; 	this }

	/**
	 * the list of channels where automatically publish the content.
	 */
	//#SWG#@ApiModelProperty(value = """the list of channels where automatically publish the content.""")
	@BeanProperty 
	var channels: List[String] = new ArrayList[String]
	def withchannels(p:List[String]):this.type ={ 	this.channels = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var default: Boolean  = false
	def withdefault(p:Boolean):this.type ={ 	this.default = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):this.type ={ 	this.description = p; 	this }

	/**
	 * like HD,STANDARD,MYSITE...
	 */
	//#SWG#@ApiModelProperty(value = """like HD,STANDARD,MYSITE...""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var name: String =_
	def withname(p:String):this.type ={ 	this.name = p; 	this }

	/**
	 * used to override the default properties of the platform profile.
	 * If true the id value should be equal to a platform profile.
	 */
	//#SWG#@ApiModelProperty(value = """used to override the default properties of the platform profile.
	//#SWGNL#If true the id value should be equal to a platform profile.""" ,required = true)
	@BeanProperty 
	var overridePlatformProfile: Boolean  = false
	def withoverridePlatformProfile(p:Boolean):this.type ={ 	this.overridePlatformProfile = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_HD_AV(){
		this.id = "HD"
		this.name = "HD Profile"
		this.overridePlatformProfile = true
		this.active = true
	}

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_HD_IDP(){
		this.id = "HD"
		this.name = "HD Profile"
		this.overridePlatformProfile = true
		this.active = true
	}

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_STANDARD_AV(){
		this.id = "STANDARD"
		this.name = "Standard Profile"
		this.overridePlatformProfile = true
		this.active = true
		this.default = true
	}

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_STANDARD_IDP(){
		this.id = "STANDARD"
		this.name = "STANDARD Profile"
		this.overridePlatformProfile = true
		this.active = true
		this.default = true
	}

}