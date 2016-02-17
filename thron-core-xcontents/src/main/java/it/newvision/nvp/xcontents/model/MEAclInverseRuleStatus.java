package it.newvision.nvp.xcontents.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEAclInverseRuleStatus") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEAclInverseRuleStatus {
	/**
	 * The acl can not be removed, but the user can override (insert a new acl not
	 * inferred)
	 */
	//#SWG#@ApiModelProperty(value = """The acl can not be removed, but the user can override (insert a new acl not inferred)""")
	@XmlEnumValue("INFERRED") INFERRED,
	/**
	 * The acl can not be removed. The user can not override with a new acl.
	 */
	//#SWG#@ApiModelProperty(value = """The acl can not be removed. The user can not override with a new acl.""")
	@XmlEnumValue("LOCKED") LOCKED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OK") OK
}