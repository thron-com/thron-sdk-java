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
	 * -> MContent.creationDate
	 */
	//#SWG#@ApiModelProperty(value = """-> MContent.creationDate""")
	@BeanProperty 
	var creationDate: Date =_
	def withcreationDate(p:Date):this.type ={ 	this.creationDate = p; 	this }

	/**
	 * -> MContent.properties
	 */
	//#SWG#@ApiModelProperty(value = """-> MContent.properties""")
	@BeanProperty 
	var properties: List[MEContentProperties] =_
	def withproperties(p:List[MEContentProperties]):this.type ={ 	this.properties = p; 	this }

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
	 * date time when the content becomes inactive.
	 * -> MContent.inactiveDate
	 */
	//#SWG#@ApiModelProperty(value = """date time when the content becomes inactive.
	//#SWGNL#-> MContent.inactiveDate""")
	@BeanProperty 
	var inactiveDate: Date =_
	def withinactiveDate(p:Date):this.type ={ 	this.inactiveDate = p; 	this }

	/**
	 * used for custom lexicographical order of contents. The field is used in
	 * JContent.findByProperties (MEContentOrderBy.sortingField_A/D) to sort the
	 * result set.
	 * -> MContent.sortingField
	 */
	//#SWG#@ApiModelProperty(value = """used for custom lexicographical order of contents. The field is used in JContent.findByProperties (MEContentOrderBy.sortingField_A/D) to sort the result set.
	//#SWGNL#-> MContent.sortingField""")
	@BeanProperty 
	var sortingField: String =_
	def withsortingField(p:String):this.type ={ 	this.sortingField = p; 	this }

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
	 * @param inactiveDate : Date
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(creationDate: Date, 
			status: String, 
			owner: String, 
			inactiveDate: Date){
		this()
		Option(creationDate)foreach (this.creationDate=_)
		Option(owner)foreach (this.owner=_)
		Option(status)foreach (this.status=_)
		Option(inactiveDate)foreach (this.inactiveDate=_)
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
		Option(c.inactiveDate)foreach (this.inactiveDate=_)
		Option(c.sortingField)foreach (this.sortingField=_)
		Option(c.properties)foreach (this.properties=_)
	}

}