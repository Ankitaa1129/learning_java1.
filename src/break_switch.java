public class break_switch {
    public static void main(String[] args){
        for(int i=0;i<=5;i++){
            System.out.println(i);
            System.out.println("i love you");
            if(i==3){
                System.out.println("end this code");
                break;
            }

        }

        for(int i=0;i<=5;i++) {
            if (i == 4) {
                System.out.println("skip this code");
                continue;
            }
            System.out.println(i);
            System.out.println("i love you more more");
        }

    }


}
