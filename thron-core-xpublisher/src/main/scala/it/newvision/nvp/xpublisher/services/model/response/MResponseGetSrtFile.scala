package it.newvision.nvp.xpublisher.services.model.response
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpublisher.model.MSubtitle

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseGetSrtFile") 
@XmlType(name="MResponseGetSrtFile")
//#SWG#@ApiModel(description = """""")
class MResponseGetSrtFile extends MResponsePublisher with Serializable  {

	/**
	 * The list of available srt files. 
	 */
	//#SWG#@ApiModelProperty(value = """The list of available srt files. """)
	@BeanProperty 
	var subTitles: List[MSubtitle] = new ArrayList[MSubtitle]
	def withsubTitles(p:List[MSubtitle]):this.type ={ 	this.subTitles = p; 	this }

}