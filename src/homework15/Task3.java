package homework15;
/*3) Create a method that will print whether given String is palindrome or not. */
public class Task3 {
    void isPalindrome(String str){

        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String reversedStr=st.toString();
        if (str.equalsIgnoreCase(reversedStr)){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+" Not is palindrome");
        }

    }

}