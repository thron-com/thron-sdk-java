package it.newvision.nvp.identity.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEAclRuleInverse") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEAclRuleInverse {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("SEEN_BY") SEEN_BY,
	/**
	 * can modify the target object depending on the capabilities
	 */
	//#SWG#@ApiModelProperty(value = """can modify the target object depending on the capabilities""")
	@XmlEnumValue("MODIFIED_BY") MODIFIED_BY,
	/**
	 * The targetObject spread the Acl and Roles to the SourceObject
	 */
	//#SWG#@ApiModelProperty(value = """The targetObject spread the Acl and Roles to the SourceObject""")
	@XmlEnumValue("SPREAD_TO") SPREAD_TO
}