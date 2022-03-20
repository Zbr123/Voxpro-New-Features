package core.utils.AndroidCore;

import core.utils.ConfigUtil;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.Properties;


public class CapabilitiesGenerator {

    public static Properties androidconfig = ConfigUtil.getConfig("androidconfig");
    // App1 capabilities
    static String contactsAppPackageName="com.android.contacts";
    // App2 capabilities
    String settingsAppPackageName="com.android.settings";
    String settingsAppActivityName="com.android.settings.Settings";

    public static int getAnyFreePort() throws IOException {
        ServerSocket s = new ServerSocket(0);
        return s.getLocalPort();
    }

    public static DesiredCapabilities getAndroidCapabilities() throws IOException {
      //  Properties UserProperties = ConfigUtil.getConfig("AndroidUser");
        String apk = androidconfig.getProperty("androidapk");
        File apkDir = new File("APK/");
        System.out.println("Apk : " + apk);
        File app = new File(apkDir, apk);

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, androidconfig.getProperty("platformName"));
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, androidconfig.getProperty("platformVersion"));
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, androidconfig.getProperty("deviceName"));
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, androidconfig.getProperty("automationName"));
        //cap.setCapability(MobileCapabilityType.UDID , UDID);
        cap.setCapability("systemPort",getAnyFreePort());
        cap.setCapability("newCommandTimeout", 400000);
        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
      //  cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, UserProperties.getProperty("automationName"));
      //  cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, UserProperties.getProperty("automationName"));
        cap.setCapability("autoGrantPermissions", true);
        cap.setCapability("autoAcceptAlerts", true);
        cap.setCapability("noReset", false);
        return cap;
    }

}
