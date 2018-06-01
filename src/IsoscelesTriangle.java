public class IsoscelesTriangle {
    private static void print(int n){
        String result = "";
        for(int row=0; row< n; row++){
            for(int col=0; col<(n*2)-1; col++){
                int middle = (int) (Math.floor(((n*2)-1) / 2));
                if(middle - row <= col && middle + row >= col){
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
