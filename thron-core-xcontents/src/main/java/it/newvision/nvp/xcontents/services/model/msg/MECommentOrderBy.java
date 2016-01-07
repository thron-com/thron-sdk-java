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
 * Used in the findComments services as orderBy criteria.
 * Available keys are:
 * commentCreationDate,moderationLastUpdate,moderatorId,userId
 * _A suffix means -> ascendant order
 * _D suffix means -> descendant order
 */
@XmlType(name="MECommentOrderBy") 
@XmlEnum
//#SWG#@ApiModel(description = """Used in the findComments services as orderBy criteria.
//#SWGNL#Available keys are: 
//#SWGNL#commentCreationDate,moderationLastUpdate,moderatorId,userId
//#SWGNL#_A suffix means -> ascendant order
//#SWGNL#_D suffix means -> descendant order""")
public enum MECommentOrderBy {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("commentCreationDate_A") commentCreationDate_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("commentCreationDate_D") commentCreationDate_D,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("moderationLastUpdate_A") moderationLastUpdate_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("moderationLastUpdate_D") moderationLastUpdate_D,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("moderatorId_A") moderatorId_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("moderatorId_D") moderatorId_D,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("userId_A") userId_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("userId_D") userId_D
}