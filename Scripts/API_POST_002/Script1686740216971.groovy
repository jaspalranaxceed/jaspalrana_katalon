import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.Assert as Assert
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import groovy.json.JsonSlurper as JsonSlurper

RequestObject requestObject = findTestObject('POST_002')

def jsonslurper = new JsonSlurper()

def conTentType = new TestObjectProperty('Content-Type', ConditionType.EQUALS, 'application/json')

def acceptHeader = new TestObjectProperty('Accept', ConditionType.EQUALS, 'application/json')

requestObject.setHttpHeaderProperties(Arrays.asList(conTentType, acceptHeader))

def responseObject = WS.sendRequest(requestObject)

def responsevalue = jsonslurper.parseText(responseObject.getResponseText())

Assert.assertEquals(201, responseObject.getStatusCode())

println('Status Code ' + responseObject.getStatusCode())

println('responsevalue ' + responsevalue)

//WS.sendRequest(findTestObject('POST_002'))