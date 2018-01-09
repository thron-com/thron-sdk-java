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
		val t1 = new MThumbnailDetail()
		val t2 = new MThumbnailDetail()
		val t3 = new MThumbnailDetail()
		val t4 = new MThumbnailDetail()
		val t5 = new MThumbnailDetail()
		val t6 = new MThumbnailDetail()
		val t7 = new MThumbnailDetail()
		val t8 = new MThumbnailDetail()
	
		t8.setWidth(4096)
		t8.setHeight(4096)
		t8.setFormat("L2")
	
		t7.setWidth(1024)
		t7.setHeight(1024)
		t7.setFormat("L1")
	
		t1.setWidth(720)
		t1.setHeight(720)
		t1.setFormat("L")
	
		t2.setWidth(520)
		t2.setHeight(520)
		t2.setFormat("M1")
	
		t3.setWidth(340)
		t3.setHeight(340)
		t3.setFormat("M")
	
		t4.setWidth(240)//for bacheca
		t4.setHeight(240)
		t4.setFormat("S2")
	
		t5.setWidth(160)//for bacheca
		t5.setHeight(160)
		t5.setFormat("S1")
	
		t6.setWidth(75)
		t6.setHeight(75)
		t6.setFormat("S")
	
	
		this.thumbs = new ArrayList[MThumbnailDetail](Arrays.asList(t1, t2, t3,t4,t5,t6,t7,t8))
	}

}