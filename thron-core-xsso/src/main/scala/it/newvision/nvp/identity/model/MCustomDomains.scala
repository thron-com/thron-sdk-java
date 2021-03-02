package it.newvision.nvp.identity.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MCustomDomains") 
@XmlType(name="MCustomDomains")
//#SWG#@ApiModel(description = """""")
class MCustomDomains extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var cdn: List[MCustomDomain] = new ArrayList[MCustomDomain]
	def withcdn(p:List[MCustomDomain]):this.type ={ 	this.cdn = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var dev: List[MCustomDomain] = new ArrayList[MCustomDomain]
	def withdev(p:List[MCustomDomain]):this.type ={ 	this.dev = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var track: List[MCustomDomain] = new ArrayList[MCustomDomain]
	def withtrack(p:List[MCustomDomain]):this.type ={ 	this.track = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var view: List[MCustomDomain] = new ArrayList[MCustomDomain]
	def withview(p:List[MCustomDomain]):this.type ={ 	this.view = p; 	this }

}