package it.newvision.nvp.identity.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEUserType") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEUserType {
	/**
	 * user with permission to use the platfom consoles
	 */
	//#SWG#@ApiModelProperty(value = """user with permission to use the platfom consoles""")
	@XmlEnumValue("PLATFORM_USER") PLATFORM_USER,
	/**
	 * user with limited permission to use the platfom consoles
	 */
	//#SWG#@ApiModelProperty(value = """user with limited permission to use the platfom consoles""")
	@XmlEnumValue("PLATFORM_USER_GUEST") PLATFORM_USER_GUEST,
	/**
	 * Deprecated.
	 * generic user that can hase some permission to use platform contents.
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated.
	//#SWGNL#generic user that can hase some permission to use platform contents.""")
	@XmlEnumValue("EXTERNAL_USER") EXTERNAL_USER,
	/**
	 * Deprecated.
	 * generic contact used only for notification.
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated.
	//#SWGNL#generic contact used only for notification.""")
	@XmlEnumValue("GENERIC_CONTACT") GENERIC_CONTACT
}