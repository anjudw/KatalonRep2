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

//WebUI.callTestCase(findTestCase('LoginScreenTest/LoginWithValidUser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('LoginScreenTest/LoginUsingGlobalVariable'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.acceptAlert()

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/RecentOffenderAndCaseNoteNavigation/Page_Syscon/MenuIcon'))

WebUI.click(findTestObject('Object Repository/RecentOffenderAndCaseNoteNavigation/Page_Syscon/MenuModules'))

WebUI.click(findTestObject('Object Repository/RecentOffenderAndCaseNoteNavigation/Page_Syscon/Menu Inmate Case Management'))

WebUI.click(findTestObject('Object Repository/CreateNewOffenderOR/SystemSearchMenu'))

WebUI.click(findTestObject('Object Repository/CreateNewOffenderOR/NameMenu' //navigated to global name search screen OSIOSEAR
        ))

WebUI.click(findTestObject('Object Repository/CreateNewOffenderOR/LastNameField'))

WebUI.setText(findTestObject('Object Repository/CreateNewOffenderOR/LastNameField'), lastname)

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Object Repository/CreateNewOffenderOR/SexField'))

//WebUI.click(findTestObject('Object Repository/CreateNewOffenderOR/SexField_LOV'))
WebUI.setText(findTestObject('Object Repository/CreateNewOffenderOR/SexField'), sex)

//Enter DOB
WebUI.setText(findTestObject('Object Repository/CreateNewOffenderOR/DOB_Field'), dateofbirth)

//Set DOB by calender
//WebUI.click(  findTestObject('Object Repository/CreateNewOffenderOR/DOB_dateIcon'))
//WebUI.click(findTestObject('Object Repository/CreateNewOffenderOR/Calender_previous_arrow'))
//WebUI.click( findTestObject('Object Repository/CreateNewOffenderOR/Calendar_year'))
//WebUI.click( findTestObject('Object Repository/CreateNewOffenderOR/Calendar_Month'))
//WebUI.click( findTestObject('Object Repository/CreateNewOffenderOR/Calendar_Date'))
WebUI.click(findTestObject('Object Repository/CreateNewOffenderOR/Retrieve_Button'))

//click on create new offender button
WebUI.click(findTestObject('Object Repository/CreateNewOffenderOR/CreateNewOffender_button'))

CreateNewOffender = WebUI.verifyElementPresent(findTestObject('Object Repository/CreateNewOffenderOR/CreateNewOffenderScreen'), 
    2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CreateNewOffenderOR/FirstNameField'))

WebUI.setText(findTestObject('Object Repository/CreateNewOffenderOR/FirstNameField'), firstname)

WebUI.click(findTestObject('Object Repository/CreateNewOffenderOR/Save_button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ToastMessage/SuccessMessage'), 2, FailureHandling.STOP_ON_FAILURE)

/////////
//Admit new Offender
WebUI.navigateToUrl(GlobalVariable.AdmissionURL)

WebUI.click(findTestObject('Object Repository/CreateNewOffenderOR/AdmissionDate'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/CreateNewOffenderOR/AdmissionSaveButton'), 0)

WebUI.click(findTestObject('Object Repository/CreateNewOffenderOR/AdmissionSaveButton'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ToastMessage/SuccessMessage'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('D:\\Katalon_files\\Katalon_testRun_Screenshot\\LatestRun\\AdmissionSuccess.png')

