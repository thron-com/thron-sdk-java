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
/**
 * This is the thumbnail properties used globally by the client during a ingestion 
 */
@XmlRootElement(name="MPropertyThumbnail") 
@XmlType(name="MPropertyThumbnail")
//#SWG#@ApiModel(description = """This is the thumbnail properties used globally by the client during a ingestion """)
class MPropertyThumbnail extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var quality: Integer  = 95
	def withquality(p:Integer):this.type ={ 	this.quality = p; 	this }

	/**
	 * default thumbs format
	 */
	//#SWG#@ApiModelProperty(value = """default thumbs format""" ,required = true)
	@BeanProperty 
	var defaultFormat: String  = "L"
	def withdefaultFormat(p:String):this.type ={ 	this.defaultFormat = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var keepFileFormat: Boolean  = true
	def withkeepFileFormat(p:Boolean):this.type ={ 	this.keepFileFormat = p; 	this }

	/**
	 * attualmente la conversione avviene solo in JPG con limitazione per i file di
	 * input non superiori a 2048x2048
	 */
	//#SWG#@ApiModelProperty(value = """attualmente la conversione avviene solo in JPG con limitazione per i file di input non superiori a 2048x2048""" ,required = true)
	@BeanProperty 
	var convertTo: String  = "JPG"
	def withconvertTo(p:String):this.type ={ 	this.convertTo = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var thumbs: List[MThumbnailDetail] = new ArrayList[MThumbnailDetail]
	  def withthumbs(p:List[MThumbnailDetail]):this.type ={ 	this.thumbs = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init(){
		val t8 = new MThumbnailDetail()
		t8.setWidth(4096)
		t8.setHeight(4096)
		t8.setFormat("L2")
	
		this.thumbs = new ArrayList[MThumbnailDetail](Arrays.asList(t8))
	}

}