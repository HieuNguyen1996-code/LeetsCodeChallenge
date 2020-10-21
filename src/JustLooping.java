public class JustLooping {
    private int j;
    void showJ(){
        while(j<=5){
            for(int j=1; j <= 5;){
                System.out.print(j+" ");
                j++;
            }
            System.out.println("true");
            j++;
        }
    }
    public static void main(String[] args) {
        new JustLooping().showJ();
    }
}
