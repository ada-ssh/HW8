public class Patient extends TreatmentPlan {
    String patient;
    int numberPlan;
    Surgeon a = new Surgeon();
    Dentist b = new Dentist();
    Therapist c = new Therapist();

    public Patient(String patient, int numberPlan) {
        this.patient = patient;
        this.numberPlan = numberPlan;
    }

    @Override
    void treat() {
        if(numberPlan == 1)
            System.out.println(a.getTreat1());
        if(numberPlan == 2)
            System.out.println(b.getTreat2());
        if(numberPlan >= 3)
            System.out.println(c.getTreat3());
    }
}
