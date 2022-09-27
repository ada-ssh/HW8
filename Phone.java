public class Phone {

    String number;
    String model;

    String name = "default";

    {
        number = "Non a number";
        model = "Test-phone";
        weight = 100;
    }
    int weight;

    Phone(){}

    Phone (String number, String model, int weight){
        this(number, model);
        this.weight = weight;
    }

    Phone (String number, String model){
        this.number = number;
        this.model = model;
    }

    void receiveCall(Phone phone){
        System.out.println("call " + phone.getNumber());
    }
    void receiveCall(String number, String name){
        System.out.println("call " + number);
        System.out.println(name);
    }
    String getNumber(){
        return number;
    }
    String getName(){
        return name;
    }
    void sendMessage(Phone ...numbers){
        for(Phone item: numbers){
            System.out.println("SMS to " + item.getNumber());
        }
        System.out.println();
    }
}
