import java.util.List;

//��ַ����ʵ�ֽӿ�
public interface AddressDaoInterfface {
    /*
    @desc ɾ����ַ
    @param userno �û���� address ��ַ
    @return ɾ���Ƿ�ɹ�
     */
    public boolean delAddress(int userno,String address);
    /*
  @desc ��ѯ��ַ
  @param userno �û���� address ��ַ
  @return �Ƿ���ڸĵ�ַ
   */
    public boolean queryAddress(int userno,String address);
    /*
@desc ��ѯ�û��ĵ�ַ
@param userno �û����
@return �û����е�ַ
 */
    public List<String> queryAddress(int userno);

    /*
@desc �����û��ĵ�ַ
@param userno �û���� String address���º�ĵ�ַ
@return �����Ƿ�ɹ�
*/
    public boolean addAddress(int userno,String address);
}
