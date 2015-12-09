package it.newvision.nvp.test.services.model.response
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseTestList") 
@XmlType(name="MResponseTestList")
//#SWG#@ApiModel(description = """""")
class MResponseTestList extends MResponseTest with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var items: List[MTestClass] = new ArrayList[MTestClass]
	def withitems(p:List[MTestClass]):MResponseTestList ={ 	this.items = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalResults: Integer =_
	def withtotalResults(p:Integer):MResponseTestList ={ 	this.totalResults = p; 	this }

}