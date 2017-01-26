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
@XmlRootElement(name="MUpdateSourceOpt") 
@XmlType(name="MUpdateSourceOpt")
//#SWG#@ApiModel(description = """""")
class MUpdateSourceOpt extends MSourceOpt with Serializable  {

	/**
	 * Used to restore a previous version of the content
	 */
	//#SWG#@ApiModelProperty(value = """Used to restore a previous version of the content""")
	@BeanProperty 
	var version: MSourceVersionOpt =_
	def withversion(p:MSourceVersionOpt):this.type ={ 	this.version = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def validate2(){
		import scala.collection.JavaConversions._
	
		val existingSources = Seq(
			Option(repo).isDefined,
			Option(ftp).isDefined,
			Option(raw).isDefined,
			Option(s3).isDefined,
			Option(web).isDefined,
			Option(version).isDefined
		).filter(_.booleanValue)
	
		if (existingSources.size != 1) throw new IllegalArgumentException("Exactly one source must be defined")
	
		Option(repo).foreach(_.validate())
		Option(ftp).foreach(_.validate())
		Option(s3).foreach(_.validate())
		Option(web).foreach(_.validate())
		Option(raw).foreach(_.validate())
		Option(version).foreach(_.validate())
	}

}