public class day5_loops {
  public static void main(String[] args) {
    for(int i=1; i<=10 ;i++){
        System.out.println("02saimani");
    }
    
  }
  public String stringBits(String str) {
    String result = "";
    for(int i = 0;i<str.length();i++){
      if(i%2==0){
        result+=str.charAt(i);
      }
    }
    return result;
  }

  public String stringTimes(String str, int n) {
    String result = "";
    for (int i=1;i<=n;i++){
    result+=str;
  }
  return result;
  }
}
  