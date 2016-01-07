package com.thron.intelligence.services.model.metadata
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.metadata.MMetadataDefinition

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * MetadataDefinition allows to assign a value of a certain type to a key; are
 * defined for entities like contents, users, apps etc.
 * MetadataDefinition can be linked to one or more ITagDefinition (in the same
 * Classification) and inherit the visibility constraints.
 * for example the itagdefinition product is linked to the metadatadefinition with
 * key productkey on the TARGET classification. This means that the metadata
 * productKey is visible only for contents tagged with the tag "product".
 * 
 * <b>Constraints:</b>
 * <ul>
 * 	<li>may belongs to a single classification or be generic. </li>
 * 	<li>can not be moved from a classification to generic </li>
 * 	<li>the IMetadataDefinition.key is a primarykey. It's not possible to define a
 * metadatadefinition using the key of a metadata removed or used in different
 * classifications. </li>
 * 	<li>A IMetadatadefinition of type KEY can be linked to a single
 * ITagDefinition</li>
 * 	<li>A IMetadatadefinition can be linked to categorized ITagDefinition </li>
 * </ul>
 */
@XmlRootElement(name="MMetadataDefinitionDetail") 
@XmlType(name="MMetadataDefinitionDetail")
//#SWG#@ApiModel(description = """MetadataDefinition allows to assign a value of a certain type to a key; are defined for entities like contents, users, apps etc.
//#SWGNL#MetadataDefinition can be linked to one or more ITagDefinition (in the same Classification) and inherit the visibility constraints.
//#SWGNL#for example the itagdefinition product is linked to the metadatadefinition with key productkey on the TARGET classification. This means that the metadata productKey is visible only for contents tagged with the tag "product".
//#SWGNL#
//#SWGNL#<b>Constraints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>may belongs to a single classification or be generic. </li>
//#SWGNL#	<li>can not be moved from a classification to generic </li>
//#SWGNL#	<li>the IMetadataDefinition.key is a primarykey. It's not possible to define a metadatadefinition using the key of a metadata removed or used in different classifications. </li>
//#SWGNL#	<li>A IMetadatadefinition of type KEY can be linked to a single ITagDefinition</li>
//#SWGNL#	<li>A IMetadatadefinition can be linked to categorized ITagDefinition </li>
//#SWGNL#</ul>""")
class MMetadataDefinitionDetail extends MMetadataDefinition with Serializable  {

}