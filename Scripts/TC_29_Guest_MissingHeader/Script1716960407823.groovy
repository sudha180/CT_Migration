import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import groovy.json.JsonOutput as JsonOutput

GlobalVariable.tempbrand = BrandVar

println(GlobalVariable.tempbrand)

GlobalVariable.tempchannel = channelVar

println(GlobalVariable.tempchannel)

GlobalVariable.tempdeviceId = DeviceIDVar

println(GlobalVariable.tempdeviceId)

//GlobalVariable.tempAat=AATVar
//println(GlobalVariable.tempAat)
GlobalVariable.tempCid = correlationidVar

println(GlobalVariable.tempCid)

GlobalVariable.anony_cartid = anonymousCartIdVar

println(GlobalVariable.anony_cartid)

GuestResponse = WS.sendRequest(findTestObject('Postman/Postman/GuestSessionAuthorize'))

def responseText = GuestResponse.getResponseText()

//Double DecimalValue = WS.getElementPropertyValue(Response, JsonPath.toString())
//println(DecimalValue)
println(JsonOutput.println(responseText))

WS.verifyResponseStatusCode(GuestResponse, 400, FailureHandling.STOP_ON_FAILURE)

WS.verifyElementPropertyValue(GuestResponse, 'message', 'Missing mandatory headers: [deviceId]', FailureHandling.STOP_ON_FAILURE)

Error_Message = WS.getElementPropertyValue(GuestResponse, 'message')

if ((WS.getResponseStatusCode(GuestResponse) == 400) && Error_Message.equalsIgnoreCase('Unauthorized Request - Could not validate request.')) {
    println(' Testcase got passed for the missing deviceid for guest user')
} else {
    println(' Testcase failed for the missing device id for a guest user')
}

