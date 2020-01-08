import java.util.*;
public class Main
{
  public static void main(String[] args) 
    {
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        boolean check = false;
        String[] m = new String[n];
        for(int d = 0 ; d < n ; d++)
        {
            m[d]=scan.next();
        }
        for(int d = 0 ; d < n ; d++)
        {
            if(m[d].contains("OO"))
            {
                check = true;
                System.out.println("YES");
                for(int k = 0 ; k< d ; k++)
                {
                    System.out.println(m[k].substring(0));
                }
                if(m[d].substring(0, 2).contains("OO"))
                {
                    System.out.println("++|"+m[d].substring(3));
                }
                else
                {
                    System.out.println(m[d].substring(0, 2)+"|++");
                }
                for(int k = d+1 ; k< n ; k++)
                {
                    System.out.println(m[k].substring(0));
                }
                break;
            }
        }
        if(check == false)
        {
            System.out.println("NO");
        }
    }
    
}