package com.thron.contacts.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MIdentityKey") 
@XmlType(name="MIdentityKey")
//#SWG#@ApiModel(description = """""")
class MIdentityKey extends Serializable {

	/**
	 * like:
	 * <ul>
	 * 	<li>thronuser (reserved for platform users)</li>
	 * </ul>
	 * <ul>
	 * 	<li>email,sapId,ecommerce.... (for external systems)</li>
	 * </ul>
	 * 
	 * Constraints:
	 * <ul>
	 * 	<li>can not contain §/$&#<>"?*:\|</li>
	 * </ul>
	 * <ul>
	 * 	<li>can not contain spaces</li>
	 * </ul>
	 * <ul>
	 * 	<li>max length = 50</li>
	 * 	<li>lowercase</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """like:
	//#SWGNL#<ul>
	//#SWGNL#	<li>thronuser (reserved for platform users)</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>email,sapId,ecommerce.... (for external systems)</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#Constraints:
	//#SWGNL#<ul>
	//#SWGNL#	<li>can not contain §/$&#<>"?*:\|</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>can not contain spaces</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>max length = 50</li>
	//#SWGNL#	<li>lowercase</li>
	//#SWGNL#</ul>""" ,required = true)
	@BeanProperty 
	var key: String =_
	def withkey(p:String):MIdentityKey ={ 	this.key = p; 	this }

	/**
	 * the id for the given key
	 * 
	 * Constraints:
	 * <ul>
	 * 	<li>can not contain §/$&#<>"?*:\|</li>
	 * </ul>
	 * <ul>
	 * 	<li>can not contain spaces</li>
	 * </ul>
	 * <ul>
	 * 	<li> max length = 100</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """the id for the given key
	//#SWGNL#
	//#SWGNL#Constraints:
	//#SWGNL#<ul>
	//#SWGNL#	<li>can not contain §/$&#<>"?*:\|</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>can not contain spaces</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li> max length = 100</li>
	//#SWGNL#</ul>""" ,required = true)
	@BeanProperty 
	var value: String =_
	def withvalue(p:String):MIdentityKey ={ 	this.value = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(key).exists{k=> 
			k.nonEmpty &&
			// String length restriction
			k.length<=50 &&
			// MongoDB reserved chars, reserved placeholders for internal usage, Windows file name restrictions or URI-reserved chars		
			k.find(Seq('$','§','\\','/',':','*','?','"','<','>','|','#','&').contains).isEmpty &&
			// No space allowed
			k.matches("""[^\s]+""") 
		} && 
		Option(value).exists{v=>
			v.nonEmpty &&
			// String length restriction
			v.length<=100 &&
			// MongoDB reserved chars, reserved placeholders for internal usage, Windows file name restrictions or URI-reserved chars		
			v.find(Seq('$','§','\\','/',':','*','?','"','<','>','|','#','&').contains).isEmpty &&
			// No space allowed
			v.matches("""[^\s]+""") 
		}
	}

	/**
	 * @return String
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def getId():String ={
		s"${this.key.toLowerCase(Locale.ENGLISH)}#${this.value}"
	}

	/**
	 * @param key : String
	 * @param value : String
	 * @return 
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(key: String, 
			value: String){
		//this()
		//this.key = org.apache.commons.lang.
		//StringUtils.lowerCase(key)
		//this.value = value

		this()
		this.key = key
		this.value = value
		sanitize()
	}

	/**
	 * @return 
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def sanitize(){
		Option(this.key).foreach{k=> this.key = org.apache.commons.lang.StringUtils.lowerCase(k,Locale.ENGLISH)}
	}

}