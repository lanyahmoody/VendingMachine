public class VendingMachine {

    private String color;
    private String shape;
    private double size;
    private int row;
    private int column;

    public VendingMachine(int row,int column) {
    }
    public void addProduct(int row, int column, String productName){

    }

    public static void main(String args[]) {
        System.out.println("Welcome to the Vending Machine");

        VendingMachine vendingMachine = new VendingMachine(6, 6);


        vendingMachine.addProduct(0,0,"Soda");
    }
}
