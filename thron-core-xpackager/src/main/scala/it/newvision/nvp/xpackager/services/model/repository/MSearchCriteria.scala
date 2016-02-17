package it.newvision.nvp.xpackager.services.model.repository
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpackager.model.MFileOnSite

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * main class used to define the File search criteria.
 * Each attribute is a specific search criteria. If an attribute is not defined
 * (null) the search criteria is not applied. The combination of two or more
 * search criteria are with AND clause.
 * The attributes with [0..*] cardinality are in OR clause.
 */
@XmlRootElement(name="MSearchCriteria") 
@XmlType(name="MSearchCriteria")
//#SWG#@ApiModel(description = """main class used to define the File search criteria.
//#SWGNL#Each attribute is a specific search criteria. If an attribute is not defined (null) the search criteria is not applied. The combination of two or more search criteria are with AND clause. 
//#SWGNL#The attributes with [0..*] cardinality are in OR clause.""")
class MSearchCriteria extends Serializable {

	/**
	 * Filter all files in the ids list.
	 */
	//#SWG#@ApiModelProperty(value = """Filter all files in the ids list.""")
	@BeanProperty 
	var ids: List[String] = new ArrayList[String]
	def withids(p:List[String]):this.type ={ 	this.ids = p; 	this }

	/**
	 * filename with extension (example myimage.jpg)
	 */
	//#SWG#@ApiModelProperty(value = """filename with extension (example myimage.jpg)""")
	@BeanProperty 
	var fileName: String =_
	def withfileName(p:String):this.type ={ 	this.fileName = p; 	this }

	/**
	 * like: image, video, audio, application...
	 * Could be a comma separated list to filter files having a specific mimeType.
	 */
	//#SWG#@ApiModelProperty(value = """like: image, video, audio, application...
	//#SWGNL#Could be a comma separated list to filter files having a specific mimeType.""")
	@BeanProperty 
	var mimetype: String =_
	def withmimetype(p:String):this.type ={ 	this.mimetype = p; 	this }

	/**
	 * Used to filter the list of files having creation date inside the range of
	 * "startDate" and "endDate"
	 */
	//#SWG#@ApiModelProperty(value = """Used to filter the list of files having creation date inside the range of "startDate" and "endDate"""")
	@BeanProperty 
	var startDate: Date =_
	def withstartDate(p:Date):this.type ={ 	this.startDate = p; 	this }

	/**
	 * Used to filter the list of files having creation date inside the range of
	 * "startDate" and "endDate"
	 */
	//#SWG#@ApiModelProperty(value = """Used to filter the list of files having creation date inside the range of "startDate" and "endDate"""")
	@BeanProperty 
	var endDate: Date =_
	def withendDate(p:Date):this.type ={ 	this.endDate = p; 	this }

	/**
	 * filter only "removed" Files.
	 * if true the service includes the removed files
	 * if null or false then the service return only the available files in repository
	 */
	//#SWG#@ApiModelProperty(value = """filter only "removed" Files.
	//#SWGNL#if true the service includes the removed files
	//#SWGNL#if null or false then the service return only the available files in repository""")
	@BeanProperty 
	var withRemovedFiles: Boolean =_
	def withwithRemovedFiles(p:Boolean):this.type ={ 	this.withRemovedFiles = p; 	this }

	/**
	 * used to filter the files in a site with a give status.
	 */
	//#SWG#@ApiModelProperty(value = """used to filter the files in a site with a give status.""")
	@BeanProperty 
	var availableOnSites: List[MFileOnSite] = new ArrayList[MFileOnSite]
	def withavailableOnSites(p:List[MFileOnSite]):this.type ={ 	this.availableOnSites = p; 	this }

	/**
	 * Used to filter files having removeDate in range with "removeDateFrom" and
	 * "removeDateTo"
	 */
	//#SWG#@ApiModelProperty(value = """Used to filter files having removeDate in range with "removeDateFrom" and "removeDateTo"""")
	@BeanProperty 
	var removeDateFrom: Date =_
	def withremoveDateFrom(p:Date):this.type ={ 	this.removeDateFrom = p; 	this }

	/**
	 * Used to filter the list of files having removeDate in range with
	 * "removeDateFrom" and "removeDateTo"
	 */
	//#SWG#@ApiModelProperty(value = """Used to filter the list of files having removeDate in range with "removeDateFrom" and "removeDateTo"""")
	@BeanProperty 
	var removeDateTo: Date =_
	def withremoveDateTo(p:Date):this.type ={ 	this.removeDateTo = p; 	this }

	/**
	 * default = false
	 */
	//#SWG#@ApiModelProperty(value = """default = false""")
	@BeanProperty 
	var purged: Boolean =_
	def withpurged(p:Boolean):this.type ={ 	this.purged = p; 	this }

}