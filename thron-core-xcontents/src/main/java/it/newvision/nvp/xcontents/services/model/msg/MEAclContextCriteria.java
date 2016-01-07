package it.newvision.nvp.xcontents.services.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEAclContextCriteria") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEAclContextCriteria {
	/**
	 * Only direct Acl rules (not inherited by categories)
	 * Find all contents where the user is directly defined in ACL with SEE Rule
	 */
	//#SWG#@ApiModelProperty(value = """Only direct Acl rules (not inherited by categories)
	//#SWGNL#Find all contents where the user is directly defined in ACL with SEE Rule""")
	@XmlEnumValue("DIRECT") DIRECT,
	/**
	 * Means acl rule inherited by categories.
	 * Find all content where the user is defined in some ACL defined in (linked)
	 * Categories with SEE Rule
	 */
	//#SWG#@ApiModelProperty(value = """Means acl rule inherited by categories.
	//#SWGNL#Find all content where the user is defined in some ACL defined in (linked) Categories with SEE Rule""")
	@XmlEnumValue("DERIVED") DERIVED,
	/**
	 * Find all contents where the user is the only one directly defined in ACL with
	 * SEE Rule
	 */
	//#SWG#@ApiModelProperty(value = """Find all contents where the user is the only one directly defined in ACL with SEE Rule""")
	@XmlEnumValue("EXCLUSIVE") EXCLUSIVE
}