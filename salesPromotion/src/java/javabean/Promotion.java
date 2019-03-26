import java.util.Date;
import java.util.*;

public class Promotion {
    int proNo;//促销方案编号
    HashMap<Integer,String> principle;
    int minlevel; //促销适用客户最低等级
     int maxlevel; //促销适用客户最高等级  适用首次购买用户 新注册用户
     LinkedList<String> goodsType;//促销适用的商品种类
    LinkedList<String> noGoodsType;//促销不适用的商品种类
    LinkedList<String> goodsBrand;//促销适用的品牌
    LinkedList<String> NoGoodsBrand;//促销适用的品牌
    LinkedList<String> goodsPack;//促销打包的商品
    Date createTime;//促销开始时间
    Date endtime;//促销结束时间
    TreeSet<Integer> proDayOfWeek;//一周的那几天
    TreeSet<Integer> proDayOfMonth;//一个月的那几天


}
