import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

String apkPath = RunConfiguration.getProjectDir() + '/Data Files/apk/APK-sauce-labs.2.7.1.apk'
Mobile.startApplication(apkPath, false)
Mobile.waitForElementPresent(findTestObject('Login/btn_login'), 45)

Mobile.setText(findTestObject('Login/txt_password'), 'secret_sauce', 10)
Mobile.tap(findTestObject('Login/btn_login'), 10)
Mobile.waitForElementPresent(findTestObject('Login/lbl_errorMessage'), 10)
Mobile.verifyElementText(findTestObject('Login/lbl_errorMessage'), 'Username is required')
