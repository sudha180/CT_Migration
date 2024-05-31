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
import org.openqa.selenium.remote.server.handler.GetElementText as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

//access token for the newly created customer
GlobalVariable.tempAat = "ZXlKaGJHY2lPaUpTVXpJMU5pSXNJblI1Y0NJNklrcFhWQ0lzSW10cFpDSTZJakJHVFc5QlVrNHhRa05aVWw4eVFXZ3daa1JUZUNKOS5leUpvZEhSd2N6b3ZMMnhwZG1WeWNHOXZiQzVqYjIwdWJYZ3ZjSEp1SWpvaU1qUXdOall4TkRJeU5DSXNJbWgwZEhCek9pOHZiR2wyWlhKd2IyOXNMbU52YlM1dGVDOXBjMU5wWjI1VmNDSTZabUZzYzJVc0ltbHpjeUk2SW1oMGRIQnpPaTh2Ykc5bmFXNHRjV0V5TG14cGRtVnljRzl2YkM1amIyMHViWGd2SWl3aWMzVmlJam9pWVhWMGFEQjhOalkxTkRnMU5ETTVOamt3TURka1pXSXlZamxoTldabUlpd2lZWFZrSWpwYkltaDBkSEJ6T2k4dllYVjBhREF1YkdsMlpYSndiMjlzTG1OdmJTNXRlQ0lzSW1oMGRIQnpPaTh2YkdsMlpYSndiMjlzTFhGaE1pNTFjeTVoZFhSb01DNWpiMjB2ZFhObGNtbHVabThpWFN3aWFXRjBJam94TnpFM01UTTJORFUxTENKbGVIQWlPakUzTVRjeU1qSTROVFVzSW5OamIzQmxJam9pYjNCbGJtbGtJSEJ5YjJacGJHVWdaVzFoYVd3aUxDSmhlbkFpT2lKV1FrazFhR3BGTTNKMVNqbDRkVU5IV1dGdE9GbzVUMDEzUmpCbE5XdDZiU0o5Lk5WaFFidkJMSDY4T2NGVUFUNU10Mkd6SFhWczVRaThjMnZsMVZYLU1YcXBDV2lBMWNqdXA4OGFSUUhKX0VnQTlIcmRUN0tobUFmaXUwQzVvMnMwQmNOaFBmWFZJSXQzY2NtUktCVEN2cmktWTRRSUh2cU5Ib2J4eExQaGZ2eHBKa2NmRjNXVEVteGs1U3RFUFlRdFhhY21wVDVwUzlJelY5NEs3d0xTbWFRdTNxV3RDczRuMnRsMl91TWMxRGRzZ0paX282LTFreWdONkM1SktwaG9nN2RhaFlLQURZZUhHaHlva0xTUEtUUDYzS2FoekJtMXJFa2NjMXdfR1FmVzNRSmg4Q2s4ZkZrUTFkMFZSOG44c0JiWUgtaGlPVkkzQUdmREloSXJqS0ExdHQ2dTVGVWtsakR1NUdKdWxQNkU4MDZETzVfbGEtT3BBbV9sYmtxd00wUQ=="

accessRes = WS.sendRequest(findTestObject('Postman/Postman/Auth'))

println(accessRes.getResponseBodyContent())
	
//changing the token to login user with cart
//GlobalVariable.tempAat = "ZXlKaGJHY2lPaUpTVXpJMU5pSXNJblI1Y0NJNklrcFhWQ0lzSW10cFpDSTZJakJHVFc5QlVrNHhRa05aVWw4eVFXZ3daa1JUZUNKOS5leUpvZEhSd2N6b3ZMMnhwZG1WeWNHOXZiQzVqYjIwdWJYZ3ZjSEp1SWpvaU1qSTROVGsxTXpjeE1pSXNJbWgwZEhCek9pOHZiR2wyWlhKd2IyOXNMbU52YlM1dGVDOXBjMU5wWjI1VmNDSTZabUZzYzJVc0ltbHpjeUk2SW1oMGRIQnpPaTh2Ykc5bmFXNHRjV0V5TG14cGRtVnljRzl2YkM1amIyMHViWGd2SWl3aWMzVmlJam9pWVhWMGFEQjhOalJoTW1JME9EZzFZVGMxTWpNeVptRXhaakU0Wm1ReElpd2lZWFZrSWpwYkltaDBkSEJ6T2k4dllYVjBhREF1YkdsMlpYSndiMjlzTG1OdmJTNXRlQ0lzSW1oMGRIQnpPaTh2YkdsMlpYSndiMjlzTFhGaE1pNTFjeTVoZFhSb01DNWpiMjB2ZFhObGNtbHVabThpWFN3aWFXRjBJam94TnpFMk1UZzFOVGsxTENKbGVIQWlPakUzTVRZeU56RTVPVFVzSW5OamIzQmxJam9pYjNCbGJtbGtJSEJ5YjJacGJHVWdaVzFoYVd3aUxDSmhlbkFpT2lKV1FrazFhR3BGTTNKMVNqbDRkVU5IV1dGdE9GbzVUMDEzUmpCbE5XdDZiU0o5LlhJZXJUV2p3N1ROT1hHNWY2TG1RcURQTFc1LVRKZ01BS2I3VUhxNmZNOVphdG0zVjJ4Rjd0cVB0Q1ROdlh4aldSSUhxRVRMY21QOXdCb1hKZ1l1QlRPZ3R0MXR3NkI1NU1QWlhuUEVyMkZqbl9McXMybkNkLTJWZU9CMlVNV0lHN09oc2lSQ0NtWVJMSzduSy1EMFBMY1dZVXl6MW5PZkY0Sm1XcWdBVWo5THUzbGVNR0RvRUtqRVJwNWtNbjJDNlNjcTh4T0pRN1RSR2R1c3J0MS1faVBOWlBJUWh2aTc1Q0pyR3RvZF9PMUQtYmloaWZFS3ZDXzZDRzZ0Vkl5MWx0N2VHa3hfLXlCMC13WlY4WWRwWFVrdWJMb0NGd0ZhWkpuckc0cFA4VFdvRUJ0a1dIWlJjclFleGZfNUJMX2NfVmg5RkxxZXczU05CeVI4NkZreVVyQQ=="

assert WS.getResponseStatusCode(accessRes) == 200

GlobalVariable.custId = WS.getElementText(accessRes, 'result.customerId')

GlobalVariable.cartId = WS.getElementText(accessRes, 'result.cartId')

GlobalVariable.custKey = WS.getElementText(accessRes, 'result.customerKey')

GlobalVariable.devId = WS.getElementText(accessRes, 'result.deviceId')

Boolean result = (((GlobalVariable.custId.length() != 0) && (GlobalVariable.cartId == 'null')) && (GlobalVariable.devId.length() != 
0)) && (GlobalVariable.custKey.length() != 0)

if (result) {
    KeywordUtil.markPassed('Validated successfully')

    //println('customerid  '+ GlobalVariable.custId)
    println('cartid  ' + GlobalVariable.cartId)

    //println('deviceid  '+ GlobalVariable.custKey)
    //println('customerkey  '+ GlobalVariable.devId)
    println(accessRes.getResponseBodyContent())
} else {
	 KeywordUtil.markFailed ('Failed to validate as the cart Id is not null , cart Id = ' +GlobalVariable.cartId)
  
}

