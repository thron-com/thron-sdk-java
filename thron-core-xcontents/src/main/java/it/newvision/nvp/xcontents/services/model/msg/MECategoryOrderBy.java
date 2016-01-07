package it.newvision.nvp.xcontents.services.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Used in the findbyProperties services as orderBy criteria.
 * Available keys are:
 * categoryName,viewCounter,ratingCounter,commentsCounter,creationDate,lastUpdate,
 * lastUpdatedComment
 * _A suffix means -> ascendant order
 * _D suffix means -> descendant order
 */
@XmlType(name="MECategoryOrderBy") 
@XmlEnum
//#SWG#@ApiModel(description = """Used in the findbyProperties services as orderBy criteria.
//#SWGNL#Available keys are: 
//#SWGNL#categoryName,viewCounter,ratingCounter,commentsCounter,creationDate,lastUpdate,lastUpdatedComment
//#SWGNL#_A suffix means -> ascendant order
//#SWGNL#_D suffix means -> descendant order""")
public enum MECategoryOrderBy {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("categoryName_A") categoryName_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("categoryName_D") categoryName_D,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("categoryType_A") categoryType_A,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("categoryType_D") categoryType_D,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("creationDate_D") creationDate_D,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("creationDate_A") creationDate_A,
	/**
	 * used to sort the result set using the MCategory.sortingField (ascending)
	 */
	//#SWG#@ApiModelProperty(value = """used to sort the result set using the MCategory.sortingField (ascending)""")
	@XmlEnumValue("sortingField_A") sortingField_A,
	/**
	 * used to sort the result set using the MCategory.sortingField (descending)
	 */
	//#SWG#@ApiModelProperty(value = """used to sort the result set using the MCategory.sortingField (descending)""")
	@XmlEnumValue("sortingField_D") sortingField_D
}