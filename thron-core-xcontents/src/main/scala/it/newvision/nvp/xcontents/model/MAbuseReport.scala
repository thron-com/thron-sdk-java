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
 * The prettyId is used to provide a user-readable identification, and can be used
 * in the findByProperties service to retrieve the object in the system.
 * The prettyId is basically used for WebTv where the user need a readable url
 */
@XmlRootElement(name="MAbuseReport") 
@XmlType(name="MAbuseReport")
//#SWG#@ApiModel(description = """The prettyId is used to provide a user-readable identification, and can be used in the findByProperties service to retrieve the object in the system.
//#SWGNL#The prettyId is basically used for WebTv where the user need a readable url""")
class MAbuseReport extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var userId: String =_
	def withuserId(p:String):this.type ={ 	this.userId = p; 	this }

	/**
	 * The userId of the moderator
	 */
	//#SWG#@ApiModelProperty(value = """The userId of the moderator""" ,required = true)
	@BeanProperty 
	var reportDate: Date  = new Date
	def withreportDate(p:Date):this.type ={ 	this.reportDate = p; 	this }

	/**
	 * @param userId : String
	 * @return 
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(userId: String){
		this()
		this.userId= userId
		this.reportDate = new Date
	
	}

}