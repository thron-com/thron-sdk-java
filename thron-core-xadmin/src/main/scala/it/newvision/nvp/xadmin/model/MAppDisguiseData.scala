package it.newvision.nvp.xadmin.model
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
 * Used to specify the white/black list of users and groups that applications can
 * impersonate.
 */
@XmlRootElement(name="MAppDisguiseData") 
@XmlType(name="MAppDisguiseData")
//#SWG#@ApiModel(description = """Used to specify the white/black list of users and groups that applications can impersonate.""")
class MAppDisguiseData extends Serializable {

	/**
	 * use "*" to disable all groups. Empty list means no one (is in blacklist).
	 */
	//#SWG#@ApiModelProperty(value = """use "*" to disable all groups. Empty list means no one (is in blacklist).""")
	@BeanProperty 
	var groupsBlackList: List[String] = new ArrayList[String]
	def withgroupsBlackList(p:List[String]):this.type ={ 	this.groupsBlackList = p; 	this }

	/**
	 * use "*" to enable all groups. Empty list means no groups in whitelist.
	 */
	//#SWG#@ApiModelProperty(value = """use "*" to enable all groups. Empty list means no groups in whitelist.""")
	@BeanProperty 
	var groupsWhiteList: List[String] = new ArrayList[String]
	def withgroupsWhiteList(p:List[String]):this.type ={ 	this.groupsWhiteList = p; 	this }

	/**
	 * use "*" to disable all users. Empty list means no one (is in blacklist).
	 */
	//#SWG#@ApiModelProperty(value = """use "*" to disable all users. Empty list means no one (is in blacklist).""")
	@BeanProperty 
	var usersBlackList: List[String] = new ArrayList[String]
	def withusersBlackList(p:List[String]):this.type ={ 	this.usersBlackList = p; 	this }

	/**
	 * use "*" to enable all users. Empty list means no one.
	 */
	//#SWG#@ApiModelProperty(value = """use "*" to enable all users. Empty list means no one.""")
	@BeanProperty 
	var usersWhiteList: List[String] = new ArrayList[String]
	def withusersWhiteList(p:List[String]):this.type ={ 	this.usersWhiteList = p; 	this }

}