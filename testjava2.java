import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


class Human {
     static int world;
    String name;
    int age;
    float height;
    float  weight;
    public Human(String name,int age,Float height,float weight)
    {
        this.name = name;
        this.age=age;
        this.height=height;
        this.weight=weight;
    }
    public void showStats()
    {
        System.out.println("name = "+name+", age = "+age+", height = "+height+", weight = "+weight);
    }
    public static void changeWorld(int newworld)
    {
        world=newworld;
    }
}
class Male extends Human{
    public Male(String name,int age,float height,float weight)
    {
        super(name,age,height,weight);
    }
    @Override
    public void showStats()
    {
        super.showStats();
        System.out.println("and i'm male");
    }
}
class Female extends Human{
    int cookingSkill;
    int houseSkill;
    int washingSkill;
    int readingSkill;
    public Female(String name,int age,float height,float weight)
    {
        super(name,age,height,weight);
        
    }
    @Override
    public void showStats()
    {
        super.showStats();
        System.out.println("and i'm female");
    }
}

public class testjava2 {
 public static int fibo(int num)
{
    if(num<=1)return num;

    return fibo(num-2)+fibo(num-1);
}

public static void checkPrime(int num)
{
    for(int i=2;i<10;i++)
    {
        if(num%i==0&&num!=i)
        {
            System.out.println(num +" isn't prime number.");
            return;
        }
    }
    System.out.println(num+ " is prime number.");
}
public static void trim(String sentence)
{
    String result=" ";
    for(int i=0;i<sentence.length();i++){
        if(sentence.charAt(i)!=' ')
        {
            result+=sentence.charAt(i);
        }
    }
    System.out.println(sentence+" after trim : "+result);
}
public static void findIndexOfWord(String sentence,String word)
{
    boolean check=false;
    int j=0;
    for(int i=0;i<=sentence.length()-word.length();i++)
    {
        for(;j<word.length()-1;j++)
        {
            if(word.charAt(j)!=sentence.charAt(i+j))
            {
                break;
            }
        }
        if(j==word.length()-1)System.out.println("Found at index : "+i);
    }
}
public static void bubbleSort(int[] num)
{
    int temp;
    for(int i=0;i<num.length;i++)
    {
        for(int j=0;j<num.length-i-1;j++)
        {
            if(num[j]>num[j+1])
            {
                temp = num[j];
                num[j]=num[j+1];
                num[j+1]=temp;
            }
        }
    }
    System.out.println(Arrays.toString(num));
}

    public static void main(String[] args) {
        int[] test = {1,2,3,1,0};
        bubbleSort(test);
        checkPrime(13);
        findIndexOfWord("hello wolrd", "wolrd");
        trim("hello world 555 666     777");
        System.out.println("fibo : "+ fibo(10));
        // List<Human> humans = new ArrayList<Human>();
        // Human test = new Male("dad",16,130,23);
        // test.changeWorld(2);
        // humans.add(new Male("tong",16,170,60));
        // humans.add(new Female("jane",17,160,53));
        // for (Human human : humans) {
        //     human.showStats();
        //     System.out.println(human.world);
        // }
       // System.out.println(mygirl.name);
    }
}