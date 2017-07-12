package it.newvision.nvp.xadmin.services.model.content
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.model.version.MVersionNote

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
@XmlRootElement(name="MUpdateVersionParams") 
@XmlType(name="MUpdateVersionParams")
//#SWG#@ApiModel(description = """<b>Constraints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>note.description max length: 10000</li>
//#SWGNL#</ul>""")
class MUpdateVersionParams extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var note: MVersionNote =_
	def withnote(p:MVersionNote):this.type ={ 	this.note = p; 	this }

	/**
	 * @return 
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def validate(){
		Option(note).foreach(_.validate())
	}

}