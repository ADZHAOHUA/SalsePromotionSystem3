import java.util.Date;
import  java.util.LinkedList;
public class Comment {
    LinkedList<CommentInfo> comInfoList=new  LinkedList<CommentInfo>();

    class CommentInfo{
        int userNo;//评论者编号
        int storeNo;//被评论商家编号
       String storeName;//被评论商家名称
        int goodNo;//被评论产品编号
        String goodName;//被评论产品名称
        int commentNo;//评论编号
        Date createTime;//评论时间
        String comment;//评论内容
    }

}
