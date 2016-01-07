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
 * Properties for the Pagelet ingestion.
 */
@XmlRootElement(name="MPropertyPagelet") 
@XmlType(name="MPropertyPagelet")
//#SWG#@ApiModel(description = """Properties for the Pagelet ingestion.""")
class MPropertyPagelet extends MPropertyGenericDocument with Serializable  {

	/**
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEB(clientId: String){
		this.init_gd_WEB(clientId,"WEB")
		this.compliantWith= "VIEW"
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Download"
		cd.channelDescription = "Permette all'utente di visualizzare il contenuto"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Download"
		cd2.channelDescription = "The user can view the content"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.useForDownload = false
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

}