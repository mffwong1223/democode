boolean function (OrderBook arg0) {
  Date loc0 = new Date();
  if (this != null && arg0 != null) {
    OrderBook loc1 = new
    OrderBook(loc0, this.getAsks(), this.getBids());
    OrderBook loc2 = new OrderBook(loc0, arg0.getAsks(), arg0.getBids());
    return loc1.equals(loc2);
  } else {
    return this.equals(arg0);
  }
}
