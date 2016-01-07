package it.newvision.nvp.xpackager.services.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEPackager") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEPackager {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OK") OK,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("WRITE_ERROR") WRITE_ERROR,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("EXCEPTION") EXCEPTION,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("FILE_NOT_FOUND") FILE_NOT_FOUND,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("WRONG_DESCRIPTOR") WRONG_DESCRIPTOR,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("XML_EXCEPTION") XML_EXCEPTION,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("SCHEMA_EXCEPTION") SCHEMA_EXCEPTION,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("CLIENT_NOT_FOUND") CLIENT_NOT_FOUND,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("PACKAGEDID_NOT_FOUND") PACKAGEDID_NOT_FOUND,
	/**
	 * The operation can not be invoked over the specified package descriptor.
	 */
	//#SWG#@ApiModelProperty(value = """The operation can not be invoked over the specified package descriptor.""")
	@XmlEnumValue("ADD_INGESTION_ERROR") ADD_INGESTION_ERROR
}