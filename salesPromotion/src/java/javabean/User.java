import java.util.LinkedList;

public class User extends people {
    //��Ҫ���Ǽ���ȼ�
    private int level;//�ȼ�
    private String state;//�û�״̬
    private AddressMapper address;//��ַӳ��
    private FavoriteMapper favorite=new FavoriteMapper();//�ղؼ�ӳ��

    public User(String username,
                String sex, String birth,
                int userno, String userRealname,
                String accout, String password,
                String email, int level) {
        super(username, sex, birth, userno, userRealname, accout, password, email);

        this.level = level;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public FavoriteMapper getFavorite() {
        return favorite;
    }

    public void setFavorite(FavoriteMapper favorite) {
        this.favorite = favorite;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }



    public AddressMapper getAddress() {
        return address;
    }

    public void setAddress(AddressMapper address) {
        this.address = address;
    }
}
