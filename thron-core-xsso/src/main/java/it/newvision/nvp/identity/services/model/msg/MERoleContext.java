package it.newvision.nvp.identity.services.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MERoleContext") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MERoleContext {
	/**
	 * Considers roles and capabilities on user only
	 */
	//#SWG#@ApiModelProperty(value = """Considers roles and capabilities on user only""")
	@XmlEnumValue("OWN") OWN,
	/**
	 * Considers roles and capabilities on user and each of his linked groups.
	 */
	//#SWG#@ApiModelProperty(value = """Considers roles and capabilities on user and each of his linked groups.""")
	@XmlEnumValue("ALL") ALL
}