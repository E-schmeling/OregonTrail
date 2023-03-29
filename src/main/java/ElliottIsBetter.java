public class ElliottIsBetter {

    public static void main(String[] args){
        int players = 9;
        String result = (players==11)? "baseball" : ((players==9) ? "footie" : "darts");
        System.out.println(result);
        players = 10;
        result = (players==11)? "baseball" : ((players==9) ? "footie" : "darts");
        System.out.println(result);
    }
}
