package it.newvision.nvp.xcontents.services.model.content.search
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MContentSearchResponseOptions") 
@XmlType(name="MContentSearchResponseOptions")
//#SWG#@ApiModel(description = """""")
class MContentSearchResponseOptions extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var orderBy: MEContentSearchOrderBy =_
	def withorderBy(p:MEContentSearchOrderBy):this.type ={ 	this.orderBy = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var resultsPageSize: Integer =_
	def withresultsPageSize(p:Integer):this.type ={ 	this.resultsPageSize = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var returnDetailsFields: List[MEContentFieldOptions] =_
	def withreturnDetailsFields(p:List[MEContentFieldOptions]):this.type ={ 	this.returnDetailsFields = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var thumbsOptions: List[MThumbsUrlOptions] =_
	def withthumbsOptions(p:List[MThumbsUrlOptions]):this.type ={ 	this.thumbsOptions = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(orderBy).isDefined && 
		Option(resultsPageSize).exists(x=> x<=50 || x>=0 )
	}

}