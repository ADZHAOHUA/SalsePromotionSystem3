import java.util.LinkedList;

public interface UserDaoInterface {
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
    public  boolean  login(String account,String password);
    /*
   @desc  ��ѯ�ջ���ַ
   @return �ջ���ַ
    */
    public LinkedList<String>  queryAddress();
    /*
    @desc  ��ѯ�ղؼ�
   @return �ղؼ�
    */

    public LinkedList<FavoriteMapper.favotite>  queryFavorite();
     /*
    @desc  ��ѯ����
   @return ����
    */

    public LinkedList<Comment.CommentInfo>  queryComment();

     /*
    @desc  ��ѯ����
    @param info Ҫ��ѯ���̼һ��߻���
   @return ����
    */
    public LinkedList<Comment.CommentInfo>  queryComment(String info);

    /*
 @desc  ��ѯ�������ڵ��̵���Ϣ
 @param info �������� ����
   @return �̵���Ϣ
     */
    public LinkedList<BussinessMan.Store> queryStore(String info);
    /*
    @desc ��ѯ����
    @return  ������¼
     */
    public LinkedList<Orders> queryItem();
    /*
    @desc ��ѯ������Ϣ
    @return ������Ϣ
     */
    public User queryInfo();
     /*
     @desc �����û�
     @param newuser �µ��û���Ϣ
     @return true ���³ɹ� false ����ʧ��
      */
    public boolean updateUser(User newuser);


}
