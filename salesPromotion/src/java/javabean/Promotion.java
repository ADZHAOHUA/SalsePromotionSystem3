import java.util.Date;
import java.util.*;

public class Promotion {
    int proNo;//�����������
    HashMap<Integer,String> principle;
    int minlevel; //�������ÿͻ���͵ȼ�
     int maxlevel; //�������ÿͻ���ߵȼ�  �����״ι����û� ��ע���û�
     LinkedList<String> goodsType;//�������õ���Ʒ����
    LinkedList<String> noGoodsType;//���������õ���Ʒ����
    LinkedList<String> goodsBrand;//�������õ�Ʒ��
    LinkedList<String> NoGoodsBrand;//�������õ�Ʒ��
    LinkedList<String> goodsPack;//�����������Ʒ
    Date createTime;//������ʼʱ��
    Date endtime;//��������ʱ��
    TreeSet<Integer> proDayOfWeek;//һ�ܵ��Ǽ���
    TreeSet<Integer> proDayOfMonth;//һ���µ��Ǽ���


}
