package it.newvision.nvp.identity.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEObjClass") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEObjClass {
	/**
	 * the Users class
	 */
	//#SWG#@ApiModelProperty(value = """the Users class""")
	@XmlEnumValue("USER") USER,
	/**
	 * The group class
	 */
	//#SWG#@ApiModelProperty(value = """The group class""")
	@XmlEnumValue("GROUP") GROUP,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("APP") APP,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CUSTOM") CUSTOM
}