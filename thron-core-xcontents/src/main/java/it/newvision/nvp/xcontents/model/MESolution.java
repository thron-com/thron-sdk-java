package it.newvision.nvp.xcontents.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MESolution") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MESolution {
	/**
	 * specify if is possible to rate the content.
	 */
	//#SWG#@ApiModelProperty(value = """specify if is possible to rate the content.""")
	@XmlEnumValue("VIEW") VIEW,
	/**
	 * it is possible to comment the content
	 */
	//#SWG#@ApiModelProperty(value = """it is possible to comment the content""")
	@XmlEnumValue("PLAY") PLAY,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("MOVE") MOVE,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("TALK") TALK
}