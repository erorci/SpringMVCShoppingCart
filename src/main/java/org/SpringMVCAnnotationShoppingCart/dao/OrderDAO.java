package org.SpringMVCAnnotationShoppingCart.dao;

import java.util.List;

import org.SpringMVCAnnotationShoppingCart.model.CartInfo;
import org.SpringMVCAnnotationShoppingCart.model.OrderDetailInfo;
import org.SpringMVCAnnotationShoppingCart.model.OrderInfo;
import org.SpringMVCAnnotationShoppingCart.model.PaginationResult;


public interface OrderDAO {
 
    public void saveOrder(CartInfo cartInfo);
 
    public PaginationResult<OrderInfo> listOrderInfo(int page,
            int maxResult, int maxNavigationPage);
    
    public OrderInfo getOrderInfo(String orderId);
    
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
 
}