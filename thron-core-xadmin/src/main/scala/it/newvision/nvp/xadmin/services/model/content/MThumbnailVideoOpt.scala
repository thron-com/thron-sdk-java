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
@XmlRootElement(name="MThumbnailVideoOpt") 
@XmlType(name="MThumbnailVideoOpt")
//#SWG#@ApiModel(description = """""")
class MThumbnailVideoOpt extends Serializable {

	/**
	 * the time frame in seconds from the video Content.
	 */
	//#SWG#@ApiModelProperty(value = """the time frame in seconds from the video Content.""" ,required = true)
	@BeanProperty 
	var timeFrame: Double =_
	def withtimeFrame(p:Double):this.type ={ 	this.timeFrame = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def validate(){
		import scala.collection.JavaConversions._
		if(Option(timeFrame).isEmpty) throw new IllegalArgumentException("timeFrame can't be empty")
	}

}