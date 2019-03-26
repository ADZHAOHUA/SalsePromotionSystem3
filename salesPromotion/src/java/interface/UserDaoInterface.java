import java.util.LinkedList;

public interface UserDaoInterface {
    /*
    @desc   找回密码
    @param password 新密码
    @return 找回密码是否成功
     */
    public  boolean findPassword(String password);
    /*
    @desc  登录
    @param account 账号
     @param password 密码
    @return 登录是否成功
     */
    public  boolean  login(String account,String password);
    /*
   @desc  查询收货地址
   @return 收货地址
    */
    public LinkedList<String>  queryAddress();
    /*
    @desc  查询收藏夹
   @return 收藏夹
    */

    public LinkedList<FavoriteMapper.favotite>  queryFavorite();
     /*
    @desc  查询评论
   @return 评论
    */

    public LinkedList<Comment.CommentInfo>  queryComment();

     /*
    @desc  查询评论
    @param info 要查询的商家或者货物
   @return 评论
    */
    public LinkedList<Comment.CommentInfo>  queryComment(String info);

    /*
 @desc  查询货物所在的商店信息
 @param info 货物描述 名称
   @return 商店信息
     */
    public LinkedList<BussinessMan.Store> queryStore(String info);
    /*
    @desc 查询订单
    @return  订单记录
     */
    public LinkedList<Orders> queryItem();
    /*
    @desc 查询个人信息
    @return 个人信息
     */
    public User queryInfo();
     /*
     @desc 更新用户
     @param newuser 新的用户信息
     @return true 更新成功 false 更新失败
      */
    public boolean updateUser(User newuser);


}
