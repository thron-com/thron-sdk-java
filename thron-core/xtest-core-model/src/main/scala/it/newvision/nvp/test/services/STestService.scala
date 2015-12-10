package it.newvision.nvp.test.services
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import it.newvision.nvp.test.services.model.response.MResponseTestList
import it.newvision.nvp.test.services.model.response.MResponseTestP
import it.newvision.nvp.test.services.model.response.MTestClass
import it.newvision.nvp.test.services.model.msg.METestEnum
import it.newvision.nvp.test.services.model.response.MResponseTestF
import it.newvision.nvp.test.services.model.response.MResponseTestPcontent

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * This is a test webservice user to test the different type of request and
 * objects used in the platform.
 * 
 * With the fakeResponse parameter to false, the test service respond with the
 * same parameters provided in the call.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>WADL REST service (latest version): http://clientId-view.4me.
 * it/api/xtest/resources/application.wadl  </li>
 * </ul>
 */
trait STestService {

	/**
	 * return a list of items
	 * @param clientId : String
	 * @param numberOfResults : Integer
	 * Optional. default value is 50
	 * Define the number of items returned by the service.
	 * @return MResponseTestList
	*/
	def list(clientId: String, 
			numberOfResults: Integer):MResponseTestList 

	/**
	 * return a list of items
	 * @param clientId : String
	 * @return MResponseTestList
	*/
	def listGet(clientId: String):MResponseTestList 

	/**
	 * @param clientId : String
	 * @param fakeResponse : Boolean
	 * Optional.false, return the response filled with the parameters values
	 * @param pstring : String
	 * Optional.
	 * @param pdate : Date
	 * Optional.
	 * @param penum : METestEnum
	 * Optional.
	 * @param plong : Long
	 * Optional.
	 * @param pparams : MTestClass
	 * Optional.
	 * @param pint : Integer
	 * Optional.
	 * @param pbool : Boolean
	 * Optional.
	 * @param pdouble : Double
	 * Optional.
	 * @param pfloat : Float
	 * Optional.
	 * @return MResponseTestP
	*/
	def post(clientId: String, 
			fakeResponse: Boolean, 
			pstring: String, 
			pdate: Date, 
			penum: METestEnum, 
			plong: Long, 
			pparams: MTestClass, 
			pint: Integer, 
			pbool: Boolean, 
			pdouble: Double, 
			pfloat: Float):MResponseTestP 

	/**
	 * @param clientId : String
	 * @param fakeResponse : Boolean
	 * Optional.
	 * @param pstring : String
	 * Optional.
	 * @param penum : METestEnum
	 * Optional
	 * @param pdate : Date
	 * Optional.
	 * @param pint : Integer
	 * Optional.
	 * @param pbool : Boolean
	 * Optional.
	 * @param plong : Long
	 * Optional.
	 * @param pdouble : Double
	 * Optional.
	 * @param pfloat : Float
	 * Optional.
	 * @return MResponseTestF
	*/
	def get(clientId: String, 
			fakeResponse: Boolean, 
			pstring: String, 
			penum: METestEnum, 
			pdate: Date, 
			pint: Integer, 
			pbool: Boolean, 
			plong: Long, 
			pdouble: Double, 
			pfloat: Float):MResponseTestF 

	/**
	 * @param clientId : String
	 * @param fakeResponse : Boolean
	 * Optional.
	 * @param pstring : String
	 * Optional.
	 * @param penum : METestEnum
	 * Optional.
	 * @param pdate : Date
	 * Optional.
	 * @param pint : Integer
	 * Optional.
	 * @param plong : Long
	 * Optional.
	 * @param pbool : Boolean
	 * Optional.
	 * @param pdouble : Double
	 * Optional.
	 * @param pfloat : Float
	 * Optional.
	 * @return MResponseTestF
	*/
	def form(clientId: String, 
			fakeResponse: Boolean, 
			pstring: String, 
			penum: METestEnum, 
			pdate: Date, 
			pint: Integer, 
			plong: Long, 
			pbool: Boolean, 
			pdouble: Double, 
			pfloat: Float):MResponseTestF 

	/**
	 * test delete service
	 * @param clientId : String
	 * @param pstring : String
	 * Optional.
	 * @return MResponseTestP
	*/
	def remove(clientId: String, 
			pstring: String):MResponseTestP 

	/**
	 * test put service
	 * @param clientId : String
	 * @param fakeResponse : Boolean
	 * false, return the response filled with the parameters values
	 * @param pstring : String
	 * Optional.
	 * @param pdate : Date
	 * Optional.
	 * @param penum : METestEnum
	 * Optional.
	 * @param plong : Long
	 * Optional.
	 * @param pparams : MTestClass
	 * Optional.
	 * @param pint : Integer
	 * Optional.
	 * @param pbool : Boolean
	 * Optional.
	 * @param pdouble : Double
	 * Optional.
	 * @param pfloat : Float
	 * Optional.
	 * @return MResponseTestP
	*/
	def put(clientId: String, 
			fakeResponse: Boolean, 
			pstring: String, 
			pdate: Date, 
			penum: METestEnum, 
			plong: Long, 
			pparams: MTestClass, 
			pint: Integer, 
			pbool: Boolean, 
			pdouble: Double, 
			pfloat: Float):MResponseTestP 

	/**
	 * solo per vedere che non crea l'interfaccia webservice. return NOTHING
	 * @return MResponseTestP
	*/
	def noservice():MResponseTestP 

	/**
	 * @param clientId : String
	 * @param pContentId : String
	 * @return MResponseTestPcontent
	*/
	@Deprecated
	def testPcontent(clientId: String, 
			pContentId: String):MResponseTestPcontent 

	/**
	 * @param clientId : String
	 * @param pcontentId : String
	 * @return MResponseTestPcontent
	*/
	@Deprecated
	def testPcontent2(clientId: String, 
			pcontentId: String):MResponseTestPcontent 

}