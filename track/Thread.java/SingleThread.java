class SingleThread {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a: ");
       int a = scan.nextInt();

       System.out.println("Enter first number: ");
       int n1 = scan.nextInt();
       System.out.println("Enter second number: ");
       int n2 = scan.nextInt();
       int res = n1+n2;
       System.out.println("Addition result is: " +res); 
    }
}