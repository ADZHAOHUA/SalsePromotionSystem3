public class people {
    //�ο���

    private String username;//����
    private String sex;//�Ա�
    private String birth;//���� ���ݿ�����date����
    private int userno;//�û����
    private String userRealname;//����
    private String  accout;//�˺� һ��Ϊ�ֻ���
    private String  password;//����
    private String email;//���������ַ
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
