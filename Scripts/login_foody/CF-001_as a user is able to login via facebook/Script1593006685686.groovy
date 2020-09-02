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

Mobile.startApplication('C:\\Users\\User\\Katalon Studio\\foody_android_automation\\apk\\Foody Find Reserve Delivery_v5.3.1_apkpure.com.apk', 
    true)

Mobile.delay(30)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.LinearLayout0'), 10)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.TextView0 - Close'), 10)

Mobile.tap(findTestObject('Login/android.widget.ImageView0'), 10)

Mobile.tap(findTestObject('Login/android.widget.TextView0 - Login'), 10)

Mobile.tap(findTestObject('Login/android.widget.TextView0 - Connect with Facebook'), 10)

Mobile.setText(findTestObject('Login/android.widget.EditText0'), 'chaky9595@gmail.com', 10)

Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText1'), 'Nvlmzki079559', 10)

Mobile.tap(findTestObject('Object Repository/Login/Button Masuk'), 10)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button0 - Continue'), 10)

