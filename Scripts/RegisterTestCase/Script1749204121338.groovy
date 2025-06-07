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

WebUI.openBrowser('https://tutorialsninja.com/demo/index.php?route=account/register')

WebUI.sendKeys(findTestObject('Registration/Page_Register Account/First Name'), 'Manoj')

WebUI.sendKeys(findTestObject('Registration/Page_Register Account/Last Name'), 'S')

WebUI.sendKeys(findTestObject('Registration/Page_Register Account/E-Mail'), 'svmanoj2312000@gmail.com')

WebUI.sendKeys(findTestObject('Registration/Page_Register Account/Telephone'), '8110085233')

WebUI.sendKeys(findTestObject('Registration/Page_Register Account/Password'), 'Himalayan@23')

WebUI.sendKeys(findTestObject('Registration/Page_Register Account/Password Confirm'), 'Himalayan@23')

WebUI.click(findTestObject('Registration/Page_Register Account/Yes_newsletter'))

WebUI.click(findTestObject('Registration/Page_Register Account/Privacy Policy_Agree'))

WebUI.click(findTestObject('Registration/Page_Register Account/Submit_Button'))

WebUI.closeBrowser()

