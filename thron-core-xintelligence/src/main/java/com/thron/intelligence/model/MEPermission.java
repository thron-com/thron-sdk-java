package com.thron.intelligence.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * List of available permissions.
 * 
 * Mapping schema of Permission and Platform role:
 * MEPermission -> CLASS-<ClassificationID>-<MEPermission>
 * 
 * Example for Classification TARGET:
 * 
 * <ul>
 * 	<li>TAG_MANAGER -> CLASS-TARGET_TAG_MANAGER </li>
 * 	<li>ADVISOR -> CLASS-TARGET-ADVISOR</li>
 * 	<li>VIEWER -> CLASS-TARGET-VIEWER</li>
 * 	<li>...  </li>
 * </ul>
 * 
 * Example for Classification TOPIC:
 * 
 * <ul>
 * 	<li>TAG_MANAGER -> CLASS-TOPIC_TAG_MANAGER </li>
 * 	<li>ADVISOR -> CLASS-TOPIC-ADVISOR</li>
 * </ul>
 * <ul>
 * 	<li>VIEWER -> CLASS-TOPIC-VIEWER</li>
 * </ul>
 * ...
 */
@XmlType(name="MEPermission") 
@XmlEnum
//#SWG#@ApiModel(description = """List of available permissions.
//#SWGNL#
//#SWGNL#Mapping schema of Permission and Platform role:
//#SWGNL#MEPermission -> CLASS-<ClassificationID>-<MEPermission>
//#SWGNL#
//#SWGNL#Example for Classification TARGET:
//#SWGNL#
//#SWGNL#<ul>
//#SWGNL#	<li>TAG_MANAGER -> CLASS-TARGET_TAG_MANAGER </li>
//#SWGNL#	<li>ADVISOR -> CLASS-TARGET-ADVISOR</li>
//#SWGNL#	<li>VIEWER -> CLASS-TARGET-VIEWER</li>
//#SWGNL#	<li>...  </li>
//#SWGNL#</ul>
//#SWGNL#
//#SWGNL#Example for Classification TOPIC:
//#SWGNL#
//#SWGNL#<ul>
//#SWGNL#	<li>TAG_MANAGER -> CLASS-TOPIC_TAG_MANAGER </li>
//#SWGNL#	<li>ADVISOR -> CLASS-TOPIC-ADVISOR</li>
//#SWGNL#</ul>
//#SWGNL#<ul>
//#SWGNL#	<li>VIEWER -> CLASS-TOPIC-VIEWER</li>
//#SWGNL#</ul>
//#SWGNL#...""")
public enum MEPermission {
	/**
	 * The user can admin (create, remove, update...) the tag definitions inside a
	 * classification
	 */
	//#SWG#@ApiModelProperty(value = """The user can admin (create, remove, update...) the tag definitions inside a classification""")
	@XmlEnumValue("MANAGER") MANAGER,
	/**
	 * The user can suggest new tag definition for a specific classification.
	 */
	//#SWG#@ApiModelProperty(value = """The user can suggest new tag definition for a specific classification.""")
	@XmlEnumValue("TAG_SUGGESTER") TAG_SUGGESTER,
	/**
	 * The user can add new tag (tag instance) to users, contents, categories, based
	 * on the right permissions
	 */
	//#SWG#@ApiModelProperty(value = """The user can add new tag (tag instance) to users, contents, categories, based on the right permissions""")
	@XmlEnumValue("TAGGER") TAGGER,
	/**
	 * The user can only see the classification, the tag and metadata defined. the
	 * user can not apply any change on the classification.
	 */
	//#SWG#@ApiModelProperty(value = """The user can only see the classification, the tag and metadata defined. the user can not apply any change on the classification.""")
	@XmlEnumValue("VIEWER") VIEWER
}