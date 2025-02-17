public class Test {

    public static void main(String[] args) {
        String result="Total is 45";
        //I want to increase 5 total (The String should be "Total is 50")

        String newResult= result.substring(0,result.lastIndexOf(" "))+(Integer.parseInt(result.substring(result.lastIndexOf(" ")))+5);
        // result.substring(0,result.lastIndexOf(" "))= Total is 
        // Integer.parseInt(result.substring(result.lastIndexOf(" ")))=45
        // result.substring(result.lastIndexOf(" "))="45"
        System.out.println(newResult);

    }
}
