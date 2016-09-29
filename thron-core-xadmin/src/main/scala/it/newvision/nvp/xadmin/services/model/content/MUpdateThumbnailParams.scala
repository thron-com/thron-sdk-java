package it.newvision.nvp.xadmin.services.model.content
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
 * only one of thumbSource, thumbMediaLibrary, thumbVideoFrameTime or
 * thumbUploaded is allowed.
 */
@XmlRootElement(name="MUpdateThumbnailParams") 
@XmlType(name="MUpdateThumbnailParams")
//#SWG#@ApiModel(description = """""")
class MUpdateThumbnailParams extends Serializable {

	/**
	 * update the thumbnail from a specific source (repository,ftp,web,s3 or raw data)
	 */
	//#SWG#@ApiModelProperty(value = """update the thumbnail from a specific source (repository,ftp,web,s3 or raw data)""")
	@BeanProperty 
	var source: MSourceOpt =_
	def withsource(p:MSourceOpt):this.type ={ 	this.source = p; 	this }

	/**
	 * update the thumbnail using a different time frame of the content. This option
	 * is available only with VIDEO contents.
	 */
	//#SWG#@ApiModelProperty(value = """update the thumbnail using a different time frame of the content. This option is available only with VIDEO contents.""")
	@BeanProperty 
	var video: MThumbnailVideoOpt =_
	def withvideo(p:MThumbnailVideoOpt):this.type ={ 	this.video = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def validate(){
		import scala.collection.JavaConversions._
		if (Option(source).isEmpty && Option(video).isEmpty) throw new IllegalArgumentException("source param or video param must be used!")
		if(Option(source).isDefined) source.validate()
		if(Option(video).isDefined) video.validate()
	}

}