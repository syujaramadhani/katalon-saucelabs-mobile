import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

class MobileTearDown {

	@BeforeTestCase
	def setCapabilities() {
		// splash screen closes fast, so wait for the main activity instead
		RunConfiguration.setMobileDriverPreferencesProperty('appWaitActivity', 'com.swaglabsmobileapp.MainActivity')
	}

	@AfterTestCase
	def closeApp() {
		try {
			Mobile.closeApplication()
		} catch (Exception e) {
			// app was never started
		}
	}
}
