package it.newvision.nvp.xadmin.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEAppType") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEAppType {
	/**
	 * Platform Module
	 */
	//#SWG#@ApiModelProperty(value = """Platform Module""")
	@XmlEnumValue("CONTENT") CONTENT,
	/**
	 * Platform Module
	 */
	//#SWG#@ApiModelProperty(value = """Platform Module""")
	@XmlEnumValue("DELIVERY") DELIVERY,
	/**
	 * Platform Module
	 */
	//#SWG#@ApiModelProperty(value = """Platform Module""")
	@XmlEnumValue("INTELLIGENCE") INTELLIGENCE,
	/**
	 * Digital Signage
	 */
	//#SWG#@ApiModelProperty(value = """Digital Signage""")
	@XmlEnumValue("PLAY") PLAY,
	/**
	 * Sms
	 */
	//#SWG#@ApiModelProperty(value = """Sms""")
	@XmlEnumValue("MOVE") MOVE,
	/**
	 * custom apps and snippets
	 */
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("WEBTV") WEBTV,
	/**
	 * for custom apps
	 */
	//#SWG#@ApiModelProperty(value = """for custom apps""")
	@XmlEnumValue("CUSTOM") CUSTOM,
	/**
	 * Master Recommendation App
	 */
	//#SWG#@ApiModelProperty(value = """Master Recommendation App""")
	@XmlEnumValue("REC_MASTER") REC_MASTER,
	/**
	 * Slave Recommendation App
	 */
	//#SWG#@ApiModelProperty(value = """Slave Recommendation App""")
	@XmlEnumValue("REC_SLAVE") REC_SLAVE,
	/**
	 * Real Time Image Editor
	 */
	//#SWG#@ApiModelProperty(value = """Real Time Image Editor""")
	@XmlEnumValue("RTIE") RTIE,
	/**
	 * Digital Asset Manager
	 */
	//#SWG#@ApiModelProperty(value = """Digital Asset Manager""")
	@XmlEnumValue("OMNICHANNELDAM") OMNICHANNELDAM,
	/**
	 * Marking module
	 */
	//#SWG#@ApiModelProperty(value = """Marking module""")
	@XmlEnumValue("THRONFORMARKETING") THRONFORMARKETING,
	/**
	 * Sales Module
	 */
	//#SWG#@ApiModelProperty(value = """Sales Module""")
	@XmlEnumValue("THRONFORSALES") THRONFORSALES,
	/**
	 * Magic Site App Master
	 */
	//#SWG#@ApiModelProperty(value = """Magic Site App Master""")
	@XmlEnumValue("MAGICSITE_MASTER") MAGICSITE_MASTER,
	/**
	 * Magic Site App Slave
	 */
	//#SWG#@ApiModelProperty(value = """Magic Site App Slave""")
	@XmlEnumValue("MAGICSITE_SLAVE") MAGICSITE_SLAVE
}