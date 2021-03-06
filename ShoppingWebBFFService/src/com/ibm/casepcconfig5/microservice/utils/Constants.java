package com.ibm.casepcconfig5.microservice.utils;

public class Constants {
	public final static String CUSTOMER_URL = "http://customerorderservice:9080/CustomerOrderService/Customer";
	public final static String CUSTOMER_ADDRESS_URL = "http://customerorderservice:9080/CustomerOrderService/Customer/Address";
	public final static String CUSTOMER_ADDRESS_OPENORDER_LINEITEM_URL = "http://customerorderservice:9080/CustomerOrderService/Customer/OpenOrder/LineItem";
	public final static String CUSTOMER_ADDRESS_OPENORDER_LINEITEM_ID_URL = "http://customerorderservice:9080/CustomerOrderService/Customer/OpenOrder/LineItem/";
	public final static String PRODUCT_URL = "http://customerorderservice:9080/CustomerOrderService/Product";
	public final static String CUSTOMER_OPENORDER_URL = "http://customerorderservice:9080/CustomerOrderService/Customer/OpenOrder";
	public final static String CUSTOMER_ORDERS_URL = "http://customerorderservice:9080/CustomerOrderService/Customer/Orders";
	public final static String CUSTOMER_TYPEFORM_URL = "http://customerorderservice:9080/CustomerOrderService/Customer/TypeForm";
	public final static String CUSTOMER_INFO_URL = "http://customerorderservice:9080/CustomerOrderService/Customer/Info";
	
	public final static String PRODUCT_ID_URL = "http://productsearchservice:9080/ProductSearchService/Product/";
	public final static String CATEGORY_URL = "http://productsearchservice:9080/ProductSearchService/Category/";
	public final static String CATEGORY_ID_URL = "http://productsearchservice:9080/ProductSearchService/Category/";
	public final static String PRODUCT_CATEGORY_ID_URL = "http://productsearchservice:9080/ProductSearchService/Product/?categoryId=";
	
	public final static String CUSTOMER_RESPONSE = "{\"householdSize\":6,\"frequentCustomer\":true,\"orders\":null,\"openOrder\":{\"lineitems\":[{\"orderId\":13,\"productId\":1,\"quantity\":1,\"amount\":29.99,\"product\":{\"id\":1,\"name\":\"Return of the Jedi\",\"price\":29.99,\"description\":\"Episode 6, Luke has the final confrontation with his father!\",\"image\":\"images/Return.jpg\"}},{\"orderId\":13,\"productId\":3,\"quantity\":1,\"amount\":29.99,\"product\":{\"id\":3,\"name\":\"New Hope\",\"price\":29.99,\"description\":\"Episode 4, after years of oppression, a band of rebels fight for freedom\",\"image\":\"images/NewHope.jpg\"}},{\"orderId\":13,\"productId\":10,\"quantity\":1,\"amount\":100.00,\"product\":{\"id\":10,\"name\":\"DVD Player\",\"price\":100.00,\"description\":\"This Sony Player has crystal clear picture\",\"image\":\"images/Player.jpg\"}}],\"orderId\":13,\"total\":159.98,\"status\":\"OPEN\",\"submittedTime\":null},\"address\":{\"addressLine1\":\"222 2nd street\",\"addressLine2\":\"Apt 2\",\"city\":\"Leonia\",\"state\":\"NJ\",\"country\":\"USA\",\"zip\":\"07605\"},\"name\":\"Roland Barcia\",\"type\":\"RESIDENTIAL\"}";
}
