package com.jiudian.manage.service;

public interface OrderService {
    /**
     * 增加订单
     * @param householdname
     * @param id
     * @param starttime
     * @param endtime
     * @param roomid
     * @param userid
     * @return
     */
    public boolean addOrder(String householdname, String id, String starttime, String endtime, int roomid, int userid);

    /**
     * 删除订单
     * @param orderid
     * @return
     */
    public boolean DelOrder(int orderid);

}
