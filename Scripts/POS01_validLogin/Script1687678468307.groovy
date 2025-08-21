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

WebUI.openBrowser('https://www.carmudi.co.id/')

WebUI.click(findTestObject('carmudi/HeaderPage/loginDropdown'))

WebUI.click(findTestObject('carmudi/HeaderPage/loginHeader'))

WebUI.click(findTestObject('carmudi/HeaderPage/loginForm'))

WebUI.setText(findTestObject('carmudi/HeaderPage/usernameEditText'), 'vinnz_pearl@ymail.com')

WebUI.setEncryptedText(findTestObject('carmudi/HeaderPage/passwordEditText'), 'z0eLnkwo8e9Kz0fw3aYZ6R/ACZFR4v9n')

WebUI.click(findTestObject('carmudi/HeaderPage/checklistButtonLogin'))

WebUI.click(findTestObject('carmudi/HeaderPage/loginButton'))

WebUI.click(findTestObject('carmudi/HeaderPage/burgerIconMenu'))

WebUI.click(findTestObject('carmudi/HeaderPage/profileIcon'))

WebUI.click(findTestObject('carmudi/ProfilePage/enterProfile'))

WebUI.verifyElementText(findTestObject('carmudi/ProfilePage/profileName'), 'Vina Pratiwi')

WebUI.closeBrowser()

