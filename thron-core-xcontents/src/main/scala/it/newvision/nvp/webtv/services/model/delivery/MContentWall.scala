package it.newvision.nvp.webtv.services.model.delivery
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MCategory
import it.newvision.nvp.xcontents.services.model.rating.MRatingAverage
import it.newvision.nvp.xcontents.model.MContent

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * The ContentWall class has all necessary information to fill a webtv wall.
 */
@XmlRootElement(name="MContentWall") 
@XmlType(name="MContentWall")
//#SWG#@ApiModel(description = """The ContentWall class has all necessary information to fill a webtv wall.""")
class MContentWall extends MContent with Serializable  {

	/**
	 * The deliveryInfo attribute has the delivery information (url descriptors,
	 * thumbnails url, system metadata...) of the content PUBLISHED in a channel.  
	 */
	//#SWG#@ApiModelProperty(value = """The deliveryInfo attribute has the delivery information (url descriptors, thumbnails url, system metadata...) of the content PUBLISHED in a channel.  """)
	@BeanProperty 
	var deliveryInfo: List[MDeliveryInfo] = new ArrayList[MDeliveryInfo]
	def withdeliveryInfo(p:List[MDeliveryInfo]):this.type ={ 	this.deliveryInfo = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var deliverySize: MDeliverySize =_
	def withdeliverySize(p:MDeliverySize):this.type ={ 	this.deliverySize = p; 	this }

	/**
	 * Returns a dynamic link to the best thumbnail for the given content and DivArea
	 * provided by the service JDelivery.getThumbnail.
	 * Thumbnail resolution is the closest to fit the given DivArea (DivArea format:
	 * <widht>x<height>)
	 */
	//#SWG#@ApiModelProperty(value = """Returns a dynamic link to the best thumbnail for the given content and DivArea provided by the service JDelivery.getThumbnail.
	//#SWGNL#Thumbnail resolution is the closest to fit the given DivArea (DivArea format: <widht>x<height>)""" ,required = true)
	@BeanProperty 
	var dynThumbService: String =_
	def withdynThumbService(p:String):this.type ={ 	this.dynThumbService = p; 	this }

	/**
	 * Return the list of linked categories (only categoryId and PUBLIC categories).
	 */
	//#SWG#@ApiModelProperty(value = """Return the list of linked categories (only categoryId and PUBLIC categories).""")
	@BeanProperty 
	var linkedCategories: List[MCategory] = new ArrayList[MCategory]()
	def withlinkedCategories(p:List[MCategory]):this.type ={ 	this.linkedCategories = p; 	this }

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
	 * Deprecated by attribute scoreFixedRange
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated by attribute scoreFixedRange""")
	@BeanProperty 
	@Deprecated
	var score: MRatingAverage =_
	@Deprecated
	def withscore(p:MRatingAverage):this.type ={ 	this.score = p; 	this }

	/**
	 * The average score of the content.
	 */
	//#SWG#@ApiModelProperty(value = """The average score of the content.""")
	@BeanProperty 
	var scoreFixedRange: MRatingAverage =_
	def withscoreFixedRange(p:MRatingAverage):this.type ={ 	this.scoreFixedRange = p; 	this }

	/**
	 * the list of subtitles Url for each locale
	 */
	//#SWG#@ApiModelProperty(value = """the list of subtitles Url for each locale""")
	@BeanProperty 
	var subtitlesUrls: List[MSubtitlesUrl] = new ArrayList[MSubtitlesUrl]
	def withsubtitlesUrls(p:List[MSubtitlesUrl]):this.type ={ 	this.subtitlesUrls = p; 	this }

	/**
	 * @param c : MContent
	 * @return 
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(c: MContent){
		this()
		import scala.reflect._
		import scala.collection.JavaConversions._
	
		classOf[MContent].getMethods filter { m=> m.getName.indexOf("_$eq") != -1} foreach {m1=>
			val getMname =  m1.getName.substring(0, m1.getName.indexOf("_$eq"))
			val m1get = classOf[MContent].getMethod(getMname)
			m1.invoke(this,m1get.invoke(c))
		}
	
	
	}

}