import java.util.LinkedList;

public class BussinessMan  extends  people{
    //һ�����˶�Ӧ����̵� һ���̵��Ӧһ������

    private LinkedList<Store> stores=new LinkedList<Store>();
    class Store{
        int storeNum;//�̵���
        String storeName;//�̵�����
        String storeDesc;//�̵�����
        GoodsMapper goods;//�̵���ӵ�еĻ���
    }

}
