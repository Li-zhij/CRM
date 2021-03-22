import org.junit.Test;
import zhij.utils.DateTimeUtil;
import zhij.utils.MD5Util;

import java.util.Date;

public class UserTest extends BaseTest {

    @Test
    public void testExpireTime() {
        String expireTime = "2021-10-10 10:10:10";
        String curTime = DateTimeUtil.getSysTime();
        int count = expireTime.compareTo(curTime);
        System.out.println(count);
    }

    @Test
    public void testLockState() {
        int lockState = 0;
        if (lockState == 0) {
            System.out.println("账号锁定！");
        }
    }

    @Test
    public void testIP() {
        String ip = "192.168.0.4";
        String allowIps = "192.168.0.1,192.168.0.2";
        if (allowIps.contains(ip)) {
            System.out.println("有效IP");
        } else {
            System.out.println("无效ip");
        }
    }

    @Test
    public void testUser() {
        String username = "";
        String password = "1147966681";
        // md5 加密
        String md5Pwd = MD5Util.getMD5(password);
        System.out.println(md5Pwd);
    }

}
