public class Plan {
    TreatmentPlan[] plans=new TreatmentPlan[3];

    void save(TreatmentPlan number){
        for (int i = 0; i < plans.length; i++) {
            if(plans[i]==null){
                plans[i]=number;
                break;
            }
        }
    }
    void info(int i){ plans[i].treat(); }
}
