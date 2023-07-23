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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.LoginUrl)

WebUI.click(findTestObject('Object Repository/Login/Page_Syscon/div_Elite 5.0PM_app-loading'))

//LoginwithInvalid Credentials
WebUI.setText(findTestObject('Object Repository/Login/Page_Syscon/input_User Name is required_lngtxtfld'), GlobalVariable.InvalidUsername)

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Syscon/input_Password_lngpwdfld'), 'vOA0cDqQbrFbbUuaXmRXSw==')

WebUI.click(findTestObject('Object Repository/Login/Page_Syscon/span_Sign In'))

LoginError = WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Syscon/LoginError_wrongPWD'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('D:\\Katalon_testRun_Screenshot\\LatestRun\\LoginError.png')

//LoginWithValid Credentials
WebUI.setText(findTestObject('Object Repository/Login/Page_Syscon/input_User Name is required_lngtxtfld'), GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Syscon/input_Password_lngpwdfld'), 'iEvABqM0Kgo=')

WebUI.click(findTestObject('Object Repository/Login/Page_Syscon/span_Sign In'))

WebUI.delay(2)

WebUI.takeScreenshot('D:\\Katalon_testRun_Screenshot\\LatestRun\\LoginSuccessfully.png')

WebUI.comment('User login successgully')

landingPage = WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Syscon/mat-icon_logout'), 3, FailureHandling.STOP_ON_FAILURE)

