package it.newvision.nvp.xpublisher.services.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEPublisher") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEPublisher {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OK") OK,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("NOT_PUBLISHED") NOT_PUBLISHED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ACCESS_DENIED") ACCESS_DENIED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("EXCEPTION") EXCEPTION,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("SOURCE_FILE_NOT_EXISTS") SOURCE_FILE_NOT_EXISTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("WRONG_DESTINATION_FOLDER") WRONG_DESTINATION_FOLDER,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CONTENT_NOT_EXISTS") CONTENT_NOT_EXISTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("THUMBNAIL_NOT_EXISTS") THUMBNAIL_NOT_EXISTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CHANNEL_NOT_EXISTS") CHANNEL_NOT_EXISTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CLIENT_NOT_EXISTS") CLIENT_NOT_EXISTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CONTENT_ALREADY_EXISTS") CONTENT_ALREADY_EXISTS,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CONTENT_NOT_AVAILABLE") CONTENT_NOT_AVAILABLE,
	/**
	 * the resource is expired
	 */
	//#SWG#@ApiModelProperty(value = """the resource is expired""")
	@XmlEnumValue("EXPIRED") EXPIRED
}