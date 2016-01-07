package it.newvision.nvp.xcontents.services.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Used in the findbyProperties services as orderBy criteria.
 * Available keys are:
 * contentName,viewCounter,ratingCounter,commentsCounter,creationDate,lastUpdate,
 * lastUpdatedComment
 * _A suffix means -> ascendant order
 * _D suffix means -> descendant order
 */
@XmlType(name="MELiveEventOrderBy") 
@XmlEnum
//#SWG#@ApiModel(description = """Used in the findbyProperties services as orderBy criteria.
//#SWGNL#Available keys are: 
//#SWGNL#contentName,viewCounter,ratingCounter,commentsCounter,creationDate,lastUpdate,lastUpdatedComment
//#SWGNL#_A suffix means -> ascendant order
//#SWGNL#_D suffix means -> descendant order""")
public enum MELiveEventOrderBy {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("contentName_A") contentName_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("contentName_D") contentName_D,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("creationDate_A") creationDate_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("creationDate_D") creationDate_D,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("startDate_D") startDate_D,
	/**
	 * live event fromDate
	 */
	//#SWG#@ApiModelProperty(value = """live event fromDate""")
	@XmlEnumValue("startDate_A") startDate_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("viewCounter_A") viewCounter_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("viewCounter_D") viewCounter_D,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ratingCounter_A") ratingCounter_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ratingCounter_D") ratingCounter_D,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("commentsCounter_A") commentsCounter_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("commentsCounter_D") commentsCounter_D,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("lastUpdate_A") lastUpdate_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("lastUpdate_D") lastUpdate_D,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("contentType_A") contentType_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("contentType_D") contentType_D,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("lastUpdatedComment_A") lastUpdatedComment_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("lastUpdatedComment_D") lastUpdatedComment_D,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("userId_A") userId_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("userId_D") userId_D,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("commentsApprovedCounter_A") commentsApprovedCounter_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("commentsApprovedCounter_D") commentsApprovedCounter_D,
	/**
	 * used to sort the result set using the MContent.sortingField (ascending)
	 */
	//#SWG#@ApiModelProperty(value = """used to sort the result set using the MContent.sortingField (ascending)""")
	@XmlEnumValue("sortingField_A") sortingField_A,
	/**
	 * used to sort the result set using the MContent.sortingField (descending)
	 */
	//#SWG#@ApiModelProperty(value = """used to sort the result set using the MContent.sortingField (descending)""")
	@XmlEnumValue("sortingField_D") sortingField_D
}