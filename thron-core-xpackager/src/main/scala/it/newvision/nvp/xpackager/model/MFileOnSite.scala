package it.newvision.nvp.xpackager.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MFileOnSite") 
@XmlType(name="MFileOnSite")
//#SWG#@ApiModel(description = """""")
class MFileOnSite extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var siteName: String =_
	def withsiteName(p:String):MFileOnSite ={ 	this.siteName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var status: MEFileStatus =_
	def withstatus(p:MEFileStatus):MFileOnSite ={ 	this.status = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var lastUpdate: Date =_
	def withlastUpdate(p:Date):MFileOnSite ={ 	this.lastUpdate = p; 	this }

	/**
	 * @param siteName : String
	 * @param status : MEFileStatus
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(siteName: String, 
			status: MEFileStatus){
		this()
		this.siteName = siteName
		this.status = status
	}

}