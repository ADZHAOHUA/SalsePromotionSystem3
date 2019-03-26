import java.util.Date;
import java.util.LinkedList;

public interface ManageDaoInterface {
    /*
    @desc 增加顾客信息
    @param 顾客信息
    @return 增加是否成功
     */
    public boolean addUser(User user);

    /*
   @desc 增加商家信息
   @param 商家信息
   @return 增加是否成功
    */
    public boolean addBussinessMan(BussinessMan bussinessMan);

    /*
  @desc 注销用户信息
  @param 用户编号
  @return 注销是否成功
   */
    public boolean delUser(int userNo);

    /*
     @desc 注销商家信息
     @param 商家编号
     @return 注销是否成功
      */
    public boolean delBussinessMan(int userNo);

    /*
     @desc 注销商店信息
     @param  userNo商家编号 storeNo 商店编号
     @return 注销是否成功
      */
    public boolean delStore(int userNo,int storeNo);

    /*
    @desc 审查商店信息
    @param  userNo商家编号 storeNo 商店编号
    @return 审核是否通过
     */
     public boolean examine(int userNo,BussinessMan.Store store);

/*
 @desc  修改商家信息
@param bussinessManNo 要修改的商家编号 Info
 @return  修改是否成功
 */

  public boolean updateBussinessMan(int bussinessManNo,BussinessMan Info);

    /*
   @desc  修改顾客信息
   @param bussinessManNo 要修改的顾客编号 Info
   @return  修改是否成功
   */
    public boolean updateUserInfo(int userNo,User Info);

     /*
   @desc  查询订单
   */
     public  void queryOrder();

     /*
     @desc 下架货物
     @param goodNo 货物编号
     @return 下架是否成功
      */
     public boolean delGood(int goodNo);

    /*
   @desc 查询评论
   @param commentNo 评论编号
   @return 评论
    */
    public Comment queryComment(int commentNo);

    /*
 @desc s删除评论
 @param commentNo 评论编号
 @return 删除是否成功
  */
    public boolean delComment(int commentNo);

/*
@desc查询类别消息
@param kind 类别
@return 是否存在
 */
  public boolean queryKind(String kind);

    /*
 @desc 查询所有类别消息
   */
    public void queryKind();

/*
@desc 增加类别
@param   kind 类别
@return 增加是否成功
 */
public boolean addKind(String kind);

    /*
    @desc 删除类别
    @param  kind 类别
    @return  删除是否成功
     */
    public boolean delKind(String kind);

    /*
@desc 修改类别信息
@param  修改之前 修改之后  修改之后的信息要判断是否有原先存在的消息重复
@return 修改是否成功
 */
    public boolean addKind(String kind,String endKind);

    /*
    @dec增加促销方案s
    @param promotion促销方案
    @return 增加是否成功
     */
    public boolean addProPlan(Promotion promotion);

    /*
    @dec根据编号和删除促销方案s
    @param No 促销方案编号
    @return 删除是否成功
     */
    public boolean delProPlanByNo(int No);
    /*
    @dec根据时间已到删除促销方案
    @param curDate 现在时间
    @return 删除是否成功
     */
    public boolean delProPlanByTime(Date curDate);
    /*
   @dec修改促销方案s
   @param promotion促销方案
   @return 修改是否成功
    */
    public boolean updateProPlan(Promotion promotion);
    /*
  @dec查询促销方案s
  @param conn 自己设置条件
  @return 修改是否成功
   */
    public LinkedList<Promotion> queryProPlan(String conn);


}
