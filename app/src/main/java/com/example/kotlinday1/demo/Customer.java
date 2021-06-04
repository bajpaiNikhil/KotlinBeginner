package com.capgemini.kotlinproject.demo;



class Customer {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean is(){
        return firstName.isEmpty();
    }

    public int as(){
        return 100;
    }

    public String firstNameUppered(){
        return firstName;
    }

    public Animal doOperation(){

        Animal dog = new Animal("brown", 4);
        if(dog.getEyeColor() == "brown"){
            dog.setNoOfLegs(2);
        }
        else {
            dog.setNoOfLegs(4);
        }



        JavaInteropKt.setCounter(20);
        int result = 10 * JavaInteropKt.getCounter();
        JavaInteropKt.log();
     //   return result;
        return dog;
    }
}
