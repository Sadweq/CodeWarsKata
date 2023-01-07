public class CodeTheString {

    public static String StartCoding(String str){
        String coded="";
        int count=1;
        String[] SplittedString=str.split("");
        for (int i = 1; i<SplittedString.length; i++){
            if (SplittedString[i-1].equals(SplittedString[i])){
                count++;
            }else{
                coded=coded+count+SplittedString[i-1];
                count=1;
            }
        }
        coded=coded+count+SplittedString[SplittedString.length-1];

        System.out.println(coded);

        return coded;
    }

    public static void main(String[] args) {
    StartCoding("a");
    }
}
