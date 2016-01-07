package it.newvision.nvp.xcontents.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEAccess") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEAccess {
	/**
	 * Can read and write the content
	 */
	//#SWG#@ApiModelProperty(value = """Can read and write the content""")
	@XmlEnumValue("WRITE") WRITE,
	/**
	 * Can only read the content
	 */
	//#SWG#@ApiModelProperty(value = """Can only read the content""")
	@XmlEnumValue("READ") READ
}