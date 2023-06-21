import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.Assert as Assert
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import groovy.json.JsonSlurper as JsonSlurper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

RequestObject requestObject = findTestObject('GET_API_Single_Resource_001')

def jsonslurper = new JsonSlurper()

def conTentType = new TestObjectProperty('Content-Type', ConditionType.EQUALS, 'application/json')

def acceptHeader = new TestObjectProperty('Accept', ConditionType.EQUALS, 'application/json')

requestObject.setHttpHeaderProperties(Arrays.asList(conTentType, acceptHeader))

def responseObject = WS.sendRequest(requestObject)

def responsevalue = jsonslurper.parseText(responseObject.getResponseText())

Assert.assertEquals(200, responseObject.getStatusCode())

println('Status Code ' + responseObject.getStatusCode())

println('responsevalue ' + responsevalue)

