public class CodeChecker {
    private int minLength=6;
    private int maxLength=20;
    private String stringNotAllowed;
    
    public CodeChecker(int minLength,int maxLength, String s)
    {
        this.minLength=minLength;
        this.maxLength=maxLength;
        this.stringNotAllowed=s;
    }
    
    public CodeChecker(String s)
    {
        this.stringNotAllowed=s;
    }
    

    public boolean isValid(String codeWord)
    {
        if (codeWord.length() >= minLength && codeWord.length() <= maxLength)
        {
            if (!codeWord.contains(stringNotAllowed))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    
   public static void main(String args[]) {
      CodeChecker a = new CodeChecker("$");
      System.out.println(a.isValid("Secret$Code"));
    }
}
