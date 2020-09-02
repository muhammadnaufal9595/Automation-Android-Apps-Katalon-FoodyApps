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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('login_foody/CF-001_as a user is able to login via facebook'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Search Menu/android.widget.ImageView0'), 10)

Mobile.tap(findTestObject('Search Menu/android.widget.TextView0 - Search for cuisine name address...'), 10)

Mobile.setText(findTestObject('Search Menu/android.widget.EditText0 - ice cream'), 'ice cream', 10)

Mobile.tap(findTestObject('Search Menu/android.widget.TextView0 - Today Coffee  Ice Cream'), 10)

Mobile.tap(findTestObject('Search Menu/android.widget.TextView0 - OK'), 10)

Mobile.closeApplication()

