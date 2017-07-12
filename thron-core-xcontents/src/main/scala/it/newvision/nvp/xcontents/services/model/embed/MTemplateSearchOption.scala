package it.newvision.nvp.xcontents.services.model.embed
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MTemplateSearchOption") 
@XmlType(name="MTemplateSearchOption")
//#SWG#@ApiModel(description = """""")
class MTemplateSearchOption extends Serializable {

	/**
	 * Optional.
	 * <ul>
	 * 	<li>null: no filter</li>
	 * </ul>
	 * <ul>
	 * 	<li>true: only outdated embed codes</li>
	 * 	<li>false: only embed codes with the latest template version</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """Optional. 
	//#SWGNL#<ul>
	//#SWGNL#	<li>null: no filter</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>true: only outdated embed codes</li>
	//#SWGNL#	<li>false: only embed codes with the latest template version</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var outdatedVersion: Boolean =_
	def withoutdatedVersion(p:Boolean):this.type ={ 	this.outdatedVersion = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var template: MPlayerEmbedCodeTemplateMinimalValue =_
	def withtemplate(p:MPlayerEmbedCodeTemplateMinimalValue):this.type ={ 	this.template = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def validate(){
		Option(template).foreach(_.validate())
		Option(outdatedVersion).foreach{ _ =>
			if (Option(template).isEmpty) throw new IllegalArgumentException("Missing template param")
		}
	}

}