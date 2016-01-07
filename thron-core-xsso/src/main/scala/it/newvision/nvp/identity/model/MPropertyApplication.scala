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
@XmlRootElement(name="MPropertyApplication") 
@XmlType(name="MPropertyApplication")
//#SWG#@ApiModel(description = """""")
class MPropertyApplication extends Serializable {

	/**
	 * <font color="#0000ff">It's the hostname for all webservices.</font>
	 * <font color="#0000ff">clientId-view.4me.it</font>
	 */
	//#SWG#@ApiModelProperty(value = """<font color="#0000ff">It's the hostname for all webservices.</font>
	//#SWGNL#<font color="#0000ff">clientId-view.4me.it</font>""" ,required = true)
	@BeanProperty 
	var applicationsServer: String  = "-view.4me.it/"
	def withapplicationsServer(p:String):MPropertyApplication ={ 	this.applicationsServer = p; 	this }

	/**
	 * available protocols. list of comma separated values.
	 * "http://,https://"
	 */
	//#SWG#@ApiModelProperty(value = """available protocols. list of comma separated values.
	//#SWGNL#"http://,https://"""" ,required = true)
	@BeanProperty 
	var webProtocols: String  = "http://"
	def withwebProtocols(p:String):MPropertyApplication ={ 	this.webProtocols = p; 	this }

	/**
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init(clientId: String){
		this.applicationsServer = clientId + this.applicationsServer
	
	}

	/**
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_test(clientId: String){
		this.applicationsServer = "localhost:8083/"
	
	}

}