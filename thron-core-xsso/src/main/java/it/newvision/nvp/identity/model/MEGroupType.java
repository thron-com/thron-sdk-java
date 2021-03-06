package it.newvision.nvp.identity.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEGroupType") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEGroupType {
	/**
	 * group of platform users, where is possible to define roles and capabilities.
	 */
	//#SWG#@ApiModelProperty(value = """group of platform users, where is possible to define roles and capabilities.""")
	@XmlEnumValue("PLATFORM") PLATFORM,
	/**
	 * The members of a BLIND group can not see each other.
	 * Only Platform and Platform_Guest users can be linked to a BLIND Group
	 */
	//#SWG#@ApiModelProperty(value = """The members of a BLIND group can not see each other. 
	//#SWGNL#Only Platform and Platform_Guest users can be linked to a BLIND Group""")
	@XmlEnumValue("PLATFORM_BLIND") PLATFORM_BLIND
}