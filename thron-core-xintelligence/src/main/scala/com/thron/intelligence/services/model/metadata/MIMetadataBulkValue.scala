package com.thron.intelligence.services.model.metadata
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.common.MTarget

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Map the association between a Target Definition and an Entity
 */
@XmlRootElement(name="MIMetadataBulkValue") 
@XmlType(name="MIMetadataBulkValue")
//#SWG#@ApiModel(description = """""")
class MIMetadataBulkValue extends Serializable {

	/**
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>maximum 50 items</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>maximum 50 items</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var imetadata: List[MIMetadata] = new ArrayList[MIMetadata]
	def withimetadata(p:List[MIMetadata]):this.type ={ 	this.imetadata = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var target: MTarget =_
	def withtarget(p:MTarget):this.type ={ 	this.target = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import collection.JavaConversions._
	
		Option(target).exists(_.isValid) &&
		Option(imetadata).exists(x=> x.nonEmpty && x.size<=50 )
	}

}