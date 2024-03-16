class Main {
  private static double run(double a, double b) {
    double nextA = 2 * a * b / (a + b);
    double nextB = Math.sqrt(nextA * b);
    
    if (Math.abs(b - nextB) < 0.0000001) {
      return nextB;
    } else {
      return run(nextA, nextB);
    }
  }

  public static void main(String[] args) {
    double pi = run(2 * Math.sqrt(3), 3);
    System.out.println(pi);
  }
}