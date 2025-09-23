package org.example.jiandan;

/**
 * 165. 比较版本号
 */
public class S165 {
    public int compareVersion(String version1, String version2) {
        var version1s = version1.split("\\.");
        var version2s = version2.split("\\.");
        int len = Math.min(version1s.length, version2s.length);
        int i;
        for (i = 0; i < len; i++) {
            var version1c = version1s[i].replaceFirst("0*", "");
            var version2c = version2s[i].replaceFirst("0*", "");
            if (version1c.length() < version2c.length()) {
                return -1;
            } else if (version1c.length() > version2c.length()) {
                return 1;
            } else {
                int res = version1c.compareTo(version2c);
                if (res < 0) {
                    return -1;
                }
                if (res > 0) {
                    return 1;
                }
            }
        }

        if (version1s.length == len) {
            for (; i < version2s.length; i++) {
                var version2c = version2s[i].replaceFirst("0*", "");
                if (!version2c.isBlank()) {
                    return -1;
                }
            }
        }

        if (version2s.length == len) {
            for (; i < version1s.length; i++) {
                var version1c = version1s[i].replaceFirst("0*", "");
                if (!version1c.isBlank()) {
                    return 1;
                }
            }
        }

        return 0;
    }

}
