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
 * Used by 4ME to set the access policy of the content. The information about the
 * access control list are returned by the JAcl service
 * 
 * allowed relations:
 * 
 * User <SEE,MODIFY,SHARE,OWN> Contents
 * User <SEE,MODIFY,SHARE> Categories
 * Groups <SEE,MODIFY,SHARE> Contents
 * Groups <SEE,MODIFY,SHARE> Categories
 * 
 * Custom <SEE> Contents
 * 
 * Contents <INHERIT> Categories.
 * INHERIT works only on AclRules [SEE,MODIFY,SHARE]
 */
@XmlRootElement(name="MAclObjectRule") 
@XmlType(name="MAclObjectRule")
//#SWG#@ApiModel(description = """Used by 4ME to set the access policy of the content. The information about the access control list are returned by the JAcl service
//#SWGNL#
//#SWGNL#allowed relations:
//#SWGNL#
//#SWGNL#User <SEE,MODIFY,SHARE,OWN> Contents
//#SWGNL#User <SEE,MODIFY,SHARE> Categories
//#SWGNL#Groups <SEE,MODIFY,SHARE> Contents
//#SWGNL#Groups <SEE,MODIFY,SHARE> Categories
//#SWGNL#
//#SWGNL#Custom <SEE> Contents
//#SWGNL#
//#SWGNL#Contents <INHERIT> Categories. 
//#SWGNL#INHERIT works only on AclRules [SEE,MODIFY,SHARE]""")
class MAclObjectRule extends Serializable {

	/**
	 * the identifier of the object where the ACL should be applied
	 */
	//#SWG#@ApiModelProperty(value = """the identifier of the object where the ACL should be applied""" ,required = true)
	@BeanProperty 
	var sourceObjId: String =_
	def withsourceObjId(p:String):MAclObjectRule ={ 	this.sourceObjId = p; 	this }

	/**
	 * the object class
	 */
	//#SWG#@ApiModelProperty(value = """the object class""" ,required = true)
	@BeanProperty 
	var sourceObjClass: MEObjClass =_
	def withsourceObjClass(p:MEObjClass):MAclObjectRule ={ 	this.sourceObjClass = p; 	this }

	/**
	 * like: FACEBOOK, EMAIL, TWITTER, SMS,
	 */
	//#SWG#@ApiModelProperty(value = """like: FACEBOOK, EMAIL, TWITTER, SMS,""")
	@BeanProperty 
	var customMetadata: List[MMetadata] = new ArrayList[MMetadata]
	def withcustomMetadata(p:List[MMetadata]):MAclObjectRule ={ 	this.customMetadata = p; 	this }

	/**
	 * the acl rules defined for each target object
	 */
	@BeanProperty
	//#SWG#@ApiModelProperty(value = """the acl rules defined for each target object""")
	var targetAcl: List[MAclRule] = new ArrayList[MAclRule]
	  def withtargetAcl(p:List[MAclRule]):MAclObjectRule ={ 	this.targetAcl = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		//TODO: 
		true
	}

}