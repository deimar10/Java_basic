package Week7;

import java.util.HashMap;

public class PromissoryNote {
    String toWhom;
    String whose;
    double value;
    private HashMap<String, Double> loans;
    public PromissoryNote() {
        this.loans = new HashMap<String, Double>();
    }

    public void setLoan(String toWhom, double value){
        this.loans.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose) {
        double debt = 0;
        for (String name : this.loans.keySet()) {
            if (!whose.equals(name)) {
                return 0.0;
            } else {
                return this.loans.get(whose);
            }
        }
        return debt;
    }
}