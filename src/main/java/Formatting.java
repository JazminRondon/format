public class Formatting {
    public static String printTotal(String product, int qty, double price, float miles) {
     //   String dashes;
        double fee;
      //  dashes= "-------";
       // product= "Rice";

        double total = qty * price;
        if (miles <= 4) {
            fee = 2.0f;
            total = total + fee;
        } else if (miles > 4 && miles <= 15) {
            fee = 5.0f;
            total = total + fee;
        } else if (miles > 15 && miles <= 25) {
            fee = 10.0f;
            total = total + fee;
        } else if (miles > 25 && miles <= 50) {
            fee = 15.0f;
            total = total + fee;
        } else {
            fee = 20.0f;
            total = total + fee;
        }
   //     return total;
        String item= String.format("%7s %3s %5s %5s %5s", "Product","Qty","Price","Miles","Total");
        String dashes=String.format("\n------ ---- ----  ----- ------");
        String results= String.format("\n%4s %5d %4.1f %6.1f %7.1f", product, qty, price,miles, total);
        return item + dashes+ results+"\n          Thank you! Come Again";
    }


    public static void main(String[] args) {


        System.out.println(printTotal("Rice",20,5,10));

    }
}

//https://www.youtube.com/watch?v=M3LZlg_ggA4