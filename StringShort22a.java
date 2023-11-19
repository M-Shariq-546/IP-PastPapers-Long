import java.util.StringTokenizer;
import java.util.Scanner;
class StringShort22a{
    
    public static void main(String[] args){
        
        String inp = getString();
        
        TokenizeandReverse(inp);
        
    }
    
    public static String getString()
    {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter String : ");
        
        String string = input.nextLine();
        
        return string;
        
    }
    
    public static void TokenizeandReverse(String inp)
    {
        
        StringTokenizer tk = new StringTokenizer(inp , " ");
        
        String[] tokens = new String[tk.countTokens()];
        
        int idx =0;
        while (tk.hasMoreTokens())
        {
            
            tokens[idx++] = tk.nextToken();
        }
        
        System.out.println("Reverse Order of Tokens : ");
        
        for(int i = tokens.length-1 ; i>=0 ; i--)
        {
            System.out.println(tokens[i]);
        }
        
    }
    
}
