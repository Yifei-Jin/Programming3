public class Calculator {
    private double total;

    public Calculator (double initial)
    {
        total=initial;
    }

    public void Add(double inputnumber)
    {
        total += inputnumber;
        System.out.println("Result is :"+ total);
    }
    public void Sub(double inputnumber)
    {
        total -= inputnumber;
        System.out.println("Result is :"+ total);
    }
    public void Multi(double inputnumber)
    {
        total = total * inputnumber;
        System.out.println("Result is :"+ total);
    }
    public void Div(double inputnumber)
    {
        total = total/inputnumber;
        System.out.println("Result is :"+ total);
    }
    public void Sqrroot()
    {
        total = Math.sqrt(total);
        System.out.println("Result is :"+ total);
    }
}
