package it.newvision.nvp.xadmin.services.model.content
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MContentOpt") 
@XmlType(name="MContentOpt")
//#SWG#@ApiModel(description = """""")
class MContentOpt extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var basicInfoByLocale: List[MContentBasicInfo] = new ArrayList[MContentBasicInfo]
	def withbasicInfoByLocale(p:List[MContentBasicInfo]):this.type ={ 	this.basicInfoByLocale = p; 	this }

	/**
	 * Optional. Default=true
	 * Used to specify if the publishing process should define a value for all
	 * available content locales.
	 * <ul>
	 * 	<li>If false the service apply to the content only the locale specified in
	 * MContentBasicInfo</li>
	 * </ul>
	 * <ul>
	 * 	<li>If true the service apply the filename (as default value) for each single
	 * locale of the content (all available locale of the client)</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Default=true
	//#SWGNL#Used to specify if the publishing process should define a value for all available content locales. 
	//#SWGNL#<ul>
	//#SWGNL#	<li>If false the service apply to the content only the locale specified in MContentBasicInfo</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>If true the service apply the filename (as default value) for each single locale of the content (all available locale of the client)</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var initAllLocales: Boolean  = true
	def withinitAllLocales(p:Boolean):this.type ={ 	this.initAllLocales = p; 	this }

	/**
	 * Optional.
	 * Used to link the new content to the specified categories
	 */
	//#SWG#@ApiModelProperty(value = """Optional. 
	//#SWGNL#Used to link the new content to the specified categories""")
	@BeanProperty 
	var linkedCategoryIds: List[String] = new ArrayList[String]
	def withlinkedCategoryIds(p:List[String]):this.type ={ 	this.linkedCategoryIds = p; 	this }

	/**
	 * Optional. If empty it will be the full name of the user related to the token in
	 * use.
	 */
	//#SWG#@ApiModelProperty(value = """Optional. If empty it will be the full name of the user related to the token in use.""")
	@BeanProperty 
	var owner: String =_
	def withowner(p:String):this.type ={ 	this.owner = p; 	this }

	/**
	 * values belonging to MEContentProperties like:
	 * <ul>
	 * 	<li>UNLINKABLE</li>
	 * 	<li>RATINGALLOWED</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """values belonging to MEContentProperties like:
	//#SWGNL#<ul>
	//#SWGNL#	<li>UNLINKABLE</li>
	//#SWGNL#	<li>RATINGALLOWED</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var properties: List[String] = new ArrayList[String]
	def withproperties(p:List[String]):this.type ={ 	this.properties = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def validate(){
		import scala.collection.JavaConversions._
		if (Option(basicInfoByLocale).forall(_.isEmpty)) throw new IllegalArgumentException("contentOpt.basicInfoByLocale is empty")
		if(basicInfoByLocale.size()>50)throw new IllegalArgumentException("contentOpt.basicInfoByLocale has more than 50 elements") 
		basicInfoByLocale.foreach(_.validate())
		Option(linkedCategoryIds).foreach{lc=> 
			if(lc.size()>50)throw new IllegalArgumentException("contentOpt.linkedCategoryIds has more than 50 elements") 
		}
	}

}