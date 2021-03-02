package it.newvision.nvp.xcontents.services.model.content.search
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MLemmaCriteria") 
@XmlType(name="MLemmaCriteria")
//#SWG#@ApiModel(description = """""")
class MLemmaCriteria extends Serializable {

	/**
	 * Text used to perform a free-text search. 
	 */
	//#SWG#@ApiModelProperty(value = """Text used to perform a free-text search. """ ,required = true)
	@BeanProperty 
	var text: String =_
	def withtext(p:String):this.type ={ 	this.text = p; 	this }

	/**
	 * Defines the type of match to perform with the single tokens in the text field:
	 * 
	 * <ul>
	 * 	<li>phrase_match searches for all the tokens in the correct order in a single
	 * field; </li>
	 * 	<li>all_word_match searches for all tokens in any order on any field; </li>
	 * 	<li>any_word_match searches for any token in any field. </li>
	 * </ul>
	 * The fuzzy variations have the same behavior, but allow one typo on a single
	 * token.
	 * Default value is any_word_match.
	 */
	//#SWG#@ApiModelProperty(value = """Defines the type of match to perform with the single tokens in the text field: 
	//#SWGNL#<ul>
	//#SWGNL#	<li>phrase_match searches for all the tokens in the correct order in a single field; </li>
	//#SWGNL#	<li>all_word_match searches for all tokens in any order on any field; </li>
	//#SWGNL#	<li>any_word_match searches for any token in any field. </li>
	//#SWGNL#</ul>
	//#SWGNL#The fuzzy variations have the same behavior, but allow one typo on a single token. 
	//#SWGNL#Default value is any_word_match.""" ,required = true)
	@BeanProperty 
	var textMatch: METextMatch =_
	def withtextMatch(p:METextMatch):this.type ={ 	this.textMatch = p; 	this }

	/**
	 * Optionally specify a locale to search on.
	 * Accepted locales are ["IT", "EN", "DE", "FR", "ES", "PT", "NL", "RU", "KO",
	 * "JA", "AR", "ZH"].
	 */
	//#SWG#@ApiModelProperty(value = """Optionally specify a locale to search on.
	//#SWGNL#Accepted locales are ["IT", "EN", "DE", "FR", "ES", "PT", "NL", "RU", "KO", "JA", "AR", "ZH"].""")
	@BeanProperty 
	var lang: String =_
	def withlang(p:String):this.type ={ 	this.lang = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		true
	}

}