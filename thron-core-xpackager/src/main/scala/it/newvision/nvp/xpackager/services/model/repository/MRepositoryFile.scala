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
@XmlRootElement(name="MRepositoryFile") 
@XmlType(name="MRepositoryFile")
//#SWG#@ApiModel(description = """main class used to define the File search criteria.
//#SWGNL#Each attribute is a specific search criteria. If an attribute is not defined (null) the search criteria is not applied. The combination of two or more search criteria are with AND clause. 
//#SWGNL#The attributes with [0..*] cardinality are in OR clause.""")
class MRepositoryFile extends Serializable {

	/**
	 * the clientId
	 */
	//#SWG#@ApiModelProperty(value = """the clientId""" ,required = true)
	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	/**
	 * the repositoryFile
	 */
	//#SWG#@ApiModelProperty(value = """the repositoryFile""" ,required = true)
	@BeanProperty 
	var file: MFile =_
	def withfile(p:MFile):this.type ={ 	this.file = p; 	this }

}