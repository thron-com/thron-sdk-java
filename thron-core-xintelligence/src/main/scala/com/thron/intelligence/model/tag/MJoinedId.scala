package com.thron.intelligence.model.tag
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
 * <ul>
 * 	<li></li>
 * </ul>
 */
@XmlRootElement(name="MJoinedId") 
@XmlType(name="MJoinedId")
//#SWG#@ApiModel(description = """<ul>
//#SWGNL#	<li></li>
//#SWGNL#</ul>""")
class MJoinedId extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var status: MEStatus =_
	def withstatus(p:MEStatus):this.type ={ 	this.status = p; 	this }

}