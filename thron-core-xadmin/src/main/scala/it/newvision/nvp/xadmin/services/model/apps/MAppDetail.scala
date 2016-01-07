package it.newvision.nvp.xadmin.services.model.apps
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.model.MApp

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MAppDetail") 
@XmlType(name="MAppDetail")
//#SWG#@ApiModel(description = """""")
class MAppDetail extends MApp with Serializable  {

	/**
	 * the capabilities detail of the application.
	 */
	//#SWG#@ApiModelProperty(value = """the capabilities detail of the application.""")
	@BeanProperty 
	var appUserDetail: MAppUserDetail =_
	def withappUserDetail(p:MAppUserDetail):MAppDetail ={ 	this.appUserDetail = p; 	this }

	/**
	 * all app user managers and owner.
	 */
	//#SWG#@ApiModelProperty(value = """all app user managers and owner.""")
	@BeanProperty 
	var otherUsersDetail: List[MAppUserDetail] = new ArrayList[MAppUserDetail]
	def withotherUsersDetail(p:List[MAppUserDetail]):MAppDetail ={ 	this.otherUsersDetail = p; 	this }

	/**
	 * all app group managers.
	 */
	//#SWG#@ApiModelProperty(value = """all app group managers.""")
	@BeanProperty 
	var groupsDetail: List[MAppGroupDetail] = new ArrayList[MAppGroupDetail]
	def withgroupsDetail(p:List[MAppGroupDetail]):MAppDetail ={ 	this.groupsDetail = p; 	this }

}