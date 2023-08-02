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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('LogintoCaseNote/SelectRecentOffender'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(1)

WebUI.scrollToElement(findTestObject('CreateNewCaseNoteVerification/Page_Syscon/Add button'), 1)

WebUI.click(findTestObject('CreateNewCaseNoteVerification/Page_Syscon/Add button'))

WebUI.click(findTestObject('Object Repository/CreateNewCaseNoteVerification/Page_Syscon/CaseNoteType'))

WebUI.doubleClick(findTestObject('Object Repository/CreateNewCaseNoteVerification/Page_Syscon/CaseNoteType'))

//WebUI.selectOptionByLabel(findTestObject('Object Repository/CreateNewCaseNoteVerification/Page_Syscon/LOV_Case Note Type'),'Case Note' , false)
WebUI.click(findTestObject('Object Repository/CreateNewCaseNoteVerification/Page_Syscon/LOV_Case Note Type'))

WebUI.enableSmartWait()

WebUI.doubleClick(findTestObject('Object Repository/CreateNewCaseNoteVerification/Page_Syscon/CaseNoteSubType'))

WebUI.click(findTestObject('Object Repository/createNewOffendertoCasenote/Page_Syscon/span_Sub Casenote 01'))

WebUI.setText(findTestObject('Object Repository/CreateNewCaseNoteVerification/Page_Syscon/casenote_text'), 'CaseNote added by automation')

WebUI.scrollToElement(findTestObject('Object Repository/CreateNewCaseNoteVerification/Page_Syscon/Save button'), 0)

WebUI.click(findTestObject('Object Repository/CreateNewCaseNoteVerification/Page_Syscon/Save button'))

WebUI.takeScreenshot('D:\\Katalon_files\\Katalon_testRun_Screenshot\\LatestRun\\CaseNoteCreated.png')

WebUI.scrollToElement(findTestObject('Object Repository/CreateNewCaseNoteVerification/Page_Syscon/Page_Syscon/AmendCaseNote_Button'), 
    0)

WebUI.click(findTestObject('Object Repository/CreateNewCaseNoteVerification/Page_Syscon/Page_Syscon/AmendCaseNote_Button'))

WebUI.setText(findTestObject('Object Repository/CreateNewCaseNoteVerification/Page_Syscon/Page_Syscon/AmendCaseNote_text'), 
    'CaseNote text amended by automation')

WebUI.click(findTestObject('Object Repository/CreateNewCaseNoteVerification/Page_Syscon/Page_Syscon/Checkbox_Attempt Contact'))

WebUI.click(findTestObject('Object Repository/CreateNewCaseNoteVerification/Page_Syscon/Page_Syscon/ANT Result checkbox'))

WebUI.click(findTestObject('Object Repository/CreateNewCaseNoteVerification/Page_Syscon/Page_Syscon/Case Review checkbox'))

WebUI.click(findTestObject('Object Repository/CreateNewCaseNoteVerification/Page_Syscon/Page_Syscon/SaveButton_Amend'))

WebUI.takeScreenshot('D:\\Katalon_files\\Katalon_testRun_Screenshot\\LatestRun\\CaseNoteAmended.png')

