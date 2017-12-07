package it.newvision.nvp.identity.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MCredentialFull") 
@XmlType(name="MCredentialFull")
//#SWG#@ApiModel(description = """""")
class MCredentialFull extends MCredential with Serializable  {

	/**
	 * unique identifier of the user for a clientId. There could not be two users with
	 * the same username for the same clientId.
	 * For the "GENERIC_CONTACT" Users, the username is represented by an unique
	 * keyword and assigned by 4me platform. Value stored in lower case format.
	 * 
	 * Constraints for the username attribute:
	 * -) can not contain §/$&#<>"?*:\|
	 * -) can not contain spaces
	 * -) can not start with _
	 * -) can not start with !
	 * -) max length = 50
	 */
	//#SWG#@ApiModelProperty(value = """unique identifier of the user for a clientId. There could not be two users with the same username for the same clientId.
	//#SWGNL#For the "GENERIC_CONTACT" Users, the username is represented by an unique keyword and assigned by 4me platform. Value stored in lower case format.
	//#SWGNL#
	//#SWGNL#Constraints for the username attribute:
	//#SWGNL#-) can not contain §/$&#<>"?*:\|
	//#SWGNL#-) can not contain spaces
	//#SWGNL#-) can not start with _
	//#SWGNL#-) can not start with !
	//#SWGNL#-) max length = 50""" ,required = true)
	@BeanProperty 
	var username: String =_
	def withusername(p:String):this.type ={ 	this.username = p; 	this }

	/**
	 * Constraints for the password attribute:
	 * -) max length = 100
	 */
	//#SWG#@ApiModelProperty(value = """Constraints for the password attribute:
	//#SWGNL#-) max length = 100""" ,required = true)
	@BeanProperty 
	var password: String =_
	def withpassword(p:String):this.type ={ 	this.password = p; 	this }

	/**
	 * Optional. The last time password has been changed
	 */
	//#SWG#@ApiModelProperty(value = """Optional. The last time password has been changed""")
	@BeanProperty 
	var passwordUpdate: Date =_
	def withpasswordUpdate(p:Date):this.type ={ 	this.passwordUpdate = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def usernameIsValid():Boolean ={
		Option(sanitize()).contains(username)
	}

	/**
	 * @param username : String
	 * @param password : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(username: String, 
			password: String){
		this()
		this.username = username
		this.password = password
	}

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def usernameIsSysValid():Boolean ={
		Option(username).exists{ u =>
			u.nonEmpty &&
			// String length restriction
			u.length<=50 &&
			// Sysuser reserved usernames
			(Seq("wsadmin","wsclient").contains(u.toLowerCase) ||
			// Sysuser username prefix
			u.startsWith("_")) &&
			// Negated query prefix
			!u.startsWith("!") &&
			// MongoDB reserved chars, reserved placeholders for internal usage, Windows file name restrictions or URI-reserved chars
			u.find(Seq('$','§','\\','/',':','*','?','"','<','>','|','#','&').contains).isEmpty &&
			// No space allowed
			u.matches("""[^\s]+""")
		}
	}

	/**
	 * Returns a sanitized username, if possible, else null.
	 * @return String
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def sanitize():String ={
		import org.apache.commons.lang.StringUtils
	
		val sysusernames = Seq("wsadmin","wsclient")
		val charBlackList = Seq(' ','$','§','\\','/',':','*','?','"','<','>','|','#','&').mkString("")
	
		Option(username).filter(StringUtils.isNotBlank)
		// Normalize all kind of spaces to a single space
		.map(StringUtils.normalizeSpace)
		// Remove invalid start chars
		.map(StringUtils.stripStart(_, "!_"))
		// Replace bad chars
		.map(StringUtils.replaceChars(_, charBlackList, "_"))
		// Ensure max length
		.map(_.take(50))
		// Ensure lower-case
		.map(_.toLowerCase(Locale.ENGLISH))
		.map{ u =>
			// Skip sysuser reserved usernames
			sysusernames.find(_ == u).fold(u)(_ + "_")
		}.orNull
	}

}