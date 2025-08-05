class Decision_Making_Stat
{
    public static void main(String args[])
    {
        int x=9;
        if(x==5)
        {
            System.out.println("Value of x is:"+x);
        }
        else
        {
            System.out.println("Value of x :"+x);
        }


        int age=16;
        if(age>=18)
        {
            System.out.println("Eligible for voting!");
        }
        else{
            System.out.println("Not eligible for voting!");
        }
       

       //nested if else stat
       String username="pawarkomal110804";
       String password="gnp@141208";
       if(username=="pawarkomal110804")
       {
        if(password=="gnp@141206")
        {
            System.out.println("Login Successful !");
        }
        else{
            System.out.println("Invalid Password !");
        }
       }
       else{
        if(password=="gnp@141206")
        {
             System.out.println("Invalid Username !");
        }
        else{
            System.out.println("Invalid ID and Password");
        }
       }
    }
}