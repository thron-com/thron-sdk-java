package it.newvision.nvp.xcontents.services.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MESearchField") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MESearchField {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("NAME") NAME,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("DESCRIPTION") DESCRIPTION,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("EXCERPT") EXCERPT,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OWNER") OWNER,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("USERID") USERID,
	/**
	 * search on key and value of metadata
	 */
	//#SWG#@ApiModelProperty(value = """search on key and value of metadata""")
	@XmlEnumValue("METADATA") METADATA,
	/**
	 * search on tags
	 */
	//#SWG#@ApiModelProperty(value = """search on tags""")
	@XmlEnumValue("TAGS") TAGS,
	/**
	 * search on Intelligence Tags
	 */
	//#SWG#@ApiModelProperty(value = """search on Intelligence Tags""")
	@XmlEnumValue("ITAGS") ITAGS
}