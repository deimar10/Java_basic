package week8;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex9 {
    public static void main(String[] args) {
        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "b WQ-431");

        ArrayList<RegistrationPlate> arrayList = new ArrayList<RegistrationPlate>();
        arrayList.add(reg1);
        arrayList.add(reg2);
        arrayList.add(reg3);

        HashMap<RegistrationPlate, String> owner = new HashMap<RegistrationPlate, String>();
        owner.put(reg1, "Jurgen");
        owner.put(reg3, "Ahto");

        System.out.println("Owners:");
        System.out.println(owner.get(new RegistrationPlate("FI", "ABC-123")));
        System.out.println(owner.get(new RegistrationPlate("D", "B WQ-431")));
    }
}
