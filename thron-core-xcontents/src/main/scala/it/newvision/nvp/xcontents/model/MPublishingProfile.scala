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
@XmlRootElement(name="MPublishingProfile") 
@XmlType(name="MPublishingProfile")
//#SWG#@ApiModel(description = """""")
class MPublishingProfile extends Serializable {

	/**
	 * like 
	 */
	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var audio: List[MPublishingProfileDetail] = new ArrayList[MPublishingProfileDetail]
	def withaudio(p:List[MPublishingProfileDetail]):this.type ={ 	this.audio = p; 	this }

	/**
	 * video document
	 */
	//#SWG#@ApiModelProperty(value = """video document""")
	@BeanProperty 
	var stream: List[MPublishingProfileDetail] = new ArrayList[MPublishingProfileDetail]
	def withstream(p:List[MPublishingProfileDetail]):this.type ={ 	this.stream = p; 	this }

	/**
	 * like 
	 */
	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var image: List[MPublishingProfileDetail] = new ArrayList[MPublishingProfileDetail]
	def withimage(p:List[MPublishingProfileDetail]):this.type ={ 	this.image = p; 	this }

	/**
	 * generic document
	 */
	//#SWG#@ApiModelProperty(value = """generic document""")
	@BeanProperty 
	var genericDocument: List[MPublishingProfileDetail] = new ArrayList[MPublishingProfileDetail]
	def withgenericDocument(p:List[MPublishingProfileDetail]):this.type ={ 	this.genericDocument = p; 	this }

	/**
	 * pagelet document
	 */
	//#SWG#@ApiModelProperty(value = """pagelet document""")
	@BeanProperty 
	var pagelet: List[MPublishingProfileDetail] = new ArrayList[MPublishingProfileDetail]
	def withpagelet(p:List[MPublishingProfileDetail]):this.type ={ 	this.pagelet = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var url: List[MPublishingProfileDetail] = new ArrayList[MPublishingProfileDetail]
	def withurl(p:List[MPublishingProfileDetail]):this.type ={ 	this.url = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def add_HD(){
		def avp = {
		  val p = new MPublishingProfileDetail()
		  p.init_HD_AV()
		  p
		}
	
		def idp = {
		  val p = new MPublishingProfileDetail()
		  p.init_HD_IDP()
		  p
		}
	
		this.audio.add(avp)
		this.stream.add(avp)
		this.image.add(idp)
		this.genericDocument.add(idp)
		this.pagelet.add(idp)
		this.url.add(idp)
	}

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def add_STANDARD(){
		def avp = {
		  val p = new MPublishingProfileDetail()
		  p.init_STANDARD_AV()
		  p
		}
		
		def idp = {
		  val p =  new MPublishingProfileDetail()
		  p.init_STANDARD_IDP()
		  p
		}
	
		this.audio.add(avp)
		this.stream.add(avp)
		this.image.add(idp)
		this.genericDocument.add(idp)
		this.pagelet.add(idp)
		this.url.add(idp)
	}

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def initProfiles(){
		this.audio.clear()
		this.stream.clear()
		this.image.clear()
		this.genericDocument.clear()
		this.pagelet.clear()
		this.url.clear()
		this.add_HD()
		this.add_STANDARD()
	}

}