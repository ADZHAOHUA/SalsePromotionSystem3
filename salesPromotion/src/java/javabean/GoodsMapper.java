import java.util.Date;
import java.util.LinkedList;

public class GoodsMapper {
    private int stroeNo;//�̵���

    // �̵����еĻ���
    private LinkedList<Goods> goods=new LinkedList<Goods>();
    //����ĸ�����Ϣ
    class Goods{
        int goodNo;//��Ʒ���

        String name;//��Ʒ����
        double prePrice;//���
        double price;//�ּ�
        int minNum;//��С����
        int maxNum;//�������
        String picUrl;//����ͼƬ��λ��
        Date startTime;//�ϼ�����
        Date endTime;//�¼�����
        GoodsType goodsType;
        class GoodsType{
            String typename;//��������
            int typeno;//������
            String goodsDesc;//��Ʒ����
        }

    }
}
