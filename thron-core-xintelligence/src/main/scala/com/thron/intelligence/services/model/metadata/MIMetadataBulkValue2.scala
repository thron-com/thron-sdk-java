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
@XmlRootElement(name="MIMetadataBulkValue2") 
@XmlType(name="MIMetadataBulkValue2")
//#SWG#@ApiModel(description = """""")
class MIMetadataBulkValue2 extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var imetadata: MIMetadata =_
	def withimetadata(p:MIMetadata):this.type ={ 	this.imetadata = p; 	this }

	/**
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>maximum 50 items</li>
	 * 	<li>same entityType for all items</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>maximum 50 items</li>
	//#SWGNL#	<li>same entityType for all items</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var targets: List[MTarget] = new ArrayList[MTarget]
	def withtargets(p:List[MTarget]):this.type ={ 	this.targets = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import collection.JavaConversions._
		Option(targets).exists(x=> x.nonEmpty && x.size<=50 && x.forall(_.isValid))
	}

}