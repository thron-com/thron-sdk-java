package it.newvision.nvp.xcontents.services.model.client
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MRatingProperty

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MClientCriteria") 
@XmlType(name="MClientCriteria")
//#SWG#@ApiModel(description = """""")
class MClientCriteria extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):MClientCriteria ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var ratingProperty: MRatingProperty =_
	def withratingProperty(p:MRatingProperty):MClientCriteria ={ 	this.ratingProperty = p; 	this }

}