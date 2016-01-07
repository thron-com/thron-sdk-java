package it.newvision.nvp.identity.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEAclRule") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEAclRule {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("SEE") SEE,
	/**
	 * can modify the target object depending on the capabilities
	 */
	//#SWG#@ApiModelProperty(value = """can modify the target object depending on the capabilities""")
	@XmlEnumValue("MODIFY") MODIFY,
	/**
	 * The sourceObject inherit the Acl and Roles from the TargetObject
	 */
	//#SWG#@ApiModelProperty(value = """The sourceObject inherit the Acl and Roles from the TargetObject""")
	@XmlEnumValue("INHERIT_BY") INHERIT_BY
}