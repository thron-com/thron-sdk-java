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
@XmlType(name="MEReportStatus") 
@XmlEnum
//#SWG#@ApiModel(description = """List of of available groups of statistics based on channels""")
public enum MEReportStatus {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("IN_PROGRESS") IN_PROGRESS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("COMPLETE") COMPLETE,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PARTIAL_RESULTS") PARTIAL_RESULTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("NO_RESULTS") NO_RESULTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ERROR") ERROR
}