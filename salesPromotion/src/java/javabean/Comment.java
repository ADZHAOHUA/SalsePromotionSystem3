import java.util.Date;
import  java.util.LinkedList;
public class Comment {
    LinkedList<CommentInfo> comInfoList=new  LinkedList<CommentInfo>();

    class CommentInfo{
        int userNo;//�����߱��
        int storeNo;//�������̼ұ��
       String storeName;//�������̼�����
        int goodNo;//�����۲�Ʒ���
        String goodName;//�����۲�Ʒ����
        int commentNo;//���۱��
        Date createTime;//����ʱ��
        String comment;//��������
    }

}
