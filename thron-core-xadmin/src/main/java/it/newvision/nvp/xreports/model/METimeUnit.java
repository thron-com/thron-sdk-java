package it.newvision.nvp.xreports.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * List of of available groups of statistics based on channels
 */
@XmlType(name="METimeUnit") 
@XmlEnum
//#SWG#@ApiModel(description = """List of of available groups of statistics based on channels""")
public enum METimeUnit {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("HOUR") HOUR,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("DAY") DAY,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("WEEK") WEEK,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("MONTH") MONTH,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("YEAR") YEAR
}