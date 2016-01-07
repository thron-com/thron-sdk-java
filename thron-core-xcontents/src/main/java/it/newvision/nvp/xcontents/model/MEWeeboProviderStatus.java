package it.newvision.nvp.xcontents.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Define the current status of a publishing process.
 */
@XmlType(name="MEWeeboProviderStatus") 
@XmlEnum
//#SWG#@ApiModel(description = """Define the current status of a publishing process.""")
public enum MEWeeboProviderStatus {
	/**
	 * a content without published channels
	 */
	//#SWG#@ApiModelProperty(value = """a content without published channels""")
	@XmlEnumValue("DRAFT") DRAFT,
	/**
	 * if there exists a channel that has a publishing or un publishing process in
	 * progress.
	 */
	//#SWG#@ApiModelProperty(value = """if there exists a channel that has a publishing or un publishing process in progress.""")
	@XmlEnumValue("PUBLISH_IN_PROGRESS") PUBLISH_IN_PROGRESS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PUBLISHED") PUBLISHED,
	/**
	 * if exists a channel with an error status
	 */
	//#SWG#@ApiModelProperty(value = """if exists a channel with an error status""")
	@XmlEnumValue("ERROR") ERROR,
	/**
	 * if there exists a channel with a completed packaging process.
	 */
	//#SWG#@ApiModelProperty(value = """if there exists a channel with a completed packaging process.""")
	@XmlEnumValue("READY") READY,
	/**
	 * if there exists a channel that has a conversion or packaging process in
	 * progress.
	 */
	//#SWG#@ApiModelProperty(value = """if there exists a channel that has a conversion or packaging process in progress.""")
	@XmlEnumValue("INGESTION_IN_PROGRESS") INGESTION_IN_PROGRESS,
	/**
	 * The content has some channels with PUBLISHED status. This status is used only
	 * in the findContentsByProperties
	 */
	//#SWG#@ApiModelProperty(value = """The content has some channels with PUBLISHED status. This status is used only in the findContentsByProperties""")
	@XmlEnumValue("PUBLISHED_IN_SOME_CHANNELS") PUBLISHED_IN_SOME_CHANNELS,
	/**
	 * if there exists a channel that has a publishing or un publishing process in
	 * progress.
	 */
	//#SWG#@ApiModelProperty(value = """if there exists a channel that has a publishing or un publishing process in progress.""")
	@XmlEnumValue("UNPUBLISHING_IN_PROGRESS") UNPUBLISHING_IN_PROGRESS
}