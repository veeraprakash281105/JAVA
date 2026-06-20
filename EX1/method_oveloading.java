class Add {
    void add(int a,int b)
    {
        int c=a+b;
        System.out.println("Sum of two integers ="+ c);
    }
    void add(int a,int b,int c)
    {
        int d=a+b+c;
        System.out.println("Sum of three integers ="+ d);
    }
    void add(float a,float b)
    {
        float c=a+b;
        System.out.println("Sum of two doubles ="+c);
    }
    public static void main(String[] args) {
        Add m=new Add();
        m.add(4,8);
        m.add(12,8,6);
        m.add(45.6f,7.8f);
    }
}
