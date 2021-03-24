package zhij.filter;

import java.util.Arrays;
import java.util.List;

/**
 * 配置不拦截 url
 */
public class ExcludeURL {

    private static List<String> unFilterURLs = Arrays.asList(
            "http://127.0.0.1:9000/crm/user/login");

    public static boolean isFilter(String url) {
        for (String unFilterURL:unFilterURLs) {
            if (url.equals(unFilterURL)) {
                return false;
            }
        }
        return true;
    }

}
