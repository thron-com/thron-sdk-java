package it.newvision.nvp.xcontents.model;
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
	/**
	 * allowed relations:
	 * 
	 * User -> Contents
	 * User -> Categories
	 * Groups -> Contents
	 * Groups -> Categories
	 * 
	 * Custom -> Contents
	 */
	//#SWG#@ApiModelProperty(value = """allowed relations:
	//#SWGNL#
	//#SWGNL#User -> Contents
	//#SWGNL#User -> Categories
	//#SWGNL#Groups -> Contents
	//#SWGNL#Groups -> Categories
	//#SWGNL#
	//#SWGNL#Custom -> Contents""")
	@XmlEnumValue("SEE") SEE,
	/**
	 * allowed relations:
	 * 
	 * User -> Contents
	 * User -> Categories
	 * Groups -> Contents
	 * Groups -> Categories
	 */
	//#SWG#@ApiModelProperty(value = """allowed relations:
	//#SWGNL#
	//#SWGNL#User -> Contents
	//#SWGNL#User -> Categories
	//#SWGNL#Groups -> Contents
	//#SWGNL#Groups -> Categories""")
	@XmlEnumValue("MODIFY") MODIFY,
	/**
	 * allowed relations:
	 * 
	 * Contents-> Categories
	 */
	//#SWG#@ApiModelProperty(value = """allowed relations:
	//#SWGNL#
	//#SWGNL#Contents-> Categories""")
	@XmlEnumValue("INHERIT_BY") INHERIT_BY,
	/**
	 * Can be used only by Users/Groups in Category Object. and Specify that the users
	 * and groups can add elements to the category
	 * 
	 * allowed relations:
	 * 
	 * User -> Contents
	 * User -> Categories
	 * Groups -> Contents
	 * Groups -> Categories
	 */
	//#SWG#@ApiModelProperty(value = """Can be used only by Users/Groups in Category Object. and Specify that the users and groups can add elements to the category
	//#SWGNL#
	//#SWGNL#allowed relations:
	//#SWGNL#
	//#SWGNL#User -> Contents
	//#SWGNL#User -> Categories
	//#SWGNL#Groups -> Contents
	//#SWGNL#Groups -> Categories""")
	@XmlEnumValue("SHARE") SHARE,
	/**
	 * allowed relations:
	 * 
	 * User -> Contents
	 */
	//#SWG#@ApiModelProperty(value = """allowed relations:
	//#SWGNL#
	//#SWGNL#User -> Contents""")
	@XmlEnumValue("OWN") OWN
}