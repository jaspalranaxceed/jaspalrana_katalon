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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/span_Dashboard'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/span_Time'))

WebUI.setText(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/input'), 'pooja')

WebUI.click(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/button_View'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/button_Edit'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/input_-- Select --_oxd-input oxd-input--focus'))

WebUI.setText(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/input_-- Select --_oxd-input oxd-input--foc_25c669'), 
    'test')

WebUI.setText(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/input_Should Be Less Than 24 and in HHMM or_b11f11'), 
    '')

WebUI.setText(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/input_-- Select --_oxd-input oxd-input--focus'), 
    '12')

WebUI.setText(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/input_-- Select --_oxd-input oxd-input--foc_25c669'), 
    '12:3')

WebUI.setText(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/input_-- Select --_oxd-input oxd-input--focus'), 
    '12:30')

WebUI.setText(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/input_Should Be Less Than 24 and in HHMM or_b11f11'), 
    '')

WebUI.click(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/input_-- Select --_oxd-input oxd-input--focus'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/input_-- Select --_oxd-input oxd-input--focus'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/button_Should Be Less Than 24 and in HHMM o_181f23'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/td_-- Select --'))

WebUI.setText(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/input_-- Select --_oxd-input oxd-input--focus'), 
    '12:30')

WebUI.setText(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/input_Should Be Less Than 24 and in HHMM or_b11f11'), 
    '')

WebUI.setText(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/input_-- Select --_oxd-input oxd-input--focus'), 
    '12:30')

WebUI.setText(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/input_Should Be Less Than 24 and in HHMM or_b11f11'), 
    '')

WebUI.setText(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/input_-- Select --_oxd-input oxd-input--focus'), 
    '12:30')

WebUI.setText(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/input_Should Be Less Than 24 and in HHMM or_b11f11'), 
    '')

WebUI.setText(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/input_-- Select --_oxd-input oxd-input--focus'), 
    '12:30')

WebUI.setText(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/input_Should Be Less Than 24 and in HHMM or_b11f11'), 
    '')

WebUI.setText(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/input_-- Select --_oxd-input oxd-input--focus'), 
    '12:30')

WebUI.setText(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/input_Should Be Less Than 24 and in HHMM or_b11f11'), 
    '')

WebUI.setText(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/input_-- Select --_oxd-input oxd-input--focus'), 
    '12:30')

WebUI.click(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.setText(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/input'), 'Test')

WebUI.click(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/div_-- Select --'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/button_Save'))

WebUI.setText(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/input'), 'O')

WebUI.click(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec_1'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/i_Bug Fixes_oxd-icon bi-plus'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/button_Save'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/i_Select an Activity_oxd-icon bi-trash'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/button_Save'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/p_Pooja Biradar'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_002/Page_OrangeHRM/a_Logout'))

