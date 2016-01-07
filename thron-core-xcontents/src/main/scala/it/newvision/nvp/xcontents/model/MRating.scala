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
 * The class is used to rate a content. 
 */
@XmlRootElement(name="MRating") 
@XmlType(name="MRating")
//#SWG#@ApiModel(description = """The class is used to rate a content. """)
class MRating extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var id: String  = java.util.UUID.randomUUID.toString
	def withid(p:String):MRating ={ 	this.id = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var score: Double =_
	def withscore(p:Double):MRating ={ 	this.score = p; 	this }

	/**
	 * not required
	 */
	//#SWG#@ApiModelProperty(value = """not required""" ,required = true)
	@BeanProperty 
	var ts: Date =_
	def withts(p:Date):MRating ={ 	this.ts = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var userId: String =_
	def withuserId(p:String):MRating ={ 	this.userId = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var content: MContent =_
	  def withcontent(p:MContent):MRating ={ 	this.content = p; 	this }

}