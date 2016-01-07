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
/**
 * The CDN Provider Class contain the reference information to the CDN where the
 * content is published. The Default CDN is Weebo, but xcontent allows to be CDN
 * independent, and it is possible to store the content reference to other CDN
 */
@XmlRootElement(name="MProvider") 
@XmlType(name="MProvider")
//#SWG#@ApiModel(description = """The CDN Provider Class contain the reference information to the CDN where the content is published. The Default CDN is Weebo, but xcontent allows to be CDN independent, and it is possible to store the content reference to other CDN""")
abstract class MProvider extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var publishedDate: Date =_
	def withpublishedDate(p:Date):MProvider ={ 	this.publishedDate = p; 	this }

	/**
	 * Calculated value (derived)!!!
	 * For the WeeboProvider extended class it return values of type
	 * MEWeeboProviderStatus like: DRAFT,PUBLISH_IN_PROGRESS,PUBLISHED,....
	 */
	//#SWG#@ApiModelProperty(value = """Calculated value (derived)!!!
	//#SWGNL#For the WeeboProvider extended class it return values of type
	//#SWGNL#MEWeeboProviderStatus like: DRAFT,PUBLISH_IN_PROGRESS,PUBLISHED,....""" ,required = true)
	@BeanProperty 
	var status: String =_
	def withstatus(p:String):MProvider ={ 	this.status = p; 	this }

}