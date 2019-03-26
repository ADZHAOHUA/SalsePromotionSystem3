import java.util.Date;
import java.util.LinkedList;
//订单实体类
public class Orders {

    private int orderNo;//订单编号
    private int userNo;//用户编号
    private String userName;//用户名称

    private Date createtime;//订单创建时间
    private short state;//订单状态   -1 0 1 || 0 1 2
    //订单条目
    LinkedList<OrderItem> ordetItem;



}
