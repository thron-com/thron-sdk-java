package it.newvision.nvp.xadmin.services.model.apps
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
 * App and snippet search criteria. Used to filter the result in JApps.
 * findByProperties service
 */
@XmlRootElement(name="MAppSnippetCriteria") 
@XmlType(name="MAppSnippetCriteria")
//#SWG#@ApiModel(description = """App and snippet search criteria. Used to filter the result in JApps.findByProperties service""")
@Deprecated
class MAppSnippetCriteria extends MAppCriteria with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var snippetIds: List[String] = new ArrayList[String]
	def withsnippetIds(p:List[String]):this.type ={ 	this.snippetIds = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var snippetStatus: List[MESnippetStatus] = new ArrayList[MESnippetStatus]
	def withsnippetStatus(p:List[MESnippetStatus]):this.type ={ 	this.snippetStatus = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var snippetDisplayName: String =_
	def withsnippetDisplayName(p:String):this.type ={ 	this.snippetDisplayName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var snippetType: List[String] = new ArrayList[String]
	def withsnippetType(p:List[String]):this.type ={ 	this.snippetType = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var snippetOwnerUsername: String =_
	def withsnippetOwnerUsername(p:String):this.type ={ 	this.snippetOwnerUsername = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isSnippetCriteria():Boolean ={
		!snippetIds.isEmpty || 
		!snippetStatus.isEmpty || 
		!snippetType.isEmpty || 
		Option(snippetDisplayName).isDefined || 
		Option(snippetOwnerUsername).isDefined
	}

	/**
	 * @param c : MAppCriteria
	 * @return 
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(c: MAppCriteria){
		this()
		this.appType = c.appType
		this.appSubType = c.appSubType
		this.appIds = c.appIds
		this.appPrettyIds = c.appPrettyIds
		this.appActive = c.appActive
		this.appDisplayName = c.appDisplayName
		this.appOwnerUsername = c.appOwnerUsername
		this.onlyMyApps = c.onlyMyApps
	
	}

}