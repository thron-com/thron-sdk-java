package it.newvision.nvp.core.libraries.rs

import java.text.{ParseException, SimpleDateFormat}
import org.apache.commons.lang.StringUtils
import java.util.Date

object DateType{
  val dateFormat: SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX")  //iso8601
  /**
   *  2001-07-04T12:08:56.235-07:00
   *  2001-07-04T12:08:56.235+03:00
   *  2001-07-04T12:08:56.235Z
   */

  def getDate(d:DateType):Date={
    Option(d) match{
      case Some(x)=> x.toDate()
      case None=> null
    }
  }
}

class DateType {

  private var date: java.util.Date = null
  private val z = "Z"
  private val sss = ".000"+z
  private val ss = ":00" + sss
  private val mm = ":00" + ss
  private val hh = "T00" + mm
  private val dd = "-01" + hh
  private val mmm = "-01" + dd

  def this(d: Date) = {
    this()
    this.date = d
  }

  def this(dateStr: String) = {
    this()
    parse(dateStr,false)
  }

  private def parse(dateStr:String,oldMode:Boolean=false){
    if (StringUtils.isNotEmpty(dateStr)) {
      try {
        this.date = {
          var _dateStr = dateStr
          if (dateStr.length == 4) _dateStr += mmm
          if (dateStr.length == 7) _dateStr += dd
          if (dateStr.length == 10) _dateStr += hh
          if (dateStr.length == 13) _dateStr += mm
          if (dateStr.length == 16) _dateStr += ss
          if (dateStr.length == 19) _dateStr += sss
          if (dateStr.length == 23) _dateStr += z
          if(oldMode){
            new Date(dateStr) //per retrocompatibilità
          }else{
            DateType.dateFormat.parse(_dateStr)
          }
        }
      } catch {
        case e: ParseException =>
          //per retrocompatibilità
          if(!oldMode) parse(dateStr,true)
      }
    }
  }

  def toDate(): Date = this.date

  override def toString() = {
    Option(this.date) match{
      case Some(d)=>DateType.dateFormat.format(d)
      case None=> ""
    }
  }
}
