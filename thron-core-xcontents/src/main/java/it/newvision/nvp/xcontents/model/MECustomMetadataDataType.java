package it.newvision.nvp.xcontents.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MECustomMetadataDataType") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MECustomMetadataDataType {
	/**
	 * only one free String value
	 */
	//#SWG#@ApiModelProperty(value = """only one free String value""")
	@XmlEnumValue("TEXTBOX") TEXTBOX,
	/**
	 * Only one numeric (int/real) value
	 */
	//#SWG#@ApiModelProperty(value = """Only one numeric (int/real) value""")
	@XmlEnumValue("NUMERICBOX") NUMERICBOX,
	/**
	 * Only one Date value
	 */
	//#SWG#@ApiModelProperty(value = """Only one Date value""")
	@XmlEnumValue("CALENDARBOX") CALENDARBOX,
	/**
	 * Only one true/false value
	 */
	//#SWG#@ApiModelProperty(value = """Only one true/false value""")
	@XmlEnumValue("CHECKBOX") CHECKBOX,
	/**
	 * A list (multi selection) of possible value
	 */
	//#SWG#@ApiModelProperty(value = """A list (multi selection) of possible value""")
	@XmlEnumValue("LISTBOX") LISTBOX,
	/**
	 * Only one value, from a selection list.
	 */
	//#SWG#@ApiModelProperty(value = """Only one value, from a selection list.""")
	@XmlEnumValue("DROPDOWNLIST") DROPDOWNLIST,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("COLORPICKER") COLORPICKER
}