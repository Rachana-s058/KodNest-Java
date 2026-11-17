class CreateThread{
    public static void main(String[] args) {
      Thread t1 = Thread.currentThread();
      System.out.println(t1);
      t1.setName("Rachana");
      System.out.println("t1");
      t1.setPriority(7);
      System.out.println(t1);
      t1.setPriority(Thread.MAX_PRIORITY);
      System.out.println(t1);
      t1.setPriority(Thread.MIN_PRIOITY);
      System.out.println(t1);
      System.out.println(t1.getName());
      System.out.println(t1.getPriority());
      System.out.println(t1.getClass());  
    }
}