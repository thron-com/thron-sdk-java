package com.thron.contacts.service.model.contact
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.contacts.model.MIdentityKey

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MContactValue") 
@XmlType(name="MContactValue")
//#SWG#@ApiModel(description = """""")
class MContactValue extends Serializable {

	/**
	 * The identity key
	 */
	//#SWG#@ApiModelProperty(value = """The identity key""" ,required = true)
	@BeanProperty 
	var ik: MIdentityKey =_
	def withik(p:MIdentityKey):MContactValue ={ 	this.ik = p; 	this }

	/**
	 * Optional label for the contact
	 */
	//#SWG#@ApiModelProperty(value = """Optional label for the contact""")
	@BeanProperty 
	var name: String =_
	def withname(p:String):MContactValue ={ 	this.name = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(name).forall{n=> 
			// String length restriction
			n.length<=100
		} && Option(ik).exists(_.isValid())
	}

}