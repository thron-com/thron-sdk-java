package it.newvision.nvp.xreports.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * List of of available groups of statistics based on channels
 */
@XmlType(name="MEDeliveryType") 
@XmlEnum
//#SWG#@ApiModel(description = """List of of available groups of statistics based on channels""")
public enum MEDeliveryType {
	/**
	 * http://clientcode-livestream4me.weebo.it/ios/
	 */
	//#SWG#@ApiModelProperty(value = """http://clientcode-livestream4me.weebo.it/ios/""")
	@XmlEnumValue("LIVE_IOS") LIVE_IOS,
	/**
	 * http://clientcode-livestream4me.weebo.it/ms/
	 */
	//#SWG#@ApiModelProperty(value = """http://clientcode-livestream4me.weebo.it/ms/""")
	@XmlEnumValue("LIVE_MS") LIVE_MS,
	/**
	 * http://clientcode-livestream4me.weebo.it/live/
	 */
	//#SWG#@ApiModelProperty(value = """http://clientcode-livestream4me.weebo.it/live/""")
	@XmlEnumValue("LIVE_RTMP") LIVE_RTMP,
	/**
	 * http://clientcode-livestream4me.weebo.it/flash/
	 */
	//#SWG#@ApiModelProperty(value = """http://clientcode-livestream4me.weebo.it/flash/""")
	@XmlEnumValue("LIVE_FLASH") LIVE_FLASH,
	/**
	 * http://clientcode-4me.weebo.it/flash/
	 */
	//#SWG#@ApiModelProperty(value = """http://clientcode-4me.weebo.it/flash/""")
	@XmlEnumValue("VOD_FLASH") VOD_FLASH,
	/**
	 * http://clientcode-4me.weebo.it/ios/
	 */
	//#SWG#@ApiModelProperty(value = """http://clientcode-4me.weebo.it/ios/""")
	@XmlEnumValue("VOD_IOS") VOD_IOS,
	/**
	 * http://clientcode-4me.weebo.it/ms/
	 */
	//#SWG#@ApiModelProperty(value = """http://clientcode-4me.weebo.it/ms/""")
	@XmlEnumValue("VOD_MS") VOD_MS,
	/**
	 * http://clientcode-4me.weebo.it/vod/
	 */
	//#SWG#@ApiModelProperty(value = """http://clientcode-4me.weebo.it/vod/""")
	@XmlEnumValue("VOD_RTMP") VOD_RTMP,
	/**
	 * http://clientcode-4me.weebo.it/web/
	 */
	//#SWG#@ApiModelProperty(value = """http://clientcode-4me.weebo.it/web/""")
	@XmlEnumValue("VOD_RTMPWEB") VOD_RTMPWEB,
	/**
	 * http://clientcode-4me.weebo.it/static/
	 */
	//#SWG#@ApiModelProperty(value = """http://clientcode-4me.weebo.it/static/""")
	@XmlEnumValue("STATIC") STATIC,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("WEBSERVICE") WEBSERVICE,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("WOWZA") WOWZA,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("SHOUTCAST") SHOUTCAST
}