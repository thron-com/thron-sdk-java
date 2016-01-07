package it.newvision.nvp.xadmin.services.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEFunctionalAuditResponse") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEFunctionalAuditResponse {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("OK") OK,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("WRITE_ERROR") WRITE_ERROR,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("ACCESS_DENIED") ACCESS_DENIED,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("EXCEPTION") EXCEPTION,
	/**
	 * the client has disabled the audit.
	 * To enable the Audit set xcontens.MClient.auditDurationDays greater than zero.
	 */
	//#SWG#@ApiModelProperty(value = """the client has disabled the audit.
	//#SWGNL#To enable the Audit set xcontens.MClient.auditDurationDays greater than zero.""")
	@XmlEnumValue("AUDIT_DISABLED") AUDIT_DISABLED
}