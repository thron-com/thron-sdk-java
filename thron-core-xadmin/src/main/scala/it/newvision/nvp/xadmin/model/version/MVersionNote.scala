package it.newvision.nvp.xadmin.model.version
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MVersionNote") 
@XmlType(name="MVersionNote")
//#SWG#@ApiModel(description = """""")
class MVersionNote extends Serializable {

	/**
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>max length: 10000</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>max length: 10000</li>
	//#SWGNL#</ul>""" ,required = true)
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):this.type ={ 	this.description = p; 	this }

	/**
	 * @return 
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def validate(){
		if (Option(description).isEmpty) throw new IllegalArgumentException("Missing description parameter")
		if (description.length > 10000) throw new IllegalArgumentException("Invalid description parameter")
	}

}