package nextstep.ladder.src;

public class Bridge {
  private final boolean isBridge;

  public Bridge(boolean isBridge) {
    this.isBridge = isBridge;
  }

  public Bridge(MakeBridge makeBridge) {
    this.isBridge = makeBridge.make();
  }

  public boolean isBridge() {
    return isBridge;
  }
}
