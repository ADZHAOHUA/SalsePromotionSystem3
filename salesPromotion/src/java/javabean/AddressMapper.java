import java.util.LinkedList;

public class AddressMapper {
    private String userno;//�û����
    private String userRealname;//����
    private String  accout;//�˺� һ��Ϊ�ֻ���
    private LinkedList<String> address;//��ַӳ��

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
