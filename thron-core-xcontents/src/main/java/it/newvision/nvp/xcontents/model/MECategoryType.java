package it.newvision.nvp.xcontents.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MECategoryType") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MECategoryType {
	/**
	 * DEPRECATED
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED""")
	@XmlEnumValue("PRIVATE") PRIVATE,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PUBLIC") PUBLIC,
	/**
	 * Can not be removed by the user
	 */
	//#SWG#@ApiModelProperty(value = """Can not be removed by the user""")
	@XmlEnumValue("SYSTEM") SYSTEM
}