package it.newvision.nvp.xadmin.services.model.apps;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MESnippetStatus") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MESnippetStatus {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ACTIVE") ACTIVE,
	/**
	 * INACTIVE
	 */
	//#SWG#@ApiModelProperty(value = """INACTIVE""")
	@XmlEnumValue("INACTIVE") INACTIVE,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("DRAFT") DRAFT
}