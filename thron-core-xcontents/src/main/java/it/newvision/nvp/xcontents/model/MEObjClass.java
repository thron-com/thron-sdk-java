package it.newvision.nvp.xcontents.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEObjClass") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEObjClass {
	/**
	 * the Content class
	 */
	//#SWG#@ApiModelProperty(value = """the Content class""")
	@XmlEnumValue("CONTENT") CONTENT,
	/**
	 * The Category Class
	 */
	//#SWG#@ApiModelProperty(value = """The Category Class""")
	@XmlEnumValue("CATEGORY") CATEGORY,
	/**
	 * custom Application or Solution
	 */
	//#SWG#@ApiModelProperty(value = """custom Application or Solution""")
	@XmlEnumValue("APP") APP,
	/**
	 * The User class
	 */
	//#SWG#@ApiModelProperty(value = """The User class""")
	@XmlEnumValue("USER") USER,
	/**
	 * The Group class
	 */
	//#SWG#@ApiModelProperty(value = """The Group class""")
	@XmlEnumValue("GROUP") GROUP,
	/**
	 * CUSTOM class not defined. Used to archive the relation between external user
	 * not registered in the platform
	 */
	//#SWG#@ApiModelProperty(value = """CUSTOM class not defined. Used to archive the relation between external user not registered in the platform""")
	@XmlEnumValue("CUSTOM") CUSTOM
}