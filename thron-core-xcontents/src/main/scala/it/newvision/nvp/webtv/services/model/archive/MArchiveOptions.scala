package it.newvision.nvp.webtv.services.model.archive
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
 * Archive options for each contentType.
 */
@XmlRootElement(name="MArchiveOptions") 
@XmlType(name="MArchiveOptions")
//#SWG#@ApiModel(description = """Archive options for each contentType.""")
class MArchiveOptions extends Serializable {

	/**
	 * Empty (default value): the service returns the Source, if available otherwise
	 * the Published content.
	 * 
	 * other possible values:
	 * <ul>
	 * 	<li>SOURCE: only the source file</li>
	 * 	<li>PUBLISHED: only the published resource</li>
	 * 	<li><channel>: specific channel</li>
	 * </ul>
	 * 
	 * Example:
	 * ["SOURCE","WEBHD"]
	 */
	//#SWG#@ApiModelProperty(value = """Empty (default value): the service returns the Source, if available otherwise the Published content.
	//#SWGNL#
	//#SWGNL#other possible values:
	//#SWGNL#<ul>
	//#SWGNL#	<li>SOURCE: only the source file</li>
	//#SWGNL#	<li>PUBLISHED: only the published resource</li>
	//#SWGNL#	<li><channel>: specific channel</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#Example:
	//#SWGNL#["SOURCE","WEBHD"]""")
	@BeanProperty 
	var video: List[String] = new ArrayList[String]
	def withvideo(p:List[String]):this.type ={ 	this.video = p; 	this }

	/**
	 * Empty (default value): the service returns the Source, if available otherwise
	 * the Published content.
	 * 
	 * other possible values:
	 * <ul>
	 * 	<li>SOURCE: only the source file</li>
	 * 	<li>PUBLISHED: only the published resource</li>
	 * 	<li><channel>: specific channel</li>
	 * </ul>
	 * 
	 * Example:
	 * ["SOURCE","PUBLISHED"]
	 */
	//#SWG#@ApiModelProperty(value = """Empty (default value): the service returns the Source, if available otherwise the Published content.
	//#SWGNL#
	//#SWGNL#other possible values:
	//#SWGNL#<ul>
	//#SWGNL#	<li>SOURCE: only the source file</li>
	//#SWGNL#	<li>PUBLISHED: only the published resource</li>
	//#SWGNL#	<li><channel>: specific channel</li>
	//#SWGNL#</ul>
	//#SWGNL# 
	//#SWGNL#Example:
	//#SWGNL#["SOURCE","PUBLISHED"]""")
	@BeanProperty 
	var audio: List[String] = new ArrayList[String]
	def withaudio(p:List[String]):this.type ={ 	this.audio = p; 	this }

	/**
	 * Empty (default value): the service returns the Source, if available otherwise
	 * the Published content.
	 * 
	 * other possible values:
	 * <ul>
	 * 	<li>SOURCE: only the source file</li>
	 * 	<li>PUBLISHED: only the published resource</li>
	 * 	<li><channel>: specific channel</li>
	 * </ul>
	 * 
	 * Example:
	 * ["SOURCE","PUBLISHED","WEBDOC"]
	 */
	//#SWG#@ApiModelProperty(value = """Empty (default value): the service returns the Source, if available otherwise the Published content.
	//#SWGNL#
	//#SWGNL#other possible values:
	//#SWGNL#<ul>
	//#SWGNL#	<li>SOURCE: only the source file</li>
	//#SWGNL#	<li>PUBLISHED: only the published resource</li>
	//#SWGNL#	<li><channel>: specific channel</li>
	//#SWGNL#</ul>
	//#SWGNL# 
	//#SWGNL#Example:
	//#SWGNL#["SOURCE","PUBLISHED","WEBDOC"]""")
	@BeanProperty 
	var other: List[String] = new ArrayList[String]
	def withother(p:List[String]):this.type ={ 	this.other = p; 	this }

	/**
	 * Empty (default value): the service returns the Source, if available otherwise
	 * the Published content with div area 0x0 (max resolution)
	 * 
	 * other possible values:
	 * <ul>
	 * 	<li>SOURCE: only the source file</li>
	 * 	<li>PUBLISHED: only the published resource</li>
	 * 	<li><divArea>: desired divArea</li>
	 * </ul>
	 * 
	 * Example:
	 * ["SOURCE","PUBLISHED","1024x768", "1920x1024"]
	 */
	//#SWG#@ApiModelProperty(value = """Empty (default value): the service returns the Source, if available otherwise the Published content with div area 0x0 (max resolution)
	//#SWGNL#
	//#SWGNL#other possible values:
	//#SWGNL#<ul>
	//#SWGNL#	<li>SOURCE: only the source file</li>
	//#SWGNL#	<li>PUBLISHED: only the published resource</li>
	//#SWGNL#	<li><divArea>: desired divArea</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#Example:
	//#SWGNL#["SOURCE","PUBLISHED","1024x768", "1920x1024"]""")
	@BeanProperty 
	var image: List[String] = new ArrayList[String]
	def withimage(p:List[String]):this.type ={ 	this.image = p; 	this }

	/**
	 * Used to store the playlist and pagelet content using the correct prettyId.
	 */
	//#SWG#@ApiModelProperty(value = """Used to store the playlist and pagelet content using the correct prettyId.""")
	@BeanProperty 
	var locale: String =_
	def withlocale(p:String):this.type ={ 	this.locale = p; 	this }

	/**
	 * Optional. Default value false.
	 * create the manifest inside the archive file.
	 * The manifest file is a csv with the format: <xcontentId>,fileName,channel
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Default value false.
	//#SWGNL#create the manifest inside the archive file. 
	//#SWGNL#The manifest file is a csv with the format: <xcontentId>,fileName,channel""")
	@BeanProperty 
	var appendManifestFile: Boolean  = false
	def withappendManifestFile(p:Boolean):this.type ={ 	this.appendManifestFile = p; 	this }

	/**
	 * Optional.
	 * Used to Audit some information during the download.
	 */
	//#SWG#@ApiModelProperty(value = """Optional. 
	//#SWGNL#Used to Audit some information during the download.""" ,required = true)
	@BeanProperty 
	var evidence: String =_
	def withevidence(p:String):this.type ={ 	this.evidence = p; 	this }

}