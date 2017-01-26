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
@XmlRootElement(name="MExternalIdDetail") 
@XmlType(name="MExternalIdDetail")
//#SWG#@ApiModel(description = """""")
class MExternalIdDetail extends MExternalId with Serializable  {

	/**
	 * the external id to be used into the platform
	 * Syntax: <key>:<value>
	 */
	//#SWG#@ApiModelProperty(value = """the external id to be used into the platform 
	//#SWGNL#Syntax: <key>:<value>""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

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
		this.sanitize()
		this.id = this.getExtId()
	}

	/**
	 * @param id : String
	 * @return 
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(id: String){
		this()
		import org.apache.commons.lang.StringUtils
		this.key = StringUtils.substringBefore(id,":")
		this.value = StringUtils.substringAfter(id,":")
		this.sanitize()
		this.id = this.getExtId()
	}

	/**
	 * @param eid : MExternalId
	 * @return 
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(eid: MExternalId){
		this()
		this.key = eid.key
		this.value = eid.value
		this.sanitize()
		this.id = this.getExtId()
	}

}