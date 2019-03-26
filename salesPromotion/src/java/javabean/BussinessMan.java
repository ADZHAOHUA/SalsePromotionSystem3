import java.util.LinkedList;

public class BussinessMan  extends  people{
    //一个商人对应多个商店 一个商店对应一个商人

    private LinkedList<Store> stores=new LinkedList<Store>();
    class Store{
        int storeNum;//商店编号
        String storeName;//商店名称
        String storeDesc;//商店描述
        GoodsMapper goods;//商店所拥有的货物
    }

}
