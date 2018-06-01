public class Diamond {
    private static void print(int n){
        String result = "";
        int middle = (int) (Math.floor(((n*2)-1) / 2));

        for(int row=0; row<n-1; row++){
            for(int col=0; col<(n*2)-1; col++){
                if(middle - row <= col && middle + row >= col){
                    result += "*";
                }else{
                    result += " ";
                }
            }
            result += "\n";
        }

        for(int row= n-1; row>=0; row--){
            for(int col=0; col<(n*2)-1; col++){
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
