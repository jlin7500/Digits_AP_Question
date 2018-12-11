import java.util.ArrayList;

public class Digits
{
    private ArrayList<Integer> digitlist;

    public Digits(int num)
    {
        this.digitlist = new ArrayList<Integer>();
        while(num != 0)
        {
            int i = 0;
            digitlist.add(i, num%10);
            num = num/10;
            i++;
        }
    }
    public boolean isStrictlyIncreasing()
    {
        for(int i = 0; i < digitlist.size() - 1;i++)
        {
            if(digitlist.get(i) >= digitlist.get(i+1))
            {
                return false;
            }
        }
        return true;
    }
    public ArrayList<Integer> getDigitlist()
    {
        return digitlist;
    }
}
