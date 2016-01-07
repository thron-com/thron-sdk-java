package it.newvision.nvp.identity.services.model.msg;
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
 * Available keys are defined inside the enumeration.
 * _A suffix means -> ascendant order
 * _D suffix means -> descendant order
 */
@XmlType(name="MEVuserOrderBy") 
@XmlEnum
//#SWG#@ApiModel(description = """Used in the findbyProperties services as orderBy criteria.
//#SWGNL#Available keys are defined inside the enumeration.
//#SWGNL#_A suffix means -> ascendant order
//#SWGNL#_D suffix means -> descendant order""")
public enum MEVuserOrderBy {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("username_A") username_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("username_D") username_D,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("creationDate_A") creationDate_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("creationDate_D") creationDate_D,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("firstName_A") firstName_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("firstName_D") firstName_D,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("lastName_A") lastName_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("lastName_D") lastName_D,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("expiryDate_A") expiryDate_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("expiryDate_D") expiryDate_D
}