package it.newvision.nvp.xpublisher.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MChannel") 
@XmlType(name="MChannel")
//#SWG#@ApiModel(description = """""")
class MChannel extends MAChannel with Serializable  {

	/**
	 * total execution time to create the channel.
	 * In milliseconds
	 */
	//#SWG#@ApiModelProperty(value = """total execution time to create the channel.
	//#SWGNL#In milliseconds""" ,required = true)
	@BeanProperty 
	var executionTime: Long =_
	def withexecutionTime(p:Long):this.type ={ 	this.executionTime = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var files: List[MFile] = new ArrayList[MFile]
	  def withfiles(p:List[MFile]):this.type ={ 	this.files = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		(channelType != null)
	}

}