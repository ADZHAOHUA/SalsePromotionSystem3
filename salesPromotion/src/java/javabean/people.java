public class people {
    //游客类

    private String username;//网名
    private String sex;//性别
    private String birth;//生日 数据库中用date类型
    private int userno;//用户编号
    private String userRealname;//真名
    private String  accout;//账号 一般为手机号
    private String  password;//密码
    private String email;//电子邮箱地址
    public people()
    {

    }

    public people(String username,
                  String sex, String birth, int userno, String userRealname,
                  String accout, String password, String email) {
        this.username = username;
        this.sex = sex;
        this.birth = birth;
        this.userno = userno;
        this.userRealname = userRealname;
        this.accout = accout;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getUserno() {
        return userno;
    }

    public void setUserno(int userno) {
        this.userno = userno;
    }

    public String getUserRealname() {
        return userRealname;
    }

    public void setUserRealname(String userRealname) {
        this.userRealname = userRealname;
    }

    public String getAccout() {
        return accout;
    }

    public void setAccout(String accout) {
        this.accout = accout;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
