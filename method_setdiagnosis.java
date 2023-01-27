void function (int arg0, sempath.xsd.Diagnosis arg1) {
  if ((arg0 < 0) || (arg0 >= _diagnosisList.size())) {
    throw new IndexOutOfBoundsException(
        "srini_string" + arg0 + "srini_string" + 
        ( _diagnosisList . size ( ) - 1 ) + "srini_string" ) ; 
  } 
  _diagnosisList.setElementAt ( arg1 , arg0 ) ; 
}