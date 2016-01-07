package it.newvision.nvp.xpackager.services.model.packager
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpackager.model.MPackagedContent

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Used to Response of AddIngestionToPackaged and removeIngestionToPackage
 */
@XmlRootElement(name="MResponseUpdateIngestionToPackage") 
@XmlType(name="MResponseUpdateIngestionToPackage")
//#SWG#@ApiModel(description = """Used to Response of AddIngestionToPackaged and removeIngestionToPackage""")
class MResponseUpdateIngestionToPackage extends MResponsePackager with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var content: MPackagedContent =_
	def withcontent(p:MPackagedContent):MResponseUpdateIngestionToPackage ={ 	this.content = p; 	this }

}