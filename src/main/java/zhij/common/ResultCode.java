package zhij.common;

public enum ResultCode {

    SUCCESS(true, "0000", "操作成功！"),
    FAIL(false, "9999", "操作失败！"),
    /**********系统错误************/
    UNAUTHENTICATED(false, "1001", "您还未登录！"),
    UNAUTHORISE(false, "1002", "权限不足！"),
    SERVER_ERROR(false, "1000", "抱歉，系统繁忙，请稍后重试！"),
    /**********用户操作************/
    USER_NOTFOUND(false, "2001", "用户不存在！"),
    PWD_OR_ACT_ERROR(false, "2002", "账号或密码错误"),
    WRONG_OLD_PWD(false, "2003", "旧密码错误！"),
    USER_LOCKED(false, "2004", "账号已锁定！");

    boolean success;    // 操作是否成功
    String code;       // 操作码
    String message;     // 提示信息

    ResultCode(boolean success, String code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
