package it.newvision.nvp.xcontents.services.model.content.search;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="METextMatch") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum METextMatch {
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("phrase_match") phrase_match,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("all_word_match") all_word_match,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("any_word_match") any_word_match,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("all_word_fuzzy_match") all_word_fuzzy_match,
	//#SWG#@ApiModelProperty(value = """""")
	@XmlEnumValue("any_word_fuzzy_match") any_word_fuzzy_match
}