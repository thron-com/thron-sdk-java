package it.newvision.nvp.identity.services.model.user
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
 * main class used to define the comment search criteria.
 * Each attribute is a specific search criteria. If an attribute is not defined
 * (null) the search criteria is not applied. The combination of two or more
 * search criteria are with AND clause.
 * The attributes with [0..*] cardinality are in OR clause.
 */
@XmlRootElement(name="MUserCriteria") 
@XmlType(name="MUserCriteria")
//#SWG#@ApiModel(description = """main class used to define the comment search criteria.
//#SWGNL#Each attribute is a specific search criteria. If an attribute is not defined (null) the search criteria is not applied. The combination of two or more search criteria are with AND clause. 
//#SWGNL#The attributes with [0..*] cardinality are in OR clause.""")
class MUserCriteria extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var active: Boolean =_
	def withactive(p:Boolean):this.type ={ 	this.active = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var email: String =_
	def withemail(p:String):this.type ={ 	this.email = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var firstname: String =_
	def withfirstname(p:String):this.type ={ 	this.firstname = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var lastname: String =_
	def withlastname(p:String):this.type ={ 	this.lastname = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var linkedGroupsIds: List[String] = new ArrayList[String]
	def withlinkedGroupsIds(p:List[String]):this.type ={ 	this.linkedGroupsIds = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var solutions: List[String] = new ArrayList[String]
	def withsolutions(p:List[String]):this.type ={ 	this.solutions = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var usernames: List[String] = new ArrayList[String]
	def withusernames(p:List[String]):this.type ={ 	this.usernames = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var userRole: List[String] = new ArrayList[String]
	def withuserRole(p:List[String]):this.type ={ 	this.userRole = p; 	this }

}