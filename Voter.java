import java.util.HashMap;
import java.util.Scanner;

/**
 * @author kweku Quansah and Caleb Otchi
 * @version 1.0
 * since 2021-03-13
 */
public class Voter extends Person {
    // instance variables
    private int VoterIdNumber;

    // constructor

    public Voter(String name, int age, String placeOfBirth, int idNumber, int voterIdNumber) {
        super(name, age, placeOfBirth, idNumber); // inherit Person class attribute
        this.VoterIdNumber = getIDNumber();

    }
    // creating getter and setter methods

    /**
     * @return VoterIdNumber
     */
    public int getVoterIdNumber() {
        return VoterIdNumber;
    }

    /**
     * @param voterIdNumber
     */
    public void setVoterIdNumber(int voterIdNumber) {
        VoterIdNumber = voterIdNumber;
    }

    // Auxiliary Method to take count of vote
    public void ballotCount() {
        int NPP = 0;
        int CPP = 0;
        int NDC = 0;

        // taking input form voter
        Scanner myObj = new Scanner(System.in);
        try {

            for (int i = 0; i < 10; ++i) {

                System.out.println("Enter Please enter preferred party /n NPP IS 1    /n CPP is 2   /n NDC is 3");

                // int input
                int number = myObj.nextInt();
                if (number == 1) {
                    ++NPP;

                }
                if (number == 2) {

                    ++CPP;
                }
                if (number == 3) {

                    ++NDC;

                }

            }
        } catch (Exception e) {
            System.out.println("there is a problem with your input please try again");
            ballotCount();
        }
        HashMap<String, Integer> parties = new HashMap<String, Integer>();
        parties.put("NPP", NPP);
        parties.put("NDC", CPP);
        parties.put("CPP", NDC);

        System.out.println("Result for NPP :" + parties.get("NPP"));
        System.out.println("Results for NDC :" + parties.get("NDC"));
        System.out.println("Results For CPP :" + parties.get("CPP"));

    }

    public static void main(String args[]) {
        // creating object form the Voter class
        Voter a = new Voter("Kwame Ansah", 67, "Osu", 02233244, 11123253);
        a.setAge(100);
        // System.out.print();
        a.ballotCount();

        System.out.println(a.getAge());
    }

}
