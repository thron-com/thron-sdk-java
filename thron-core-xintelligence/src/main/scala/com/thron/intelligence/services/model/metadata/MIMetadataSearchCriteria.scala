package com.thron.intelligence.services.model.metadata
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MIMetadataSearchCriteria") 
@XmlType(name="MIMetadataSearchCriteria")
//#SWG#@ApiModel(description = """""")
class MIMetadataSearchCriteria extends Serializable {

	/**
	 * linked to the following ITagDefinition.id
	 * <b>NOTAG </b>keyword is used to filter metadata definition not linked to tags.
	 */
	//#SWG#@ApiModelProperty(value = """linked to the following ITagDefinition.id
	//#SWGNL#<b>NOTAG </b>keyword is used to filter metadata definition not linked to tags.""")
	@BeanProperty 
	var tagIds: List[String] = new ArrayList[String]
	def withtagIds(p:List[String]):MIMetadataSearchCriteria ={ 	this.tagIds = p; 	this }

}