package it.newvision.nvp.xcontents.services.model.content.search;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEContentFieldOptions") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEContentFieldOptions {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("prettyIds") prettyIds,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("externalIds") externalIds,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("locales") locales,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("lastUpdate") lastUpdate,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("author") author,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("owner") owner,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("highlights") highlights,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("userSpecificValues") userSpecificValues,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("playlistDetails") playlistDetails,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("aclInfo") aclInfo,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("publishingStatus") publishingStatus,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("linkedCategoryIds") linkedCategoryIds,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("linkedContent") linkedContent,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("itags") itags,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("imetadata") imetadata,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("availableChannels") availableChannels,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("source") source
}