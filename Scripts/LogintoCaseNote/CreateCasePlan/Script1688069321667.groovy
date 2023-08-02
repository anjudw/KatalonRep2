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

WebUI.callTestCase(findTestCase('LogintoCaseNote/CreateNewCaseNote'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CasePlan_create/Page_Syscon/Menu_Case Plan'))

WebUI.waitForPageLoad(2)

WebUI.scrollToElement(findTestObject('Object Repository/CasePlan_create/Page_Syscon/Case Plan_ScreenName'), 1)

WebUI.click(findTestObject('Object Repository/CasePlan_create/Page_Syscon/Add_button_CasePlan'))

WebUI.click(findTestObject('Object Repository/CasePlan_create/Page_Syscon/CustodialOfficer_LaunchButton'))

//User navigated to 'Assigned Case Plan Staff' popup window
//WebUI.switchToWindowTitle('Assigned Case Plan Staff')
WebUI.click(findTestObject('Object Repository/CasePlan_create/Page_Syscon/Page_Syscon/button_Add Assigned Case plan staff'))

WebUI.click(findTestObject('Object Repository/CasePlan_create/Page_Syscon/StaffName_AssignedCasePlanStaff'))

WebUI.click(findTestObject('Object Repository/CasePlan_create/Page_Syscon/Staff Name LOV'))

WebUI.doubleClick(findTestObject('Object Repository/CasePlan_create/Page_Syscon/CasePlanRole_dropdown'))

//WebUI.setText( findTestObject('Object Repository/CasePlan_create/Page_Syscon/CasePlanRole_dropdown'), 'Primary Case Officer')
WebUI.click(findTestObject('Object Repository/CasePlan_create/Page_Syscon/CasePlanRole_LOV'))

WebUI.click(findTestObject('Object Repository/CasePlan_create/Page_Syscon/Primary Case Officer_checkbox'))

WebUI.click(findTestObject('Object Repository/CasePlan_create/Page_Syscon/Assign_button'))

WebUI.click(findTestObject('Object Repository/CasePlan_create/Page_Syscon/Save_button_Caseplan'))

Saved = WebUI.verifyElementPresent(findTestObject('Object Repository/CasePlan_create/Conditions Tab/SuccessMessage'), 2, 
    FailureHandling.STOP_ON_FAILURE)

//Scroll to Tab header')
WebUI.scrollToElement(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/TabHeader_CasePlan'), 1)

WebUI.click(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/CriminogenicNeed_tabHeader'))

WebUI.click(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/Criminogenic_Add_button'))

//WebUI.click( findTestObject('Object Repository/CasePlan_create/CriminogenicTab/AssessedNeed_field'))
//WebUI.selectOptionByIndex(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/AssessedNeed_dropdown_listBox'), 2)
WebUI.click(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/AssessedRisk_LOV'))

WebUI.doubleClick(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/ObjectiveField'))

WebUI.setText(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/ObjectiveField_input'), 'Automation Test')

//WebUI.doubleClick( findTestObject('Object Repository/CasePlan_create/CriminogenicTab/TargetDate') )
//WebUI.click(  findTestObject('Object Repository/CasePlan_create/CriminogenicTab/TargetDate_datepicker'))
WebUI.doubleClick(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/Status field'))

WebUI.click(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/Save button_criminogenicGrid'))

WarningForMandatoryField = WebUI.verifyElementPresent(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/WarningToast'), 
    2, FailureHandling.STOP_ON_FAILURE)

//Record will not save without 'status'
//To remove the focus from status field, click Objective Field
WebUI.click(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/ObjectiveField'))

//Re-select status field and select a value
WebUI.doubleClick(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/Status field'))

WebUI.click(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/StatusField_LOV'))

WebUI.click(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/Save button_criminogenicGrid'))

Saved = WebUI.verifyElementPresent(findTestObject('Object Repository/CasePlan_create/Conditions Tab/SuccessMessage'), 2, 
    FailureHandling.STOP_ON_FAILURE)

println('Criminogenic details saved successfully')

WebUI.takeScreenshot('D:\\Katalon_files\\Katalon_testRun_Screenshot\\LatestRun\\criminogenicScreenshot.png')

//Scroll to 'Plan of action' grid
WebUI.scrollToElement(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/PlanOfAction_criminogenic'), 1)

//Add new plan of action record and save
WebUI.click(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/PlanOfAction_AddButton'))

WebUI.doubleClick(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/PlanOfAction_Caseworksteps'))

WebUI.click(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/PlanOfAction_Caseworksteps_LOV'))

WebUI.doubleClick(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/PlanOfAction_Category'))

WebUI.click(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/PlanOfAction_Category_LOV'))

WebUI.doubleClick(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/PlanOfAction_Program'))

WebUI.click(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/PlanOfAction_Program_LOV'))

WebUI.click(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/PlanOfAction_SaveButton'))

Saved = WebUI.verifyElementPresent(findTestObject('Object Repository/CasePlan_create/Conditions Tab/SuccessMessage'), 2, 
    FailureHandling.STOP_ON_FAILURE)

//Try to delete plan of action
WebUI.click(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/PlanOfAction_DeleteButton'))

//cancel the delete action
WebUI.click(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/PlanOfAction_CancelButton'))

//again try to delete and save
WebUI.click(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/PlanOfAction_DeleteButton'))

WebUI.click(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/PlanOfAction_SaveButton'))

Saved = WebUI.verifyElementPresent(findTestObject('Object Repository/CasePlan_create/Conditions Tab/SuccessMessage'), 2, 
    FailureHandling.STOP_ON_FAILURE)

//Add new plan of action>>>>>>
WebUI.click(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/PlanOfAction_AddButton'))

WebUI.doubleClick(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/PlanOfAction_Caseworksteps'))

WebUI.click(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/PlanOfAction_Caseworksteps_LOV'))

WebUI.doubleClick(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/PlanOfAction_Category'))

WebUI.click(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/PlanOfAction_Category_LOV_V2'))

WebUI.doubleClick(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/PlanOfAction_Program'))

WebUI.click(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/PlanOfAction_Program_LOV_V2'))

//WebUI.selectOptionByLabel( findTestObject('Object Repository/CasePlan_create/CriminogenicTab/PlanOfAction_Program_LOV_V2'), '2222', false)
WebUI.click(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/PlanOfAction_SaveButton'))

Saved = WebUI.verifyElementPresent(findTestObject('Object Repository/CasePlan_create/Conditions Tab/SuccessMessage'), 2, 
    FailureHandling.STOP_ON_FAILURE)

//Move to another tab- Conditions tab
WebUI.scrollToElement(findTestObject('Object Repository/CasePlan_create/CriminogenicTab/TabHeader_CasePlan'), 1)

WebUI.click(findTestObject('Object Repository/CasePlan_create/Conditions Tab/ConditionsTab Header'))

//-------------------------------------------------------------
//if(WebUI.verifyElementPresent(findTestObject('Object Repository/CasePlan_create/Conditions Tab/Conditions_POA_AddButton') , 2, FailureHandling.OPTIONAL))
//{
//'click add button'
//WebUI.click( findTestObject('Object Repository/CasePlan_create/Conditions Tab/Conditions_POA_AddButton'))
//}
//else
//{
//'click release plan menu'
//WebUI.click( findTestObject('Object Repository/CasePlan_create/Release Plan/Release Plan Menu')  )
//}--------------------------------------------------------------
//Scroll to plan of action 
WebUI.scrollToElement(findTestObject('Object Repository/CasePlan_create/Conditions Tab/Conditions_POA_Grid'), 0)

//navigate to releaseplan screen
WebUI.callTestCase(findTestCase('LogintoCaseNote/Release Plan'), [:], FailureHandling.STOP_ON_FAILURE)

//Navigateback to CasePlan screen>>>>
WebUI.navigateToUrl(GlobalVariable.Caseplan_Inst_URL)

WebUI.delay(2)

//Go to Conditions tab and varify that the condition is present
//WebUI.scrollToElement(findTestObject('Object Repository/CasePlan_create/Page_Syscon/Save_button_Caseplan'), 1)
WebUI.click(findTestObject('Object Repository/CasePlan_create/Conditions Tab/ConditionsTab Header'))

//scroll to 'Plan of action'
WebUI.scrollToElement(findTestObject('Object Repository/CasePlan_create/Conditions Tab/PlanOfActionGrid'), 0)

//verify that condition is added and available on condition tab
Condition_added = WebUI.verifyElementPresent(findTestObject('Object Repository/CasePlan_create/Conditions Tab/POA_AddButton'), 
    3, FailureHandling.STOP_ON_FAILURE)

//Click on add button of plan of actrion grid
WebUI.click(findTestObject('Object Repository/CasePlan_create/Conditions Tab/POA_AddButton'))

//add new plan of action details
WebUI.doubleClick(findTestObject('Object Repository/CasePlan_create/Conditions Tab/POA_CaseworkField'))

WebUI.click(findTestObject('Object Repository/CasePlan_create/Conditions Tab/POA_CaseworkField_LOV'))

//WebUI.doubleClick(findTestObject('Object Repository/CasePlan_create/Conditions Tab/POA_CategoryField'))
//WebUI.click(findTestObject('Object Repository/CasePlan_create/Conditions Tab/POA_CategoryField_LOV'))
WebUI.click(findTestObject('Object Repository/CasePlan_create/Conditions Tab/POA_SaveButton'))

SavedSuccessfully = WebUI.verifyElementPresent(findTestObject('Object Repository/CasePlan_create/Conditions Tab/SuccessMessage'), 
    2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('D:\\Katalon_files\\Katalon_testRun_Screenshot\\LatestRun\\CasePlanCondition.png')

WebUI.closeBrowser()

