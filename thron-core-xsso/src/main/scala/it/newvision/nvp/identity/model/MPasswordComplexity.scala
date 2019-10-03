package it.newvision.nvp.identity.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MPasswordComplexity") 
@XmlType(name="MPasswordComplexity")
//#SWG#@ApiModel(description = """""")
class MPasswordComplexity extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var allowUsername: Boolean  = false
	def withallowUsername(p:Boolean):this.type ={ 	this.allowUsername = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var passwordLength: Integer  = 8
	def withpasswordLength(p:Integer):this.type ={ 	this.passwordLength = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var requireLowercaseLetters: Boolean  = true
	def withrequireLowercaseLetters(p:Boolean):this.type ={ 	this.requireLowercaseLetters = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var requireNumbers: Boolean  = true
	def withrequireNumbers(p:Boolean):this.type ={ 	this.requireNumbers = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var requireSymbols: Boolean  = false
	def withrequireSymbols(p:Boolean):this.type ={ 	this.requireSymbols = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var requireUppercaseLetters: Boolean  = true
	def withrequireUppercaseLetters(p:Boolean):this.type ={ 	this.requireUppercaseLetters = p; 	this }

}