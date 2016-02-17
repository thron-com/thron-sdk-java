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
 * Properties for the Image ingestion.
 */
@XmlRootElement(name="MPropertyImage") 
@XmlType(name="MPropertyImage")
//#SWG#@ApiModel(description = """Properties for the Image ingestion.""")
class MPropertyImage extends MPropertyGenericDocument with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var jpegQuality: Integer  = 90
	def withjpegQuality(p:Integer):this.type ={ 	this.jpegQuality = p; 	this }

	/**
	 * default. no resize
	 */
	//#SWG#@ApiModelProperty(value = """default. no resize""" ,required = true)
	@BeanProperty 
	var resizeWidth: Integer  = 1024
	def withresizeWidth(p:Integer):this.type ={ 	this.resizeWidth = p; 	this }

	/**
	 * default no resize. 0 = keep aspect ration depending on the width size.
	 */
	//#SWG#@ApiModelProperty(value = """default no resize. 0 = keep aspect ration depending on the width size.""" ,required = true)
	@BeanProperty 
	var resizeHeight: Integer  = 0
	def withresizeHeight(p:Integer):this.type ={ 	this.resizeHeight = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var stretch: Boolean  = false
	def withstretch(p:Boolean):this.type ={ 	this.stretch = p; 	this }

	/**
	 * custom image parameter (imagemagic) to add to the ingestion process. 
	 */
	//#SWG#@ApiModelProperty(value = """custom image parameter (imagemagic) to add to the ingestion process. """ ,required = true)
	@BeanProperty 
	var ingestionParameters: String  = ""
	def withingestionParameters(p:String):this.type ={ 	this.ingestionParameters = p; 	this }

	/**
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEB(clientId: String){
		this.init_gd_WEB(clientId,"WEB")
		this.compliantWith= "VIEW,PLAY"
		this.convertTo="JPG"
		this.withIngestion=true
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Download"
		cd.channelDescription = "Permette all'utente di scaricare un contenuto"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Download"
		cd2.channelDescription = "The user can download a content"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.useForDownload = true
	}

	/**
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEBHD(clientId: String){
		this.init_gd_WEB(clientId,"WEBHD")
		this.compliantWith= "VIEW,PLAY"
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Download HD"
		cd.channelDescription = "Permette all'utente di scaricare un contenuto in HD"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Download HD"
		cd2.channelDescription = "The user can download a content in HD"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.resizeWidth = 1920
		this.useForDownload = true
		this.convertTo="JPG"
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
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEBIPHONE(clientId: String){
		this.init_gd_WEB(clientId,"WEBIPHONE")
		this.jpegQuality = 80
		this.convertTo="JPG"
		this.withIngestion=true
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
		this.convertTo="JPG"
	}

}