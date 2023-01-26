void function () {
  Rectangle loc0 = view.getBounds();
  for (Explorer loc1: explorers) {
    loc1.getJComponent().setBounds(loc0);
    loc1.reformView();
  }
  view.revalidate();
  view.repaint();
}