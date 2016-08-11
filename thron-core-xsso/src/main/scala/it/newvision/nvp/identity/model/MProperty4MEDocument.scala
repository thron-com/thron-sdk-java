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
/**
 * Properties for the 4ME Documents
 */
@XmlRootElement(name="MProperty4MEDocument") 
@XmlType(name="MProperty4MEDocument")
//#SWG#@ApiModel(description = """Properties for the 4ME Documents""")
class MProperty4MEDocument extends MPropertyGenericDocument with Serializable  {

	/**
	 * dpi quality
	 */
	//#SWG#@ApiModelProperty(value = """dpi quality""" ,required = true)
	@BeanProperty 
	var dpiQuality: Integer  = 96
	def withdpiQuality(p:Integer):this.type ={ 	this.dpiQuality = p; 	this }

	/**
	 * create the thumbnail using the specified page.
	 */
	//#SWG#@ApiModelProperty(value = """create the thumbnail using the specified page.""" ,required = true)
	@BeanProperty 
	@Deprecated
	var thumbPageNumber: Integer  = 1
	@Deprecated
	def withthumbPageNumber(p:Integer):this.type ={ 	this.thumbPageNumber = p; 	this }

	/**
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEB(clientId: String){
		this.init_gd_WEB(clientId,"WEB")
		this.compliantWith= "VIEW,PLAY"
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "SWF"
		cd.channelDescription = "Download, formato SWF"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "SWF"
		cd2.channelDescription = "Download, SWF format"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.convertTo="SWF"
		this.withIngestion=true
	}

	/**
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_test(clientId: String){
		this.init_gd_test(clientId,"WEB")
	}

	/**
	 * default init for WEBORIGINAL channel (Progressive Download Original Content)
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEBORIGINAL(clientId: String){
		this.init_gd_WEBORIGINAL(clientId)
		this.withIngestion = false
		this.convertTo="SWF"
	}

}