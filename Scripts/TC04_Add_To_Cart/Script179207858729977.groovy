import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

String apkPath = RunConfiguration.getProjectDir() + '/Data Files/apk/APK-sauce-labs.2.7.1.apk'
Mobile.startApplication(apkPath, false)
Mobile.waitForElementPresent(findTestObject('Login/btn_login'), 45)

Mobile.setText(findTestObject('Login/txt_username'), 'standard_user', 10)
Mobile.setText(findTestObject('Login/txt_password'), 'secret_sauce', 10)
Mobile.tap(findTestObject('Login/btn_login'), 10)
Mobile.waitForElementPresent(findTestObject('Products/screen_products'), 20)

Mobile.tap(findTestObject('Products/btn_addToCart'), 10)
Mobile.verifyElementExist(findTestObject('Products/btn_remove'), 10)
Mobile.verifyElementText(findTestObject('Products/lbl_cartBadge'), '1')
Mobile.tap(findTestObject('Products/btn_cart'), 10)
Mobile.waitForElementPresent(findTestObject('Cart/lbl_cartItemName'), 10)
Mobile.verifyElementText(findTestObject('Cart/lbl_cartItemName'), 'Sauce Labs Backpack')
