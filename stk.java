public class stk
{
    int[] arr=new int[100];
    int top=-1;
    public void push(int n)
    {
        System.out.println("================ push ================");
        if (top>=100) 
        {
        System.out.println("Stack is over flow");    
        } else {
            top++;
            arr[top]=n;
        }
    }
    public int pop()
    {
        System.out.println("================ pop ================");
        if(top<0)
        {
            System.out.println("Stack is under flow");
        }
        
        return arr[top--];
    }
    public int peek()
    {
        // int temp;
        // temp=arr[top];
        System.out.println("================ peek ================");
        if(top<0)
        {
            System.out.println("Stack is under flow");
        }
    
        return arr[top];
    }
    public void change(int a,int x)
    {
        System.out.println("================ change ================");
        arr[--a]=x;
    }
    public void display()
    {
        System.out.println("================ diplay ================");
        for (int i =0;i<=top;i++) 
        {
            System.out.println(arr[i]);
        }
    }
}