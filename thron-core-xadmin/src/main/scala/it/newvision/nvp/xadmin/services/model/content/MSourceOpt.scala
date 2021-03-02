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
 * the original uploaded file used during the publishing process.
 */
@XmlRootElement(name="MSourceOpt") 
@XmlType(name="MSourceOpt")
//#SWG#@ApiModel(description = """""")
class MSourceOpt extends Serializable {

	/**
	 * upload from ftp
	 */
	//#SWG#@ApiModelProperty(value = """upload from ftp""")
	@BeanProperty 
	var ftp: MSourceFtpOpt =_
	def withftp(p:MSourceFtpOpt):this.type ={ 	this.ftp = p; 	this }

	/**
	 * upload raw data. Used for Pagelet Contents, or Thumbnail images
	 */
	//#SWG#@ApiModelProperty(value = """upload raw data. Used for Pagelet Contents, or Thumbnail images""")
	@BeanProperty 
	var raw: MSourceRawOpt =_
	def withraw(p:MSourceRawOpt):this.type ={ 	this.raw = p; 	this }

	/**
	 * Deprecated. Import from repository
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated. Import from repository""")
	@BeanProperty 
	@Deprecated
	var repo: MSourceRepoOpt =_
	@Deprecated
	def withrepo(p:MSourceRepoOpt):this.type ={ 	this.repo = p; 	this }

	/**
	 * upload from AWS S3
	 */
	//#SWG#@ApiModelProperty(value = """upload from AWS S3""")
	@BeanProperty 
	var s3: MSourceS3Opt =_
	def withs3(p:MSourceS3Opt):this.type ={ 	this.s3 = p; 	this }

	/**
	 * upload from web resource, basic HTTP/HTTPS authentication can be included in
	 * the url
	 */
	//#SWG#@ApiModelProperty(value = """upload from web resource, basic HTTP/HTTPS authentication can be included in the url""")
	@BeanProperty 
	var web: MSourceWebOpt =_
	def withweb(p:MSourceWebOpt):this.type ={ 	this.web = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def validate(){
		import scala.collection.JavaConversions._
	
		val existingSources = Seq(
			Option(repo).isDefined,
			Option(ftp).isDefined,
			Option(raw).isDefined,
			Option(s3).isDefined,
			Option(web).isDefined
		).filter(_.booleanValue)
	
		if (existingSources.size != 1) throw new IllegalArgumentException("Exactly one source must be defined")
	
		Option(repo).foreach(_.validate())
		Option(ftp).foreach(_.validate())
		Option(s3).foreach(_.validate())
		Option(web).foreach(_.validate())
		Option(raw).foreach(_.validate())
	}

}