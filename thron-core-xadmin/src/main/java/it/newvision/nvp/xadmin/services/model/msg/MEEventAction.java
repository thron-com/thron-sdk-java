package it.newvision.nvp.xadmin.services.model.msg;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlType(name="MEEventAction") 
@XmlEnum
//#SWG#@ApiModel(description = """""")
public enum MEEventAction {
	/**
	 * Discard the recorded files during the event
	 */
	//#SWG#@ApiModelProperty(value = """Discard the recorded files during the event""")
	@XmlEnumValue("DISCARD_RECORDED_FILES") DISCARD_RECORDED_FILES,
	/**
	 * Automatically publish all recorded files during the event in 4me platform as
	 * VIDEO Content(s)
	 */
	//#SWG#@ApiModelProperty(value = """Automatically publish all recorded files during the event in 4me platform as VIDEO Content(s)""")
	@XmlEnumValue("PUBLISH_AS_NEW_CONTENT") PUBLISH_AS_NEW_CONTENT,
	/**
	 * Stop the event but do not publish the recorded files on 4me. The recorded files
	 * can be published later using the service JPublishInWeeboExpress.publishVideo or
	 * using the postEventAction PUBLISH_AS_NEW_CONTENT
	 */
	//#SWG#@ApiModelProperty(value = """Stop the event but do not publish the recorded files on 4me. The recorded files can be published later using the service JPublishInWeeboExpress.publishVideo or using the postEventAction PUBLISH_AS_NEW_CONTENT""")
	@XmlEnumValue("KEEP_RECORDED_FILES") KEEP_RECORDED_FILES
}