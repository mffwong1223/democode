void function (List < Shape > arg0, Color arg1, StringBuilder arg2) {
  arg0.forEach(shape -> {
    arg2.append(shape);
    shape.setColor(arg1);
  });
}