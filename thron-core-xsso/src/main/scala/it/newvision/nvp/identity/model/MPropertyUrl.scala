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
 * Properties for the Url ingestion.
 */
@XmlRootElement(name="MPropertyUrl") 
@XmlType(name="MPropertyUrl")
//#SWG#@ApiModel(description = """Properties for the Url ingestion.""")
class MPropertyUrl extends MPropertyGenericDocument with Serializable  {

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
	 * @param client : MClient
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEB(client: MClient){
		this.init_gd_WEB(client,"WEB")
		this.compliantWith= "VIEW"
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "URL"
		cd.channelDescription = "Link alla pagina"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "URL"
		cd2.channelDescription = "Link to the URL"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.useForDownload = true
	}

}