public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setFlourType(String flourType1) {
        if (flourType1 == null ||
                !flourType1.toLowerCase().equals("white") &&
                        !flourType1.toLowerCase().equals("wholegrain")) {

            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType1;
    }

    private void setBakingTechnique(String bakingTechnique1) {
        if (bakingTechnique1 == null ||
                !bakingTechnique1.toLowerCase().equals("crispy") &&
                        !bakingTechnique1.toLowerCase().equals("chewy") &&
                        !bakingTechnique1.toLowerCase().equals("homemade")) {

            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique1;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException
                    ("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        return this.weight * 2
                * flourCalories(this.flourType)
                * bakingTypeCalories(this.bakingTechnique);
    }

    private double flourCalories(String flour) {
        double cal = 0;
        if (flour.toLowerCase().equals("white")) {
            cal = 1.5;
        } else if (flour.toLowerCase().equals("wholegrain")) {
            cal = 1.0;
        }
        return cal;
    }

    private double bakingTypeCalories(String technique) {
        double cal = 0;
        if (technique.toLowerCase().equals("crispy")) {
            cal = 0.9;
        } else if (technique.toLowerCase().equals("chewy")) {
            cal = 1.1;
        } else if (technique.toLowerCase().equals("homemade")) {
            cal = 1.0;
        }
        return cal;
    }
}
