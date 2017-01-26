package it.newvision.nvp.webtv.services.model.delivery
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MEContentType
import it.newvision.nvp.xcontents.model.MEContentProperties
import it.newvision.nvp.xcontents.model.MMetadata

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * The ContentWallMinimal class is used to return the minimun information about a
 * list of contents. Used for summary or linked contents
 */
@XmlRootElement(name="MContentWallMinimal") 
@XmlType(name="MContentWallMinimal")
//#SWG#@ApiModel(description = """The ContentWallMinimal class is used to return the minimun information about a list of contents. Used for summary or linked contents""")
class MContentWallMinimal extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var xcontentId: String =_
	def withxcontentId(p:String):this.type ={ 	this.xcontentId = p; 	this }

	/**
	 * the content name in the specified locale
	 */
	//#SWG#@ApiModelProperty(value = """the content name in the specified locale""")
	@BeanProperty 
	var name: String =_
	def withname(p:String):this.type ={ 	this.name = p; 	this }

	/**
	 * the content description in the specified locale
	 */
	//#SWG#@ApiModelProperty(value = """the content description in the specified locale""")
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):this.type ={ 	this.description = p; 	this }

	/**
	 * the locale of content name and description
	 */
	//#SWG#@ApiModelProperty(value = """the locale of content name and description""")
	@BeanProperty 
	var locale: String =_
	def withlocale(p:String):this.type ={ 	this.locale = p; 	this }

	/**
	 * VIDEO,AUDIO,IMAGE....
	 */
	//#SWG#@ApiModelProperty(value = """VIDEO,AUDIO,IMAGE....""" ,required = true)
	@BeanProperty 
	var contentType: MEContentType =_
	def withcontentType(p:MEContentType):this.type ={ 	this.contentType = p; 	this }

	/**
	 * list of content's available channels
	 */
	//#SWG#@ApiModelProperty(value = """list of content's available channels""")
	@BeanProperty 
	var channels: List[String] = new ArrayList[String]
	def withchannels(p:List[String]):this.type ={ 	this.channels = p; 	this }

	/**
	 * List the properties of a content
	 */
	//#SWG#@ApiModelProperty(value = """List the properties of a content""")
	@BeanProperty 
	var properties: List[MEContentProperties] = new ArrayList[MEContentProperties]
	def withproperties(p:List[MEContentProperties]):this.type ={ 	this.properties = p; 	this }

	/**
	 * DEPRECATED.
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED.""")
	@BeanProperty 
	@Deprecated
	var selectedChannel: String =_
	@Deprecated
	def withselectedChannel(p:String):this.type ={ 	this.selectedChannel = p; 	this }

	/**
	 * The deliveryInfoMinimal attribute has some delivery information necessary to
	 * layout the list of linked contents.
	 * The attribute can be empty if the suggested channel is defined but is not more
	 * available for the content.
	 * Example:
	 * selectedChannel = "WEBHD" and
	 * channels = [WEB,WEBIPHONE]
	 */
	//#SWG#@ApiModelProperty(value = """The deliveryInfoMinimal attribute has some delivery information necessary to layout the list of linked contents.
	//#SWGNL#The attribute can be empty if the suggested channel is defined but is not more available for the content.
	//#SWGNL#Example: 
	//#SWGNL#selectedChannel = "WEBHD" and 
	//#SWGNL#channels = [WEB,WEBIPHONE]""")
	@BeanProperty 
	var deliveryInfoMinimal: MDeliveryInfoMinimal =_
	def withdeliveryInfoMinimal(p:MDeliveryInfoMinimal):this.type ={ 	this.deliveryInfoMinimal = p; 	this }

	/**
	 * Deprecated
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated""")
	@BeanProperty 
	@Deprecated
	var pcontentVersion: Integer  = 0
	@Deprecated
	def withpcontentVersion(p:Integer):this.type ={ 	this.pcontentVersion = p; 	this }

	/**
	 * The creation date of the content.
	 */
	//#SWG#@ApiModelProperty(value = """The creation date of the content.""")
	@BeanProperty 
	var creationDate: Date =_
	def withcreationDate(p:Date):this.type ={ 	this.creationDate = p; 	this }

	/**
	 * the list of Content.metadatas
	 */
	//#SWG#@ApiModelProperty(value = """the list of Content.metadatas""")
	@BeanProperty 
	var metadata: List[MMetadata] = new ArrayList[MMetadata]
	def withmetadata(p:List[MMetadata]):this.type ={ 	this.metadata = p; 	this }

}