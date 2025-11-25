class MenuItem{
    private int Id;
    private String  name;
    private double  price;
    public MenuItem(int Id,String name,double price){
        this.price=price;
        this.Id=Id;
        this.name=name;
    }
    public void getId(){
        System.out.print("ID : "+Id); 
        System.out.println();
    }
    public void getName(){
        System.out.print("Name : "+name);
        System.out.println();
    }
    public void getPrice(){
        System.out.print("Price : "+price);
        System.out.println();
    }
}