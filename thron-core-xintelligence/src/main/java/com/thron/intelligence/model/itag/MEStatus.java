package com.thron.intelligence.model.itag;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEStatus") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEStatus {
	/**
	 * Merge operation in progress
	 */
	//#SWG#@ApiModelProperty(value = """Merge operation in progress""")
	@XmlEnumValue("MERGING") MERGING,
	/**
	 * The merge operation is complete
	 */
	//#SWG#@ApiModelProperty(value = """The merge operation is complete""")
	@XmlEnumValue("MERGED") MERGED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("COMBINED") COMBINED,
	/**
	 * it's not possibile to do any operation over it
	 */
	//#SWG#@ApiModelProperty(value = """it's not possibile to do any operation over it""")
	@XmlEnumValue("LOCKED") LOCKED
}