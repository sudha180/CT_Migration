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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//To verify the response of the system when all mandatory fields  are empty in the header.
GlobalVariable.tempCid = ''

GlobalVariable.tempbrand = ''

GlobalVariable.tempchannel = ''

GlobalVariable.tempdeviceId = ''

GlobalVariable.AAT = ''

authResponse = WS.sendRequest(findTestObject('Postman/Postman/AuthService-Valid Header', [('AAT') : GlobalVariable.AAT, ('host') : GlobalVariable.host]))

//String message = 'Unauthorized Request - Could not validate request.'
//
//String msg = WS.getElementText(guestResponse, 'message')
//if (WS.getResponseStatusCode(authResponse) == 400 && message.equalsIgnoreCase(msg)) {
//	KeywordUtil.markPassed("Validation is happening")
//} else {
//	KeywordUtil.markFailed("Failed to validate")
//	println("The invalid response is ")
//	CustomKeywords.'liverpool.Custom.printResponseinText'(authResponse)
//}
if (WS.getResponseStatusCode(authResponse) == 400) {
    KeywordUtil.markPassed('Validation is happening')
} else {
    KeywordUtil.markFailed('Failed to validate')

    println('The invalid response is ')

    println(authResponse.getResponseBodyContent())
}

