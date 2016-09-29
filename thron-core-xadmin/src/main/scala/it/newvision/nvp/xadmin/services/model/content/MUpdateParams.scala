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
@XmlRootElement(name="MUpdateParams") 
@XmlType(name="MUpdateParams")
//#SWG#@ApiModel(description = """""")
class MUpdateParams extends Serializable {

	/**
	 * Optional. The identifier for the publishing profile (used to derive the list of
	 * channels where the content should be published).
	 * If empty and channel not specified, will be used the default profile
	 */
	//#SWG#@ApiModelProperty(value = """Optional. The identifier for the publishing profile (used to derive the list of channels where the content should be published).
	//#SWGNL#If empty and channel not specified, will be used the default profile""")
	@BeanProperty 
	var profileId: String =_
	def withprofileId(p:String):this.type ={ 	this.profileId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var sources: List[MSourceOpt] = new ArrayList[MSourceOpt]
	def withsources(p:List[MSourceOpt]):this.type ={ 	this.sources = p; 	this }

	/**
	 * Optional. Default=false. Always false for IMAGE contents.
	 * if true, the service preserve the thumbnail channel.
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Default=false. Always false for IMAGE contents.
	//#SWGNL#if true, the service preserve the thumbnail channel.""")
	@BeanProperty 
	var preserveThumb: Boolean  = false
	def withpreserveThumb(p:Boolean):this.type ={ 	this.preserveThumb = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def validate(){
		import scala.collection.JavaConversions._
		if(!(Option(sources).isDefined && sources.size()==1 ))
			throw new IllegalArgumentException("sources must be defined and have one element") 
		sources.head.validate()
	}

}