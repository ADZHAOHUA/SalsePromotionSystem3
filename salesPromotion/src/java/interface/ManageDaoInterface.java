import java.util.Date;
import java.util.LinkedList;

public interface ManageDaoInterface {
    /*
    @desc ���ӹ˿���Ϣ
    @param �˿���Ϣ
    @return �����Ƿ�ɹ�
     */
    public boolean addUser(User user);

    /*
   @desc �����̼���Ϣ
   @param �̼���Ϣ
   @return �����Ƿ�ɹ�
    */
    public boolean addBussinessMan(BussinessMan bussinessMan);

    /*
  @desc ע���û���Ϣ
  @param �û����
  @return ע���Ƿ�ɹ�
   */
    public boolean delUser(int userNo);

    /*
     @desc ע���̼���Ϣ
     @param �̼ұ��
     @return ע���Ƿ�ɹ�
      */
    public boolean delBussinessMan(int userNo);

    /*
     @desc ע���̵���Ϣ
     @param  userNo�̼ұ�� storeNo �̵���
     @return ע���Ƿ�ɹ�
      */
    public boolean delStore(int userNo,int storeNo);

    /*
    @desc ����̵���Ϣ
    @param  userNo�̼ұ�� storeNo �̵���
    @return ����Ƿ�ͨ��
     */
     public boolean examine(int userNo,BussinessMan.Store store);

/*
 @desc  �޸��̼���Ϣ
@param bussinessManNo Ҫ�޸ĵ��̼ұ�� Info
 @return  �޸��Ƿ�ɹ�
 */

  public boolean updateBussinessMan(int bussinessManNo,BussinessMan Info);

    /*
   @desc  �޸Ĺ˿���Ϣ
   @param bussinessManNo Ҫ�޸ĵĹ˿ͱ�� Info
   @return  �޸��Ƿ�ɹ�
   */
    public boolean updateUserInfo(int userNo,User Info);

     /*
   @desc  ��ѯ����
   */
     public  void queryOrder();

     /*
     @desc �¼ܻ���
     @param goodNo ������
     @return �¼��Ƿ�ɹ�
      */
     public boolean delGood(int goodNo);

    /*
   @desc ��ѯ����
   @param commentNo ���۱��
   @return ����
    */
    public Comment queryComment(int commentNo);

    /*
 @desc sɾ������
 @param commentNo ���۱��
 @return ɾ���Ƿ�ɹ�
  */
    public boolean delComment(int commentNo);

/*
@desc��ѯ�����Ϣ
@param kind ���
@return �Ƿ����
 */
  public boolean queryKind(String kind);

    /*
 @desc ��ѯ���������Ϣ
   */
    public void queryKind();

/*
@desc �������
@param   kind ���
@return �����Ƿ�ɹ�
 */
public boolean addKind(String kind);

    /*
    @desc ɾ�����
    @param  kind ���
    @return  ɾ���Ƿ�ɹ�
     */
    public boolean delKind(String kind);

    /*
@desc �޸������Ϣ
@param  �޸�֮ǰ �޸�֮��  �޸�֮�����ϢҪ�ж��Ƿ���ԭ�ȴ��ڵ���Ϣ�ظ�
@return �޸��Ƿ�ɹ�
 */
    public boolean addKind(String kind,String endKind);

    /*
    @dec���Ӵ�������s
    @param promotion��������
    @return �����Ƿ�ɹ�
     */
    public boolean addProPlan(Promotion promotion);

    /*
    @dec���ݱ�ź�ɾ����������s
    @param No �����������
    @return ɾ���Ƿ�ɹ�
     */
    public boolean delProPlanByNo(int No);
    /*
    @dec����ʱ���ѵ�ɾ����������
    @param curDate ����ʱ��
    @return ɾ���Ƿ�ɹ�
     */
    public boolean delProPlanByTime(Date curDate);
    /*
   @dec�޸Ĵ�������s
   @param promotion��������
   @return �޸��Ƿ�ɹ�
    */
    public boolean updateProPlan(Promotion promotion);
    /*
  @dec��ѯ��������s
  @param conn �Լ���������
  @return �޸��Ƿ�ɹ�
   */
    public LinkedList<Promotion> queryProPlan(String conn);


}
