package it.newvision.nvp.identity.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEMode") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEMode {
	/**
	 * the service are running using the old version 3x
	 */
	//#SWG#@ApiModelProperty(value = """the service are running using the old version 3x""")
	@XmlEnumValue("OLD") OLD,
	/**
	 * the service code is running with the last version
	 */
	//#SWG#@ApiModelProperty(value = """the service code is running with the last version""")
	@XmlEnumValue("LAST") LAST
}