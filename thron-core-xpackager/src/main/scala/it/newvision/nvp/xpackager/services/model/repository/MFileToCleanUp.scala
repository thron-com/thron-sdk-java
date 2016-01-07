package it.newvision.nvp.xpackager.services.model.repository
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpackager.model.MFile

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * main class used to define the File search criteria.
 * Each attribute is a specific search criteria. If an attribute is not defined
 * (null) the search criteria is not applied. The combination of two or more
 * search criteria are with AND clause.
 * The attributes with [0..*] cardinality are in OR clause.
 */
@XmlRootElement(name="MFileToCleanUp") 
@XmlType(name="MFileToCleanUp")
//#SWG#@ApiModel(description = """main class used to define the File search criteria.
//#SWGNL#Each attribute is a specific search criteria. If an attribute is not defined (null) the search criteria is not applied. The combination of two or more search criteria are with AND clause. 
//#SWGNL#The attributes with [0..*] cardinality are in OR clause.""")
class MFileToCleanUp extends Serializable {

	/**
	 * the clientId
	 */
	//#SWG#@ApiModelProperty(value = """the clientId""" ,required = true)
	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):MFileToCleanUp ={ 	this.clientId = p; 	this }

	/**
	 * the fileName
	 */
	//#SWG#@ApiModelProperty(value = """the fileName""" ,required = true)
	@BeanProperty 
	var file: MFile =_
	def withfile(p:MFile):MFileToCleanUp ={ 	this.file = p; 	this }

	/**
	 * the siteName where the file should be cleanup.
	 */
	//#SWG#@ApiModelProperty(value = """the siteName where the file should be cleanup.""" ,required = true)
	@BeanProperty 
	var cacheSiteName: String =_
	def withcacheSiteName(p:String):MFileToCleanUp ={ 	this.cacheSiteName = p; 	this }

}