package it.newvision.nvp.xcontents.model
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
 * An ExternalId represents an unique identifier
 * The user can define multiple external Id for the same Content.
 * Consists of a key field and a value separated by a colon (id:  <key>:<value>)
 * The value only could be not unique, so the user can specify the identification
 * label on the key field.
 * 
 * <b>Examples:</b>
 * <ul>
 * 	<li>crm:business</li>
 * 	<li>sap:buyer</li>
 * </ul>
 */
@XmlRootElement(name="MExternalId") 
@XmlType(name="MExternalId")
//#SWG#@ApiModel(description = """An ExternalId represents an unique identifier 
//#SWGNL#The user can define multiple external Id for the same Content.
//#SWGNL#Consists of a key field and a value separated by a colon (id:  <key>:<value>)
//#SWGNL#The value only could be not unique, so the user can specify the identification label on the key field.
//#SWGNL#
//#SWGNL#<b>Examples:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>crm:business</li>
//#SWGNL#	<li>sap:buyer</li>
//#SWGNL#</ul>""")
class MExternalId extends Serializable {

	/**
	 * 
	 * <b>Constraints:</b>
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
	//#SWG#@ApiModelProperty(value = """
	//#SWGNL#<b>Constraints:</b>
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
	def withkey(p:String):this.type ={ 	this.key = p; 	this }

	/**
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>max length = 200</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>max length = 200</li>
	//#SWGNL#</ul>""" ,required = true)
	@BeanProperty 
	var value: String =_
	def withvalue(p:String):this.type ={ 	this.value = p; 	this }

	/**
	 * @return String
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def getExtId():String ={
		s"${this.key.toLowerCase(Locale.ENGLISH)}:${this.value.toLowerCase(Locale.ENGLISH)}"
	}

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import org.apache.commons.lang.StringUtils
	
		Option(key).exists{k=> 
			StringUtils.isNotBlank(k) &&
			// String length restriction
			k.length<=50 &&
			// MongoDB reserved chars, reserved placeholders for internal usage, Windows file name restrictions or URI-reserved chars		
			k.find(Seq('$','§','\\','/',':','*','?','"','<','>','|','#','&').contains).isEmpty &&
			// No space allowed
			k.matches("""[^\s]+""") 
		} && 
		Option(value).exists{v=>
			StringUtils.isNotBlank(v) &&
			// String length restriction
			v.length<=200
		}
	}

	/**
	 * @return 
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def sanitize(){
		Option(this.key).foreach{k=> this.key = org.apache.commons.lang.StringUtils.lowerCase(k,Locale.ENGLISH)}
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
		this()
		this.key = key
		this.value = value
		sanitize()
	}

}