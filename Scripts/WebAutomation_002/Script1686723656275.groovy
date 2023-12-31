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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/OrangeHRM_Objects_AdminCreation/Page_OrangeHRM/input_Username_username'), 
    'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/OrangeHRM_Objects_AdminCreation/Page_OrangeHRM/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/OrangeHRM_Objects_AdminCreation/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_Objects_AdminCreation/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_Objects_AdminCreation/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_Objects_AdminCreation/Page_OrangeHRM/button_Add'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_Objects_AdminCreation/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.setText(findTestObject('Object Repository/OrangeHRM_Objects_AdminCreation/Page_OrangeHRM/input'), 'jaspal ')

WebUI.click(findTestObject('Object Repository/OrangeHRM_Objects_AdminCreation/Page_OrangeHRM/div_-- Select --'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_Objects_AdminCreation/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus_1'))

WebUI.setText(findTestObject('Object Repository/OrangeHRM_Objects_AdminCreation/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus o_d4f516'), 
    'jaspalrana')

WebUI.setEncryptedText(findTestObject('Object Repository/OrangeHRM_Objects_AdminCreation/Page_OrangeHRM/input_Password_oxd-input oxd-input--active'), 
    'Y0a16aDMbHpsM0pGtvTvVQ==')

WebUI.click(findTestObject('Object Repository/OrangeHRM_Objects_AdminCreation/Page_OrangeHRM/div_Confirm PasswordPasswords do not match'))

WebUI.setEncryptedText(findTestObject('Object Repository/OrangeHRM_Objects_AdminCreation/Page_OrangeHRM/input_Password_oxd-input oxd-input--active'), 
    '8ONjX3ggx5RmoBbvnoZOyw==')

WebUI.click(findTestObject('Object Repository/OrangeHRM_Objects_AdminCreation/Page_OrangeHRM/button_Save'))

WebUI.setText(findTestObject('Object Repository/OrangeHRM_Objects_AdminCreation/Page_OrangeHRM/input'), 'jaspal rana')

WebUI.doubleClick(findTestObject('Object Repository/OrangeHRM_Objects_AdminCreation/Page_OrangeHRM/input'))

WebUI.setText(findTestObject('Object Repository/OrangeHRM_Objects_AdminCreation/Page_OrangeHRM/input'), 'aman ')

WebUI.click(findTestObject('Object Repository/OrangeHRM_Objects_AdminCreation/Page_OrangeHRM/button_Save'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_Objects_AdminCreation/Page_OrangeHRM/span_Pooja Biradar'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_Objects_AdminCreation/Page_OrangeHRM/a_Logout'))

WebUI.closeBrowser()


