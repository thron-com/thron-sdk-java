package it.newvision.nvp.xpackager.services.model.repository
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseFindFilesByProperties") 
@XmlType(name="MResponseFindFilesByProperties")
//#SWG#@ApiModel(description = """""")
class MResponseFindFilesByProperties extends MResponseRepository with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var files: List[MFileExtended] = new ArrayList[MFileExtended]
	def withfiles(p:List[MFileExtended]):MResponseFindFilesByProperties ={ 	this.files = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalResults: Integer =_
	def withtotalResults(p:Integer):MResponseFindFilesByProperties ={ 	this.totalResults = p; 	this }

}