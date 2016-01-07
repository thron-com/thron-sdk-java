package it.newvision.nvp.xcontents.services.model.comment
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseFindComments") 
@XmlType(name="MResponseFindComments")
//#SWG#@ApiModel(description = """""")
class MResponseFindComments extends MResponseComment with Serializable  {

	/**
	 * the lists of contents satisfy the search criteria. le content list has the
	 * comments collection filtered with only the elements matching the search.
	 */
	//#SWG#@ApiModelProperty(value = """the lists of contents satisfy the search criteria. le content list has the comments collection filtered with only the elements matching the search.""")
	@BeanProperty 
	var comments: List[MCommentDetail] = new ArrayList[MCommentDetail]
	def withcomments(p:List[MCommentDetail]):MResponseFindComments ={ 	this.comments = p; 	this }

	/**
	 * Total Number Of Comments with status Pending.
	 */
	//#SWG#@ApiModelProperty(value = """Total Number Of Comments with status Pending.""" ,required = true)
	@BeanProperty 
	var totalCommentsToModerate: Integer =_
	def withtotalCommentsToModerate(p:Integer):MResponseFindComments ={ 	this.totalCommentsToModerate = p; 	this }

	/**
	 * total number of results
	 */
	//#SWG#@ApiModelProperty(value = """total number of results""" ,required = true)
	@BeanProperty 
	var totalResults: Integer  = 0
	def withtotalResults(p:Integer):MResponseFindComments ={ 	this.totalResults = p; 	this }

}