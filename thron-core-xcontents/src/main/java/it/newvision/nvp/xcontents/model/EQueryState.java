package it.newvision.nvp.xcontents.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="EQueryState")
@XmlEnum
/**
 *
 */
public enum EQueryState {
    @XmlEnumValue("ITAG_LIMIT_REACHED") ITAG_LIMIT_REACHED
}
