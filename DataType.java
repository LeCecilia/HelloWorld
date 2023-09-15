public class DataType 
{
    public static void main(String[] args) 
    {
        System.out.println("What's Up") ;
        int i; 
        double f = 2.5;
        boolean flag = true;
        i = 10;
        f += i;
        flag = !flag;
        i++;
        System.out.println(i);
        System.out.println(f);
        System.out.println(flag);
        String str1 = "I am a string";
        String str2 = str1;
        String str3 = "I am also a string";
        boolean stringEquals = str1.equals(str3);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        String [] array = {"Alpha","Bravo","Charlie","Delta","Echo"};
        for (int iterate = 0; iterate < array.length; iterate++) {
            System.out.println(array[iterate]); 
        }
        
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
            System.out.println(""); 
        for (int k = 0; k <array.length; k++) {
            System.out.print(array[k] + "-");
        }
    }
}