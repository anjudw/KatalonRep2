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

WebUI.navigateToUrl(GlobalVariable.ReleasePlanScreenURL)

//WebUI.click( findTestObject('Object Repository/CasePlan_create/Release Plan/Release Plan Menu') )
WebUI.scrollToElement(findTestObject('Object Repository/CasePlan_create/Release Plan/ReleasePlan_ScreenName'), 0)

//Add release plan record and save>>>>>>
WebUI.click(findTestObject('Object Repository/CasePlan_create/Release Plan/ReleasePlan_AddButton'))

WebUI.doubleClick(findTestObject('Object Repository/CasePlan_create/Release Plan/CaseManagerfield'))

WebUI.click(findTestObject('Object Repository/CasePlan_create/Release Plan/CaseManager_LOV'))

WebUI.doubleClick(findTestObject('Object Repository/CasePlan_create/Release Plan/Parole Agent'))

WebUI.click(findTestObject('Object Repository/CasePlan_create/Release Plan/Parole Agent_LOV'))

WebUI.doubleClick(findTestObject('Object Repository/CasePlan_create/Release Plan/Plan Status Field'))

WebUI.click(findTestObject('Object Repository/CasePlan_create/Release Plan/PlanStatus_LOV'))

WebUI.click(findTestObject('Object Repository/CasePlan_create/Release Plan/ReleasePlan_Grid_SaveButton'))
//takescreenshot
WebUI.takeScreenshot('D:\\Katalon_testRun_Screenshot\\LatestRun\\ReleasePlanCreated.png')

SavedSuccessfully = WebUI.verifyElementPresent( findTestObject('Object Repository/CasePlan_create/Conditions Tab/SuccessMessage')  , 2, FailureHandling.STOP_ON_FAILURE)

//scroll to plan details tab>>>>>>>>>
WebUI.scrollToElement( findTestObject('Object Repository/CasePlan_create/Release Plan/PlanDetails_tab') , 0)

//scroll to conditions button and click>>>>>>>>
WebUI.scrollToElement( findTestObject('Object Repository/CasePlan_create/Release Plan/Conditions_button') , 0)

WebUI.click(findTestObject('Object Repository/CasePlan_create/Release Plan/Conditions_button') )

ConditionsPopUpWindow = WebUI.verifyElementPresent( findTestObject('Object Repository/CasePlan_create/Release Plan/ConditionsPopup window')  , 3, FailureHandling.STOP_ON_FAILURE)
WebUI.comment('User navigated to Conditions popup window successfully')

//add condition from conditions popup>>>>>>>>>
WebUI.click( findTestObject('Object Repository/CasePlan_create/Release Plan/Conditions_type_Add button'))
WebUI.doubleClick( findTestObject('Object Repository/CasePlan_create/Release Plan/Condition_CategoryField') )
WebUI.click( findTestObject('Object Repository/CasePlan_create/Release Plan/Conditions_Category_LOV') )

WebUI.click( findTestObject('Object Repository/CasePlan_create/Release Plan/Conditions_conditions_Add button')  )
WebUI.doubleClick( findTestObject('Object Repository/CasePlan_create/Release Plan/Conditions_ConditionsField'))
WebUI.click( findTestObject('Object Repository/CasePlan_create/Release Plan/Conditions_conditionsField_LOV'))

//WebUI.doubleClick(  findTestObject('Object Repository/CasePlan_create/Release Plan/Conditions_LengthField') )
//WebUI.setText(findTestObject('Object Repository/CasePlan_create/Release Plan/Conditions_LengthField_Editmode') , '5')

//WebUI.doubleClick( findTestObject('Object Repository/CasePlan_create/Release Plan/Conditions_UnitField'))
//WebUI.click(  findTestObject('Object Repository/CasePlan_create/Release Plan/Condition_UnitField_LOV'))

WebUI.click(findTestObject('Object Repository/CasePlan_create/Release Plan/Conditions_SaveButton'))

WebUI.click( findTestObject('Object Repository/CasePlan_create/Release Plan/Conditions_BackButton'))

WebUI.takeScreenshot('D:\\Katalon_testRun_Screenshot\\LatestRun\\ReleasePlanConditionSaved.png')




