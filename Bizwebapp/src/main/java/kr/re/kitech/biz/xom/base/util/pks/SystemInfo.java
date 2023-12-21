package kr.re.kitech.biz.xom.base.util.pks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.Properties;

/**
 * <ul>
 * <li>설 명 : SystemInfo</li>
 * </ul>
 * 
 * System 클래스에서 제공하는 정보 중 자주 사용되는 정보를 가져온다. InetAddress 클래스에서 제공하는 HostName, IP
 * Address, Mac Address등을 가져온다.
 */
public class SystemInfo {

    public static String getUserName() {
        return System.getProperty("user.name");
    }

    /**
     * Convert ip address to byte array ex) convertIpAddress("127.0.0.1") =>
     * [(byte)127, (byte)0, (byte)0, (byte)1]
     * 
     * @param ipAddress
     * @return byte[]
     * @see getHostName(String ipAddress)
     */
    public static byte[] convertIpAddress(String ipAddress) {
        if (ipAddress == null || ipAddress.trim().length() == 0) {
            return null;
        }

        String[] split = ipAddress.split("\\.");
        if (split.length != 4) {
            return null;
        }

        byte[] b = new byte[4];

        for (int i = 0; i < split.length; i++) {
            String address = split[i];
            try {
                int parseInt = Integer.parseInt(address);
                b[i] = (byte) parseInt;
            } catch (NumberFormatException e) {
                return null;
            } catch (Exception e) {
                return null;
            }
        }
        return b;
    }

    /**
     * get local host name
     * 
     * @return String
     */
    public static String getHostName() {
        String hostName = "";
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            if (localHost != null) {
                hostName = localHost.getHostName();
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return hostName;
    }

    /**
     * get local host name
     * 
     * @return String
     */
    public static String getHostName(String ipAddress) {
        String hostName = "";
        try {
            byte[] convertIpAddress = convertIpAddress(ipAddress);
            if (convertIpAddress == null)
                return "";

            InetAddress localHost = InetAddress.getByAddress(convertIpAddress);
            if (localHost != null) {
                hostName = localHost.getHostName();
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return hostName;
    }

    /**
     * 로컬 IP Address를 가져온다.
     * 
     * @return Local IP Address
     */
    public static String getIPAddress() {
        String ipAddress = "";
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            if (localHost != null) {
                ipAddress = localHost.getHostAddress();
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return ipAddress;
    }

    /**
     * get host name's ip address
     * 
     * @param hostName
     * @return String
     */
    public static String getIPAddress(String hostName) {
        String ipAddress = "";
        try {
            InetAddress localHost = InetAddress.getByName(hostName);
            if (localHost != null) {
                ipAddress = localHost.getHostAddress();
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return ipAddress;
    }

    /**
     * get localhost ip addresses
     * 
     * @param hostName
     * @return String
     */
    public static String[] getIPAddresses() {
        String[] ipAddresses = null;
        try {
            InetAddress[] inetAddresses = InetAddress.getAllByName(getHostName());
            if (inetAddresses != null && inetAddresses.length > 0) {
                ipAddresses = new String[inetAddresses.length];
                for (int i = 0; i < inetAddresses.length; i++) {
                    InetAddress inetAddress = inetAddresses[i];
                    ipAddresses[i] = inetAddress.getHostAddress();
                }
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return ipAddresses;
    }

    /**
     * get host name's ip addresses
     * 
     * @param hostName
     * @return String
     */
    public static String[] getIPAddresses(String hostName) {
        String[] ipAddresses = null;
        try {
            InetAddress[] inetAddresses = InetAddress.getAllByName(hostName);
            if (inetAddresses != null && inetAddresses.length > 0) {
                ipAddresses = new String[inetAddresses.length];
                for (int i = 0; i < inetAddresses.length; i++) {
                    InetAddress inetAddress = inetAddresses[i];
                    ipAddresses[i] = inetAddress.getHostAddress();
                }
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return ipAddresses;
    }


    public static String getFileSeperator() {
        return System.getProperty("file.separator");
    }

    public static String getPathSeperator() {
        return System.getProperty("path.separator");
    }

    /**
     * get user default language code
     * 
     * ex) ko, en, zh
     * 
     * @return String
     */
    public static String getUserLanguage() {
        return System.getProperty("user.language");
    }

    /**
     * get user default country code
     * 
     * ex) KR, US, CN
     * 
     * @return String
     */
    public static String getUserCountry() {
        return System.getProperty("user.country");
    }

    /**
     * return user default locale UserLanguage_UserCountry ex) ko_KR, en_US,
     * zh_CN
     * 
     * @return String
     */
    public static String getUserCharacterSet() {
        return getUserLanguage() + "_" + getUserCountry();
    }

    /**
     * return user default locale UserLanguage_UserCountry ex) ko_KR, en_US,
     * zh_CN
     * 
     * @return String
     * @see getUserCharacterSet()
     */
    public static String getLocale() {
        return getUserCharacterSet();
    }

    /**
     * get user default home path
     * 
     * @return String
     */
    public static String getUserHomePath() {
        return System.getProperty("user.home");
    }

    public static String getUserCurrentPath() {
        return System.getProperty("user.dir");
    }

    public static String getTempPath() {
        return System.getProperty("java.io.tmpdir");
    }

    public static String getJavaVersion() {
        return System.getProperty("java.version");
    }

    public static String getJavaVendor() {
        return System.getProperty("java.vendor");
    }

    public static String getJavaVMInfo() {
        return System.getProperty("java.vm.info");
    }

    public static String getJavaHomePath() {
        return System.getProperty("java.home");
    }

    public static String getFileEncoding() {
        return System.getProperty("file.encoding");
    }

    public static String getOSName() {
        return System.getProperty("os.name");
    }

    public static String getLineSeparator() {
        return System.getProperty("line.separator");
    }

    public static void printSystemInfo() {
        Properties properties = System.getProperties();
        Enumeration<?> propertyNames = properties.propertyNames();
        Object key = null;
        Object value = null;
        while (propertyNames.hasMoreElements()) {
            key = (Object) propertyNames.nextElement();
            value = properties.get(key);
            System.out.println(key + " : " + value);
        }
    }
}
