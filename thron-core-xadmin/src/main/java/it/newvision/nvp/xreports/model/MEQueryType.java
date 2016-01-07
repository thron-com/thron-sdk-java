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
@XmlType(name="MEQueryType") 
@XmlEnum
//#SWG#@ApiModel(description = """List of of available groups of statistics based on channels""")
public enum MEQueryType {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ONLY_LIVEEVENT_REPORT") ONLY_LIVEEVENT_REPORT,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("SITE_ACCELERATION_REPORT") SITE_ACCELERATION_REPORT
}