package it.newvision.nvp.xcontents.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * deprecated
 */
@XmlType(name="MEVisibility") 
@XmlEnum
//#SWG#@ApiModel(description = """deprecated""")
public enum MEVisibility {
	/**
	 * The content is public and can be used everywhere
	 */
	//#SWG#@ApiModelProperty(value = """The content is public and can be used everywhere""")
	@XmlEnumValue("PUBLIC") PUBLIC,
	/**
	 * Can only be used by the shared users and groups 
	 */
	//#SWG#@ApiModelProperty(value = """Can only be used by the shared users and groups """)
	@XmlEnumValue("PRIVATE") PRIVATE
}