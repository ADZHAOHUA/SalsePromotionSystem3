import java.util.Date;
import java.util.LinkedList;

public class GoodsMapper {
    private int stroeNo;//商店编号

    // 商店所有的货物
    private LinkedList<Goods> goods=new LinkedList<Goods>();
    //货物的各种信息
    class Goods{
        int goodNo;//商品编号

        String name;//商品名称
        double prePrice;//标价
        double price;//现价
        int minNum;//最小数量
        int maxNum;//最大数量
        String picUrl;//货物图片的位置
        Date startTime;//上架日期
        Date endTime;//下架日期
        GoodsType goodsType;
        class GoodsType{
            String typename;//种类名称
            int typeno;//种类编号
            String goodsDesc;//商品描述
        }

    }
}
