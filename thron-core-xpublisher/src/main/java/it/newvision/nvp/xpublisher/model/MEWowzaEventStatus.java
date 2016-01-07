package it.newvision.nvp.xpublisher.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * The status of the wowza server in the 4me cloud
 */
@XmlType(name="MEWowzaEventStatus") 
@XmlEnum
//#SWG#@ApiModel(description = """The status of the wowza server in the 4me cloud""")
public enum MEWowzaEventStatus {
	/**
	 * the resources has not been commissioned
	 */
	//#SWG#@ApiModelProperty(value = """the resources has not been commissioned""")
	@XmlEnumValue("DRAFT") DRAFT,
	/**
	 * resources commissioned and the server is ready
	 */
	//#SWG#@ApiModelProperty(value = """resources commissioned and the server is ready""")
	@XmlEnumValue("READY") READY,
	/**
	 * resources deactivated.
	 */
	//#SWG#@ApiModelProperty(value = """resources deactivated.""")
	@XmlEnumValue("DEACTIVATED") DEACTIVATED
}