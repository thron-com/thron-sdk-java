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
/**
 * External IdentityManager ID
 */
@XmlRootElement(name="MIdExternal") 
@XmlType(name="MIdExternal")
//#SWG#@ApiModel(description = """External IdentityManager ID""")
class MIdExternal extends Serializable {

	/**
	 * unique identifier of the user for a clientId.
	 * 
	 * Constraints for the id attribute:
	 * -) can not contain §/$&#<>"?*:\|
	 * -) can not contain spaces
	 * -) max length = 500
	 */
	//#SWG#@ApiModelProperty(value = """unique identifier of the user for a clientId. 
	//#SWGNL#
	//#SWGNL#Constraints for the id attribute:
	//#SWGNL#-) can not contain §/$&#<>"?*:\|
	//#SWGNL#-) can not contain spaces
	//#SWGNL#-) max length = 500""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var externalType: MEExternalIdType =_
	def withexternalType(p:MEExternalIdType):this.type ={ 	this.externalType = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(id).forall{ u =>
			u.nonEmpty &&
			// String length restriction
			u.length<=500 &&
			// MongoDB reserved chars, reserved placeholders for internal usage, Windows file name restrictions or URI-reserved chars
			u.find(Seq('$','§','\\','/',':','*','?','"','<','>','|','#','&').contains).isEmpty &&
			// No space allowed
			u.matches("""[^\s]+""") 
		}
	}

}