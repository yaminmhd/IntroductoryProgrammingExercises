public class RightTriangle {
    static private void print(int n){
        String result = "";
        for(int row = 0; row< n; row++){
            for(int col = 0; col<n; col++){
                if(col<=row){
                    result += "*";
                }else{
                    result += " ";
                }
            }
            result += "\n";
        }
        System.out.print(result);
    }
    public static void main(String[] args){
       print(3);
    }
}
