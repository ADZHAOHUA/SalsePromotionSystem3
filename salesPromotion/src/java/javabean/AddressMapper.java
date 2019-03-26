import java.util.LinkedList;

public class AddressMapper {
    private String userno;//用户编号
    private String userRealname;//真名
    private String  accout;//账号 一般为手机号
    private LinkedList<String> address;//地址映射

    public AddressMapper(String userno, String userRealname, String accout, LinkedList<String> address) {
        this.userno = userno;
        this.userRealname = userRealname;
        this.accout = accout;
        this.address = address;
    }

    public LinkedList <String> getAddress() {
        return address;
    }

    public void setAddress(LinkedList <String> address) {
        this.address = address;
    }
}
