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
@XmlType(name="MEUsersGroupOrderBy") 
@XmlEnum
//#SWG#@ApiModel(description = """Used in the findbyProperties services as orderBy criteria.
//#SWGNL#Available keys are defined inside the enumeration.
//#SWGNL#_A suffix means -> ascendant order
//#SWGNL#_D suffix means -> descendant order""")
public enum MEUsersGroupOrderBy {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("name_A") name_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("name_D") name_D,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("creationDate_A") creationDate_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("creationDate_D") creationDate_D
}