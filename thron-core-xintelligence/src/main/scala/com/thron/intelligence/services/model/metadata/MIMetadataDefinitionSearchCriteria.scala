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
/**
 * Main class used to define the MetadataDefinition search criteria.
 * Each attribute is a specific search criteria. If an attribute is not defined
 * (null) the search criteria is not applied. The combination of two or more
 * search criteria are with AND clause. 
 */
@XmlRootElement(name="MIMetadataDefinitionSearchCriteria") 
@XmlType(name="MIMetadataDefinitionSearchCriteria")
//#SWG#@ApiModel(description = """Main class used to define the MetadataDefinition search criteria.
//#SWGNL#Each attribute is a specific search criteria. If an attribute is not defined (null) the search criteria is not applied. The combination of two or more search criteria are with AND clause. """)
class MIMetadataDefinitionSearchCriteria extends MMetadataDefinitionSearchCriteria with Serializable  {

	/**
	 * linked to the following ITagDefinition.id
	 * <b>NOTAG </b>keyword is used to filter IMetadataDefinition not linked to
	 * ITagDefinition.
	 */
	//#SWG#@ApiModelProperty(value = """linked to the following ITagDefinition.id
	//#SWGNL#<b>NOTAG </b>keyword is used to filter IMetadataDefinition not linked to ITagDefinition.""")
	@BeanProperty 
	var itagId: String =_
	def withitagId(p:String):MIMetadataDefinitionSearchCriteria ={ 	this.itagId = p; 	this }

}