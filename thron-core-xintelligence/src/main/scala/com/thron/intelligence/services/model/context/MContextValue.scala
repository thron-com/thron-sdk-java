package com.thron.intelligence.services.model.context
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.MLocalization

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MContextValue") 
@XmlType(name="MContextValue")
//#SWG#@ApiModel(description = """""")
class MContextValue extends Serializable {

	/**
	 * label and description values for the classification in multilocale
	 */
	//#SWG#@ApiModelProperty(value = """label and description values for the classification in multilocale""")
	@BeanProperty 
	var names: List[MLocalization] = new ArrayList[MLocalization]
	def withnames(p:List[MLocalization]):this.type ={ 	this.names = p; 	this }

}