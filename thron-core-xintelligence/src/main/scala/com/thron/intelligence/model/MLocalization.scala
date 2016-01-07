package com.thron.intelligence.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MLocalization") 
@XmlType(name="MLocalization")
//#SWG#@ApiModel(description = """""")
class MLocalization extends Serializable {

	/**
	 * Locale code (ISO639-1) 
	 */
	//#SWG#@ApiModelProperty(value = """Locale code (ISO639-1) """ ,required = true)
	@BeanProperty 
	var lang: String =_
	def withlang(p:String):MLocalization ={ 	this.lang = p; 	this }

	/**
	 * Constraints: length <= 150
	 */
	//#SWG#@ApiModelProperty(value = """Constraints: length <= 150""" ,required = true)
	@BeanProperty 
	var label: String =_
	def withlabel(p:String):MLocalization ={ 	this.label = p; 	this }

	/**
	 * Constraints: length <= 10000
	 */
	//#SWG#@ApiModelProperty(value = """Constraints: length <= 10000""")
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):MLocalization ={ 	this.description = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(label).exists(_.length<=150) && 
		Option(description).forall(_.length<=10000) && 
		Option(lang).exists(_.length<=50)
	}

}