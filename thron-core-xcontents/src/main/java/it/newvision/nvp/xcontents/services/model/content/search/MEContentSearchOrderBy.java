package it.newvision.nvp.xcontents.services.model.content.search;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEContentSearchOrderBy") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEContentSearchOrderBy {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("creationDate_a") creationDate_a,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("creationDate_d") creationDate_d,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("lastUpdate_a") lastUpdate_a,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("lastUpdate_d") lastUpdate_d,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ranking_d") ranking_d
}