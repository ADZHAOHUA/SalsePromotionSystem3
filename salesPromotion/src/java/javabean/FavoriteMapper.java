import java.util.LinkedList;

public class FavoriteMapper {
    //�ղؼ���
    private String userno;//�û����
    private String userRealname;//����
    private String  accout;//�˺� һ��Ϊ�ֻ���
    private int favoiteNo;//�ղؼб��
    LinkedList<favotite> favotites=new LinkedList <favotite>();//ϲ������Ʒ���̼�
    class favotite{
        String goodsORStore;//ϲ������Ʒ���̼�
        String favoiteDate;//�ղ�ʱ��
        int favoiteNo;

        public String getGoodsORStore() {
            return goodsORStore;
        }

        public void setGoodsORStore(String goodsORStore) {
            this.goodsORStore = goodsORStore;
        }

        public String getFavoiteDate() {
            return favoiteDate;
        }

        public void setFavoiteDate(String favoiteDate) {
            this.favoiteDate = favoiteDate;
        }

        public int getFavoiteNo() {
            return favoiteNo;
        }

        public void setFavoiteNo(int favoiteNo) {
            this.favoiteNo = favoiteNo;
        }
    }

    public FavoriteMapper() {
    }

    public FavoriteMapper(String userno, String userRealname, String accout, int favoiteNo, LinkedList <favotite> favotites) {
        this.userno = userno;
        this.userRealname = userRealname;
        this.accout = accout;
        this.favoiteNo = favoiteNo;
        this.favotites = favotites;
    }


    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
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

    public int getFavoiteNo() {
        return favoiteNo;
    }

    public void setFavoiteNo(int favoiteNo) {
        this.favoiteNo = favoiteNo;
    }

    public LinkedList <favotite> getFavotites() {
        return favotites;
    }

    public void setFavotites(LinkedList <favotite> favotites) {
        this.favotites = favotites;
    }
}
