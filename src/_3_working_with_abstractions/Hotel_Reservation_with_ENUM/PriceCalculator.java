package _3_working_with_abstractions.Hotel_Reservation_with_ENUM;

public class PriceCalculator {

        private double perDay;
        private int days;
        private String season;
        private String discountType;


        public  PriceCalculator(double perDay, int days
                , String  season, String discountType){
            this.perDay = perDay;
            this.days = days;
            this.season = season;
            this.discountType = discountType;
        }

        public void calculate (){

            Discount discount = Discount.valueOf(discountType);
            SeasonDepends seasonIncrease = SeasonDepends.valueOf(season);

            double price =this.perDay*this.days*seasonIncrease.getIndex()*discount.getValue();
            System.out.printf("%.2f",price);

        }
        public enum SeasonDepends {
            Autumn(1), Spring(2), Winter(3),Summer(4) ;

            public int index;

            SeasonDepends(int index){
                this.index = index;
            }
            public int getIndex(){
                return this.index;
            }
        }
        public enum Discount {

            None(1), SecondVisit(0.90), VIP(0.80);

            private double value;

            Discount(double value) {
                this.value = value;
            }
            public double getValue() {
                return this.value;
            }
        }
}
