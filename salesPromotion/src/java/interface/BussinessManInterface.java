import java.util.LinkedList;

public interface BussinessManInterface {
    /*
   @desc   �һ�����
   @param password ������
   @return �һ������Ƿ�ɹ�
    */
    public  boolean findPassword(String password);
    /*
    @desc  ��¼
    @param account �˺�
     @param password ����
    @return ��¼�Ƿ�ɹ�
     */
    public  boolean login(String account,String password);
    /*
@desc  ��ѯ����
@return �������еĵ���
 */
    public LinkedList<BussinessMan.Store> queryStore();
    /*
@desc  �޸ĵ���
@param storeNo ���̱�� store �޸ĺ��������Ϣ
@return �޸��Ƿ�ɹ�
*/
    public LinkedList<BussinessMan.Store> queryAddress(int storeNo,BussinessMan.Store store);
    /*
    @desc ��ѯ������Ϣ
    @return ����
     */
    public LinkedList<Orders> queryOrder();


}
