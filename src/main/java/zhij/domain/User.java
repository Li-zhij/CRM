package zhij.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class User {
    @ApiModelProperty(value = "用户id")
    private String id;
    @ApiModelProperty(value = "用户账号")
    private String loginAct;
    @ApiModelProperty(value = "用户姓名")
    private String name;    // 真实姓名
    @ApiModelProperty(value = "用户密码")
    private String loginPwd;
    @ApiModelProperty(value = "用户email")
    private String email;
    @ApiModelProperty(value = "用户账号失效时间")
    private String expireTime;  // 失效时间
    @ApiModelProperty(value = "用户锁定状态")
    private String lockStatus;   // 锁定状态
    @ApiModelProperty(value = "用户部门编号")
    private String deptno;      // 部门编号
    @ApiModelProperty(value = "用户ip地址")
    private String allowIps;    // IP 地址
    @ApiModelProperty(value = "用户创建时间")
    private String createTime;
    @ApiModelProperty(value = "用户创建人")
    private String createBy;
    @ApiModelProperty(value = "用户修改时间")
    private String editTime;
    @ApiModelProperty(value = "用户修改人")
    private String editBy;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", loginAct='" + loginAct + '\'' +
                ", name='" + name + '\'' +
                ", loginPwd='" + loginPwd + '\'' +
                ", email='" + email + '\'' +
                ", expireTime='" + expireTime + '\'' +
                ", lockStatus='" + lockStatus + '\'' +
                ", deptno='" + deptno + '\'' +
                ", allowIps='" + allowIps + '\'' +
                ", createTime='" + createTime + '\'' +
                ", createBy='" + createBy + '\'' +
                ", editTime='" + editTime + '\'' +
                ", editBy='" + editBy + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginAct() {
        return loginAct;
    }

    public void setLoginAct(String loginAct) {
        this.loginAct = loginAct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(String lockState) {
        this.lockStatus = lockState;
    }

    public String getDeptno() {
        return deptno;
    }

    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }

    public String getAllowIps() {
        return allowIps;
    }

    public void setAllowIps(String allowIps) {
        this.allowIps = allowIps;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getEditTime() {
        return editTime;
    }

    public void setEditTime(String editTime) {
        this.editTime = editTime;
    }

    public String getEditBy() {
        return editBy;
    }

    public void setEditBy(String editBy) {
        this.editBy = editBy;
    }
}
