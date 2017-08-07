package xxx.rr;

/**
 * Created by Bob on 2017/8/1.
 */

public class Url {
    public static final String timeDiff = "timeDiff";
    public static final String sign = "sign";
    public static final String SERVER_URL = "http://123.59.76.240:9001/0_0_0";//域名

    public static String send_code = SERVER_URL + "/sms/send_smscode";                  //1、	发送短信验证码
    public static String send_smscode_unique = SERVER_URL + "/sms/send_smscode_unique"; //1、	发送短信验证码
    public static String is_code = SERVER_URL + "/sms/check_smscode";                   //2、	验证验证码是否正确
    public static String is_code_unique = SERVER_URL + "/sms/check_smscode_unique";     //2、	验证验证码是否正确
    public static String user_regist = SERVER_URL + "/user/register";                   //3、	注册用户
    public static String regist_login = SERVER_URL + "/user/login";                     //4、	密码登录
    public static String code_login = SERVER_URL + "/user/login_sms";                   //5、	验证码登录
    public static String change_pwd = SERVER_URL + "/user/alt_password";                //6、	修改密码
    public static String test_sha1 = SERVER_URL + "/test/sha1";                         //1、	密码sha1
    public static String make_sign = SERVER_URL + "/test/make_sign";                    //2、	签名接口
    public static String check_sign = SERVER_URL + "/test/check_sign";                  //3、	验证签名
    public static String get_system_time = SERVER_URL + "/system/get_sys_time";         //获取服务器时间戳
}
