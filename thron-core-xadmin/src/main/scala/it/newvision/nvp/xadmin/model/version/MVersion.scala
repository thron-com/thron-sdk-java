package it.newvision.nvp.xadmin.model.version
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MVersion") 
@XmlType(name="MVersion")
//#SWG#@ApiModel(description = """""")
class MVersion extends Serializable {

	/**
	 * The version Id
	 */
	//#SWG#@ApiModelProperty(value = """The version Id""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var active: Boolean  = true
	def withactive(p:Boolean):this.type ={ 	this.active = p; 	this }

	/**
	 * external reference
	 */
	//#SWG#@ApiModelProperty(value = """external reference""")
	@BeanProperty 
	var ref: MRef =_
	def withref(p:MRef):this.type ={ 	this.ref = p; 	this }

	/**
	 * Optional. Used to describe the version (available only for users with MODIFY
	 * Acl on the Content)
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Used to describe the version (available only for users with MODIFY Acl on the Content)""")
	@BeanProperty 
	var note: MVersionNote =_
	def withnote(p:MVersionNote):this.type ={ 	this.note = p; 	this }

	/**
	 * userId of the owner or engineId
	 */
	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var createdBy: MVersionSourceIdentifier =_
	def withcreatedBy(p:MVersionSourceIdentifier):this.type ={ 	this.createdBy = p; 	this }

	/**
	 * Optional. The creation date of the Version
	 */
	//#SWG#@ApiModelProperty(value = """Optional. The creation date of the Version""")
	@BeanProperty 
	var createdDate: Date  = new Date()
	def withcreatedDate(p:Date):this.type ={ 	this.createdDate = p; 	this }

	/**
	 * userId of the owner or engineId
	 */
	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var modifiedBy: MVersionSourceIdentifier =_
	def withmodifiedBy(p:MVersionSourceIdentifier):this.type ={ 	this.modifiedBy = p; 	this }

	/**
	 * Last time this Version was modified by anyone.
	 */
	//#SWG#@ApiModelProperty(value = """Last time this Version was modified by anyone.""")
	@BeanProperty 
	var modifiedDate: Date =_
	def withmodifiedDate(p:Date):this.type ={ 	this.modifiedDate = p; 	this }

}