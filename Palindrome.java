Public class Palindrome{
  public static void main(String[]args){
    if(args.length=0){
        system.out.println("Please provide a word to check!")
        return;
    }
  }
   string word=args[0];
   if(isPalindrome(word)){
    System.out.println(word+"is a palindrome!");
   }else{
     system.out.println(word+"is not a palindrome!");
   }
}
public static boolean isPalindrome(String str){
  string reversed=new StringBuilder(str).reverse().toString();
  return str.equalsIgnoreCase(reversed);
  }
  