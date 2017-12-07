package it.newvision.nvp.identity.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Different kind of context used by ACL system
 */
@XmlType(name="MEAclContext") 
@XmlEnum
//#SWG#@ApiModel(description = """Different kind of context used by ACL system""")
public enum MEAclContext {
	/**
	 * Means ACL defined for a specific targetObject and not derived by other elements.
	 */
	//#SWG#@ApiModelProperty(value = """Means ACL defined for a specific targetObject and not derived by other elements.""")
	@XmlEnumValue("DIRECT") DIRECT,
	/**
	 * Means ACL for a specific targetObject derived by other elements (no direct ACL)
	 */
	//#SWG#@ApiModelProperty(value = """Means ACL for a specific targetObject derived by other elements (no direct ACL)""")
	@XmlEnumValue("DERIVED") DERIVED
}