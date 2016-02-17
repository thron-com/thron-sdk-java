package it.newvision.nvp.xpackager.services.model.repository
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseGetQuota") 
@XmlType(name="MResponseGetQuota")
//#SWG#@ApiModel(description = """""")
class MResponseGetQuota extends MResponseRepository with Serializable  {

	/**
	 * total amount of space available in the working Area (in MegaBytes)
	 */
	//#SWG#@ApiModelProperty(value = """total amount of space available in the working Area (in MegaBytes)""" ,required = true)
	@BeanProperty 
	var totalSpace: Long =_
	def withtotalSpace(p:Long):this.type ={ 	this.totalSpace = p; 	this }

	/**
	 * used space in the Working Area (in MegaBytes)
	 */
	//#SWG#@ApiModelProperty(value = """used space in the Working Area (in MegaBytes)""" ,required = true)
	@BeanProperty 
	var usedSpace: Long =_
	def withusedSpace(p:Long):this.type ={ 	this.usedSpace = p; 	this }

	/**
	 * storage space in Safe Area used by the files (in MegaBytes)
	 * Greater than zero when "Safe remove mode" is enabled in client's properties.
	 * All removed repository files are saved in Safe Area with a retention time,
	 * before to be definitively removed. 
	 */
	//#SWG#@ApiModelProperty(value = """storage space in Safe Area used by the files (in MegaBytes) 
	//#SWGNL#Greater than zero when "Safe remove mode" is enabled in client's properties.
	//#SWGNL#All removed repository files are saved in Safe Area with a retention time, before to be definitively removed. """ ,required = true)
	@BeanProperty 
	var usedSpaceFromSafeArea: Long =_
	def withusedSpaceFromSafeArea(p:Long):this.type ={ 	this.usedSpaceFromSafeArea = p; 	this }

	/**
	 * @return Long
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def getEffectiveUsedSpace():Long ={
		Option(this.usedSpace.longValue()).getOrElse(0L) + Option(this.usedSpaceFromSafeArea.longValue()).getOrElse(0L)
	}

}