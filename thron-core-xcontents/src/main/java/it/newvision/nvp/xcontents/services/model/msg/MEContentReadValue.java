package it.newvision.nvp.xcontents.services.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEContentReadValue") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEContentReadValue {
	/**
	 * the content has been marked as unread by the user
	 */
	//#SWG#@ApiModelProperty(value = """the content has been marked as unread by the user""")
	@XmlEnumValue("M_UNREAD") M_UNREAD,
	/**
	 * The content has been red by the user
	 */
	//#SWG#@ApiModelProperty(value = """The content has been red by the user""")
	@XmlEnumValue("READ") READ,
	/**
	 * the content has never been read by the user
	 */
	//#SWG#@ApiModelProperty(value = """the content has never been read by the user""")
	@XmlEnumValue("UNREAD") UNREAD
}