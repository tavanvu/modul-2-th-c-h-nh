package BT;public class songuenmotrram {

    public static int sum(int i1,int i2) {
        int result=0;
        for (int i =0;i1<i2;i++){
            result+=i;
        }
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,10));
        System.out.println(sum(20,37));
        System.out.println(sum(35,49));

    }
}
