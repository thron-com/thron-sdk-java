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
	@XmlEnumValue("creationDate_A") creationDate_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("creationDate_D") creationDate_D,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("lastUpdate_A") lastUpdate_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("lastUpdate_D") lastUpdate_D
}