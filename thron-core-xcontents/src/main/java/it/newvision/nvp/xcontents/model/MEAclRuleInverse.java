package it.newvision.nvp.xcontents.model;
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
	/**
	 * allowed relations:
	 * 
	 * Contents -> User
	 * Categories -> User
	 * Contents -> Groups
	 * Categories ->Groups
	 */
	//#SWG#@ApiModelProperty(value = """allowed relations:
	//#SWGNL#
	//#SWGNL#Contents -> User 
	//#SWGNL#Categories -> User
	//#SWGNL#Contents -> Groups
	//#SWGNL#Categories ->Groups""")
	@XmlEnumValue("SEEN_BY") SEEN_BY,
	/**
	 * can modify the target object depending on the capabilities
	 * 
	 * allowed relations:
	 * 
	 * Contents -> User
	 * Categories -> User
	 * Contents -> Groups
	 * Categories ->Groups
	 */
	//#SWG#@ApiModelProperty(value = """can modify the target object depending on the capabilities
	//#SWGNL#
	//#SWGNL#allowed relations:
	//#SWGNL#
	//#SWGNL#Contents -> User 
	//#SWGNL#Categories -> User
	//#SWGNL#Contents -> Groups
	//#SWGNL#Categories ->Groups""")
	@XmlEnumValue("MODIFIED_BY") MODIFIED_BY,
	/**
	 * allowed relation:
	 * 
	 * Categories-> Contents
	 */
	//#SWG#@ApiModelProperty(value = """allowed relation:
	//#SWGNL#
	//#SWGNL#Categories-> Contents""")
	@XmlEnumValue("SPREAD_TO") SPREAD_TO,
	/**
	 * allowed relation:
	 * 
	 * Contents-> User
	 */
	//#SWG#@ApiModelProperty(value = """allowed relation:
	//#SWGNL#
	//#SWGNL#Contents-> User""")
	@XmlEnumValue("SHARED_BY") SHARED_BY,
	/**
	 * allowed relation:
	 * 
	 * Contents-> User
	 */
	//#SWG#@ApiModelProperty(value = """allowed relation:
	//#SWGNL#
	//#SWGNL#Contents-> User""")
	@XmlEnumValue("BELONGS_TO") BELONGS_TO
}