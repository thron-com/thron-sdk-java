package it.newvision.nvp.xpackager.services.model.msg;
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
@XmlType(name="MEFileOrderBy") 
@XmlEnum
//#SWG#@ApiModel(description = """Used in the findbyProperties services as orderBy criteria.
//#SWGNL#Available keys are: 
//#SWGNL#contentName,viewCounter,ratingCounter,commentsCounter,creationDate,lastUpdate,lastUpdatedComment
//#SWGNL#_A suffix means -> ascendant order
//#SWGNL#_D suffix means -> descendant order""")
public enum MEFileOrderBy {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("fileName_A") fileName_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("fileName_D") fileName_D,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("siteName_A") siteName_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("siteName_D") siteName_D,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("modifiedDate_A") modifiedDate_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("modifiedDate_D") modifiedDate_D,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("mimetype_A") mimetype_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("mimetype_D") mimetype_D,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("totalSpace_A") totalSpace_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("totalSpace_D") totalSpace_D,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("creationDate_A") creationDate_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("creationDate_D") creationDate_D
}