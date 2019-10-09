
package org.calvin.__Book.epi.test;

public class TimeoutException extends Exception {
  private TestTimer timer;

  TimeoutException(long durationMs) { timer = new TestTimer(durationMs); }

  TestTimer getTimer() { return timer; }
}
