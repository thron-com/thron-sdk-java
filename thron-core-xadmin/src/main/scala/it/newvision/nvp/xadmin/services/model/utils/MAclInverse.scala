package it.newvision.nvp.xadmin.services.model.utils
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.msg.MEAclAction
import it.newvision.nvp.xadmin.model.MMetadata

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MAclInverse") 
@XmlType(name="MAclInverse")
//#SWG#@ApiModel(description = """""")
class MAclInverse extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var sourceObjId: String =_
	def withsourceObjId(p:String):this.type ={ 	this.sourceObjId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var sourceObjClass: String =_
	def withsourceObjClass(p:String):this.type ={ 	this.sourceObjClass = p; 	this }

	/**
	 * List of inverse rules. Available values are 
	 */
	//#SWG#@ApiModelProperty(value = """List of inverse rules. Available values are """)
	@BeanProperty 
	var rulesInverse: List[String] = new ArrayList[String]
	def withrulesInverse(p:List[String]):this.type ={ 	this.rulesInverse = p; 	this }

	/**
	 * ADD: used to add the list of "rulesInverse" to the category for the given
	 * subjectId
	 */
	//#SWG#@ApiModelProperty(value = """ADD: used to add the list of "rulesInverse" to the category for the given subjectId""" ,required = true)
	@BeanProperty 
	var action: MEAclAction =_
	def withaction(p:MEAclAction):this.type ={ 	this.action = p; 	this }

	/**
	 * Optional. Additional metadata for the inverse rule
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Additional metadata for the inverse rule""")
	@BeanProperty 
	var customMetadata: List[MMetadata] = new ArrayList[MMetadata]
	def withcustomMetadata(p:List[MMetadata]):this.type ={ 	this.customMetadata = p; 	this }

}