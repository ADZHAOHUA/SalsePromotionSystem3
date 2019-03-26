import java.util.LinkedList;

public interface BussinessManInterface {
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
    public  boolean login(String account,String password);
    /*
@desc  查询店铺
@return 名下所有的店铺
 */
    public LinkedList<BussinessMan.Store> queryStore();
    /*
@desc  修改店铺
@param storeNo 店铺编号 store 修改后的商铺信息
@return 修改是否成功
*/
    public LinkedList<BussinessMan.Store> queryAddress(int storeNo,BussinessMan.Store store);
    /*
    @desc 查询订单信息
    @return 订单
     */
    public LinkedList<Orders> queryOrder();


}
