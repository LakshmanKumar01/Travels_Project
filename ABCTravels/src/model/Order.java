package model;

public class Order {
	private Integer orderId;
	private Route route;
	private Journey requestJourneyPlan;
	private Double orderAmount;
	private String orderStatus;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public Journey getRequestJourneyPlan() {
		return requestJourneyPlan;
	}

	public void setRequestJourneyPlan(Journey requestJourneyPlan) {
		this.requestJourneyPlan = requestJourneyPlan;
	}

	public Double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", route=" + route + ", requestJourneyPlan=" + requestJourneyPlan
				+ ", orderAmount=" + orderAmount + ", orderStatus=" + orderStatus + "]";
	}

}
