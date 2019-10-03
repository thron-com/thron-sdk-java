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
/**
 * <b>Constraints:</b>
 * <ul>
 * 	<li>note.description max length: 10000</li>
 * </ul>
 */
@XmlRootElement(name="MUpdateVersionBody") 
@XmlType(name="MUpdateVersionBody")
//#SWG#@ApiModel(description = """<b>Constraints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>note.description max length: 10000</li>
//#SWGNL#</ul>""")
class MUpdateVersionBody extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var body: MSourceRawOpt =_
	def withbody(p:MSourceRawOpt):this.type ={ 	this.body = p; 	this }

}