package it.newvision.nvp.xcontents.services.model.content
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MEContentProperties
import it.newvision.nvp.xcontents.model.MContent
import it.newvision.nvp.xcontents.services.model.common.MUpdater

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Empty attributes are not updated in the platform.
 * You cannot update a single element of an array or a complex attribute, all of
 * its elements must be included, otherwise they will be overwritten. To remove a
 * specific attribute instead, you will have to include it within the "patch"
 * parameter, as illustrated in the model description.
 */
@XmlRootElement(name="MContentUpdate") 
@XmlType(name="MContentUpdate")
//#SWG#@ApiModel(description = """Empty attributes are not updated in the platform.
//#SWGNL#You cannot update a single element of an array or a complex attribute, all of its elements must be included, otherwise they will be overwritten. To remove a specific attribute instead, you will have to include it within the "patch" parameter, as illustrated in the model description.""")
class MContentUpdate extends MUpdater with Serializable  {

	/**
	 * -> MContent.creationDate
	 */
	//#SWG#@ApiModelProperty(value = """-> MContent.creationDate""")
	@BeanProperty 
	var creationDate: Date =_
	def withcreationDate(p:Date):this.type ={ 	this.creationDate = p; 	this }

	/**
	 * The display name of the Author.
	 * -> MContent.owner
	 */
	//#SWG#@ApiModelProperty(value = """The display name of the Author.
	//#SWGNL#-> MContent.owner""")
	@BeanProperty 
	var owner: String =_
	def withowner(p:String):this.type ={ 	this.owner = p; 	this }

	/**
	 * -> MContent.properties
	 */
	//#SWG#@ApiModelProperty(value = """-> MContent.properties""")
	@BeanProperty 
	var properties: List[MEContentProperties] =_
	def withproperties(p:List[MEContentProperties]):this.type ={ 	this.properties = p; 	this }

	/**
	 * DEPRECATED.
	 * Update MContent.status
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED.
	//#SWGNL#Update MContent.status""")
	@BeanProperty 
	@Deprecated
	var status: String =_
	@Deprecated
	def withstatus(p:String):this.type ={ 	this.status = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def filterEmpty(){
		import collection.JavaConversions._
		Option(properties).foreach{ p=> properties = p filterNot {_ == null}}
	}

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		true
	}

	/**
	 * @param creationDate : Date
	 * @param status : String
	 * @param owner : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(creationDate: Date, 
			status: String, 
			owner: String){
		this()
		Option(creationDate)foreach (this.creationDate=_)
		Option(owner)foreach (this.owner=_)
		Option(status)foreach (this.status=_)
	}

	/**
	 * @param c : MContent
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(c: MContent){
		this()
		Option(c.creationDate)foreach (this.creationDate=_)
		Option(c.owner)foreach (this.owner=_)
		Option(c.status)foreach (this.status=_)
		Option(c.properties)foreach (this.properties=_)
	}

}