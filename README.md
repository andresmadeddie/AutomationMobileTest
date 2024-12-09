### Getting started
* Install and configure JDK 11
* Install npm: https://nodejs.org/en/download
* Install and configure appium: https://appium.io/docs/en/2.0/quickstart/install/
* Install DRIVER UIAutomator: (On the Command Line(CLI)(Git Bash)): appium driver install uiautomator2
* Install Appium Inspector: https://github.com/appium/appium-inspector/releases
* Install Android Studio: https://developer.android.com/studio
* Configure Android Debug Bridge(ABD): (Windows) Set 'platform-tools' as environmental variable with the name 'ANDROID_HOME'. Locate folder in (users/user/appdata/local/android/sdk)
* Create Virtual Machine using Android Studio: (Steps) More Actions -> Virtual Device Manager -> Create Device -> Choose <Phone Pixel 3> ->  Next -> choose OS <Tiramisu> -> Next -> Finish 
* Launch appium and annotate the URL: (CLI) appium
* Get udid: (CLI) adb devices
* Launch appium Inspector: 
    - Add the appium's URL
    - automationName: uiautomator2
    - platformName: ANDROID