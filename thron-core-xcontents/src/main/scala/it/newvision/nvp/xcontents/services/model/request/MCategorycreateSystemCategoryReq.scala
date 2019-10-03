package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MCategory4Locale
import it.newvision.nvp.xcontents.services.model.common.MCredential
import it.newvision.nvp.xcontents.services.model.category.MCategoryUpdate

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JCategory.createSystemCategory
 */
@XmlRootElement(name="MCategorycreateSystemCategoryReq")
@XmlType(name="MCategorycreateSystemCategoryReq")
//#SWG#@ApiModel(description = "Request message for service JCategory.createSystemCategory")
class MCategorycreateSystemCategoryReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var catLocales: MCategory4Locale =_
	def withcatLocales(p:MCategory4Locale):this.type ={ 	this.catLocales = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var client: MCredential =_
	def withclient(p:MCredential):this.type ={ 	this.client = p; 	this }

	/**
	 * The preferred and unique categoryId to use. To the given categoryId will be
	 * used as prefix the clientId like:
	 * <CLIENTID_>+<categoryId>
	 */
	//#SWG#@ApiModelProperty(value = """The preferred and unique categoryId to use. To the given categoryId will be used as prefix the clientId like:
	//#SWGNL#<CLIENTID_>+<categoryId>""", required = true)
	@BeanProperty
	var newCategoryId: String =_
	def withnewCategoryId(p:String):this.type ={ 	this.newCategoryId = p; 	this }

	/**
	 * Optional
	 */
	//#SWG#@ApiModelProperty(value = """Optional""", required = true)
	@BeanProperty
	var options: MCategoryUpdate =_
	def withoptions(p:MCategoryUpdate):this.type ={ 	this.options = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var upCatId: String =_
	def withupCatId(p:String):this.type ={ 	this.upCatId = p; 	this }

}