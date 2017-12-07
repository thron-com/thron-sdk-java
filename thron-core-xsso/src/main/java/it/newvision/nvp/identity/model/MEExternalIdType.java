package it.newvision.nvp.identity.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEExternalIdType") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEExternalIdType {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("LDAP") LDAP,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("SAML") SAML
}