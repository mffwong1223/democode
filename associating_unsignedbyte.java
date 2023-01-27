void function (byte arg0, String arg1) {
  int loc0 = arg0 & 0xFF;
  list.add(loc0, arg1);
  map.put(arg1, arg0);
}