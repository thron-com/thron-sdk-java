package it.newvision.nvp.xcontents.dal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ECopyCategoryState")
@XmlEnum

public enum ECopyCategoryState {
    @XmlEnumValue("QUEUED") QUEUED,
    @XmlEnumValue("RUNNING") RUNNING,
    @XmlEnumValue("COMPLETE") COMPLETE,
    @XmlEnumValue("ERROR") ERROR
}
