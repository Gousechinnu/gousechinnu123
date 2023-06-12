public class chinnu {
    static void bill (double listedmeaslsprice, double taxRate, double tipRate) {
        double tax=taxRate*listedmeaslsprice;
        double tip=tipRate*listedmeaslsprice;
        double reslut=listedmeaslsprice+tax+tip;
        System.out.println("these is final " + reslut);

    }

    public static void main(String[] args) {
        bill (6.98,8.8,7.9);


    }
}

// these is the functions concepts