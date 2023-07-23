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

WebUI.navigateToUrl('https://dev.elitev5.com/#/login')

WebUI.setText(findTestObject('Object Repository/sampleRelease/Page_Syscon/input_User Name_lngtxtfld'), 'ANJU')

WebUI.setEncryptedText(findTestObject('Object Repository/sampleRelease/Page_Syscon/input_Password_lngpwdfld'), 'iEvABqM0Kgo=')

WebUI.sendKeys(findTestObject('Object Repository/sampleRelease/Page_Syscon/input_Password_lngpwdfld'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/sampleRelease/Page_Syscon/mat-icon_menu'))

WebUI.click(findTestObject('Object Repository/sampleRelease/Page_Syscon/i_keyboard_arrow_down'))

WebUI.click(findTestObject('Object Repository/sampleRelease/Page_Syscon/span_Inmate Case Management'))

WebUI.click(findTestObject('Object Repository/sampleRelease/Page_Syscon/span_Case Management'))

WebUI.click(findTestObject('Object Repository/sampleRelease/Page_Syscon/div_Manage Assets_ps__thumb-y'))

WebUI.click(findTestObject('Object Repository/sampleRelease/Page_Syscon/span_Release Plan'))

WebUI.closeBrowser()

