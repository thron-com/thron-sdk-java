package it.newvision.nvp.xcontents.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="EContentState")
@XmlEnum
/**
 * #13505: replaces `removed` flag and linkedCategory `_TRASH_`
 */
public enum EContentState {
	@XmlEnumValue("OK") OK,
	@XmlEnumValue("TRASHED") TRASHED,
	@XmlEnumValue("REMOVED") REMOVED
}