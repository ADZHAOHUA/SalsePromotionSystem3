import java.util.List;

//地址操作实现接口
public interface AddressDaoInterfface {
    /*
    @desc 删除地址
    @param userno 用户编号 address 地址
    @return 删除是否成功
     */
    public boolean delAddress(int userno,String address);
    /*
  @desc 查询地址
  @param userno 用户编号 address 地址
  @return 是否存在改地址
   */
    public boolean queryAddress(int userno,String address);
    /*
@desc 查询用户的地址
@param userno 用户编号
@return 用户所有地址
 */
    public List<String> queryAddress(int userno);

    /*
@desc 增加用户的地址
@param userno 用户编号 String address更新后的地址
@return 更新是否成功
*/
    public boolean addAddress(int userno,String address);
}
