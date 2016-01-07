package com.thron.intelligence.model.engine
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MContentConf") 
@XmlType(name="MContentConf")
//#SWG#@ApiModel(description = """""")
class MContentConf extends Serializable {

	/**
	 * at most 100 categories
	 */
	//#SWG#@ApiModelProperty(value = """at most 100 categories""")
	@BeanProperty 
	var onlyForCategoryIds: List[String] = new ArrayList[String]
	def withonlyForCategoryIds(p:List[String]):MContentConf ={ 	this.onlyForCategoryIds = p; 	this }

	/**
	 * possible values are VIDE/AUDIO/IMAGE/PLAYLIST/OTHER...
	 */
	//#SWG#@ApiModelProperty(value = """possible values are VIDE/AUDIO/IMAGE/PLAYLIST/OTHER...""")
	@BeanProperty 
	var onlyForContentType: String =_
	def withonlyForContentType(p:String):MContentConf ={ 	this.onlyForContentType = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(onlyForContentType).forall(t=>t=="VIDEO" || t=="AUDIO" || t=="IMAGE" || t=="PLAYLIST" || t=="OTHER") &&
			Option(onlyForCategoryIds).forall(_.size()<=100)
	}

}