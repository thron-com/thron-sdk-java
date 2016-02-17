package it.newvision.nvp.xpackager.services.model.packager
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
 * Used to Response of AddIngestionToPackaged and removeIngestionToPackage
 */
@XmlRootElement(name="MResponseCleanupOrphansPackagedFolders") 
@XmlType(name="MResponseCleanupOrphansPackagedFolders")
//#SWG#@ApiModel(description = """Used to Response of AddIngestionToPackaged and removeIngestionToPackage""")
class MResponseCleanupOrphansPackagedFolders extends MResponsePackager with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var cleanupDetails: List[MCleanupDetail] = new ArrayList[MCleanupDetail]
	def withcleanupDetails(p:List[MCleanupDetail]):this.type ={ 	this.cleanupDetails = p; 	this }

}