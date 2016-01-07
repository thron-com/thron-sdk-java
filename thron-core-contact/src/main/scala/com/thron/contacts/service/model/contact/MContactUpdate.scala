package com.thron.contacts.service.model.contact
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MContactUpdate") 
@XmlType(name="MContactUpdate")
//#SWG#@ApiModel(description = """""")
class MContactUpdate extends Serializable {

	/**
	 * Optional label for the contact
	 */
	//#SWG#@ApiModelProperty(value = """Optional label for the contact""")
	@BeanProperty 
	var name: String =_
	def withname(p:String):MContactUpdate ={ 	this.name = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(name).forall{n=> 
			// String length restriction
			n.length<=100
		}
	}

}