package _3_working_with_abstractions.Hotel_Reservation;

public class PriceCalculator {
    private double perDay;
    private int days;
    private String season;
    private String discountType;


    public  PriceCalculator(){
    }

    public void calculate (double perDay, int days
            , String  season, String discountType){
        double price = perDay*days;
        Discount discount = Discount.valueOf(discountType);
        price =  dependsFromTheSeason(price, season);
        price =  price-(price*discount.getValue()/100);
        System.out.printf("%.2f",price);

    }
    public enum Discount {

        None(0), SecondVisit(10), VIP(20);

        private int value;
        Discount(int value) {
            this.value = value;
        }
        public int getValue() {
            return this.value;
        }
    }

    private double discount(double price, String discountType) {
                switch (discountType){
                    case "VIP":
                    price = price*0.8;
                        break;
                    case "SecondVisit":
                        price = price*0.9;
                        break;
                    case "None":
                    price = price;
                        break;
                }
                return price;
    }

    private double dependsFromTheSeason(double price, String season) {
            switch (season){
                case "Autumn":
                    price *= 1;
                    break;
                case "Spring":
                    price *= 2;
                    break;
                case "Winter":
                    price *= 3;
                    break;
                case "Summer":
                    price *= 4;
                    break;
            }
            return price;
    }


    // public  priceDependsOfTheSeason





}
