void function () {
  for (int loc0 = 0; loc0 < waveform.length; loc0++) {
    if (waveform[loc0] < 0) 
        waveform[loc0] * = -1;
  }
}