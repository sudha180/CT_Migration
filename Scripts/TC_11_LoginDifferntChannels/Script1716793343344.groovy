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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// to verify the response for header channel have following data(web, wap , app, mobile)
GlobalVariable.tempchannel = channelData

GlobalVariable.tempbrand = 'LP'

GlobalVariable.tempCid = 'gp-9eeca621-8593-44d9-bb7a-f3f33548e2d8'

GlobalVariable.tempdeviceId = '05-1518513983'

GlobalVariable.AAT = 'ZXlKaGJHY2lPaUpTVXpJMU5pSXNJblI1Y0NJNklrcFhWQ0lzSW10cFpDSTZJakJHVFc5QlVrNHhRa05aVWw4eVFXZ3daa1JUZUNKOS5leUpvZEhSd2N6b3ZMMnhwZG1WeWNHOXZiQzVqYjIwdWJYZ3ZjSEp1SWpvaU1qUXdNemMzTVRrNE1DSXNJbWgwZEhCek9pOHZiR2wyWlhKd2IyOXNMbU52YlM1dGVDOXBjMU5wWjI1VmNDSTZabUZzYzJVc0ltbHpjeUk2SW1oMGRIQnpPaTh2Ykc5bmFXNHRjV0V5TG14cGRtVnljRzl2YkM1amIyMHViWGd2SWl3aWMzVmlJam9pWVhWMGFEQjhOalkwTnpJNU5UbGtaVEE1WldObE56SmlaVEV5WVdSbElpd2lZWFZrSWpwYkltaDBkSEJ6T2k4dllYVjBhREF1YkdsMlpYSndiMjlzTG1OdmJTNXRlQ0lzSW1oMGRIQnpPaTh2YkdsMlpYSndiMjlzTFhGaE1pNTFjeTVoZFhSb01DNWpiMjB2ZFhObGNtbHVabThpWFN3aWFXRjBJam94TnpFMk5UUTBOelV3TENKbGVIQWlPakUzTVRZMk16RXhOVEFzSW5OamIzQmxJam9pYjNCbGJtbGtJSEJ5YjJacGJHVWdaVzFoYVd3aUxDSmhlbkFpT2lKV1FrazFhR3BGTTNKMVNqbDRkVU5IV1dGdE9GbzVUMDEzUmpCbE5XdDZiU0o5LnBrZkg3WGM0Qlh5LWZnZnR5SXZfWGVqWUxENUVvTmpKczYwUUM5bGt3aWxsNlRGMWh1QWZrcHpHZmo1cEFKLUZkTnpwckQzSXU2VkIxZUJOWHQ5bHJSN3FrMXlWNENINWwwLVppMFE3SmwzUXhNV1FGck85S203YlBKYVIzd09VS01Qem9RcHhSUFM0bXZqYzJwMEtVRW4yUEU3am00MGR6dGdqTmxGbGQ3RFJET1BxWGw4MmpPTUxnUDIzRlU2UW52VDFZX1hFS2pkSWowOXRMVHJJN1JFMVlwQmVmbnpQS0FBZkx3bUlCVmg1Z0ZDbElpbU9xX01GVVlHMEhxQWZzVDJQdFVZTVpsWmtQWEw2eWg0SHJ5N0ZJTXNGcnJFYW1tZDU1WTVoSExTS2YxZzZycmFpamVIa2VGQmNuVzdpSDFMNEVYZC03emIxRFBTNjJmWkx6UQ=='

authResponse = WS.sendRequest(findTestObject('Postman/Postman/AuthService-Valid Header', [('AAT') : GlobalVariable.AAT, ('host') : GlobalVariable.host]))

    println(authResponse.getResponseBodyContent())

assert WS.getResponseStatusCode(authResponse) == 200

String customerId = WS.getElementText(authResponse, 'result.customerId')

String cartId = WS.getElementText(authResponse, 'result.cartId')

String customerKey = WS.getElementText(authResponse, 'result.customerKey')

String deviceId = WS.getElementText(authResponse, 'result.deviceId')

println('when channel is ' + GlobalVariable.channel)

Boolean result = (((customerId.length() != 0) && (cartId.length() != 0)) && (customerKey.length() != 0)) && (deviceId.length() != 
0)

if (result) {
    KeywordUtil.markPassed('Authorized')

    println(authResponse.getResponseBodyContent())
} else {
    KeywordUtil.markFailed('Unauthorized')
}

