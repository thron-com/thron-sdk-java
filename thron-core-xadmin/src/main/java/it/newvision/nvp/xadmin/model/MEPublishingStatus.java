package it.newvision.nvp.xadmin.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Define the current status of a publishing process.
 */
@XmlType(name="MEPublishingStatus") 
@XmlEnum
//#SWG#@ApiModel(description = """Define the current status of a publishing process.""")
public enum MEPublishingStatus {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("UPLOADED") UPLOADED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("INGESTION_INPROGRESS") INGESTION_INPROGRESS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("INGESTED") INGESTED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PACKAGED") PACKAGED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PACKAGING_INPROGRESS") PACKAGING_INPROGRESS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PACKAGED_ERROR") PACKAGED_ERROR,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PACKAGED_THUMBNAIL") PACKAGED_THUMBNAIL,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PACKAGED_THUMBNAIL_ERROR") PACKAGED_THUMBNAIL_ERROR,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PUBLISHING_INPROGRESS") PUBLISHING_INPROGRESS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PUBLISHED") PUBLISHED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PUBLISHED_THUMBNAIL") PUBLISHED_THUMBNAIL,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PUBLISHED_ERROR") PUBLISHED_ERROR,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PACKAGED_THUMBNAIL_INPROGRESS") PACKAGED_THUMBNAIL_INPROGRESS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("REMOVED") REMOVED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PUBLISHED_INACTIVE") PUBLISHED_INACTIVE,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("UNPUBLISHING_INPROGRESS") UNPUBLISHING_INPROGRESS
}