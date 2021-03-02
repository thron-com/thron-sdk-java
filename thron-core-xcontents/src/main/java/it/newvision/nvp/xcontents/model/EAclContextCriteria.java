package it.newvision.nvp.xcontents.model;

import javax.xml.bind.annotation.XmlEnumValue;

public enum EAclContextCriteria {
    /**
     * Only direct Acl rules (not inherited by categories)
     * Find all contents where the user is directly defined in ACL with SEE Rule
     */
    //#SWG#@ApiModelProperty(value = """Only direct Acl rules (not inherited by categories)
    //#SWGNL#Find all contents where the user is directly defined in ACL with SEE Rule""")
    @XmlEnumValue("DIRECT") DIRECT,
    /**
     * Means acl rule inherited by categories.
     * Find all content where the user is defined in some ACL defined in (linked)
     * Categories with SEE Rule
     */
    //#SWG#@ApiModelProperty(value = """Means acl rule inherited by categories.
    //#SWGNL#Find all content where the user is defined in some ACL defined in (linked) Categories with SEE Rule""")
    @XmlEnumValue("DERIVED") DERIVED,
    /**
     * Find all contents where the user is the only one directly defined in ACL with
     * SEE Rule
     */
    //#SWG#@ApiModelProperty(value = """Find all contents where the user is the only one directly defined in ACL with SEE Rule""")
    @XmlEnumValue("EXCLUSIVE") EXCLUSIVE,
    /**
     * Find all contents where the user see the content directly and where ACL defined in (linked) Categories
     * SEE Rule
     */
    //#SWG#@ApiModelProperty(value = """Find all contents where the user is the only one directly defined in ACL with SEE Rule""")
    @XmlEnumValue("ALL") ALL
}
