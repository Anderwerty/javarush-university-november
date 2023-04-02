package com.javarush.module3.lesson16_17.templatemethod;

public class Example1 {
    public static void main(String[] args) {

    }


}

class B1 extends B {

    @Override
    protected void provideLogic() {
        // B1
    }
}

class B2 extends B {

    @Override
    protected void provideLogic() {
        //B2
    }
}

abstract class B {
    public void save() {
        getConnection();

        provideLogic();

        closeConnection();
    }

    protected abstract void provideLogic();

    private void getConnection() {
      //....
    }

    private void closeConnection(){
     //...
    }
}

class BNotRight{
    public void getConnection() {
        //....
    }

    public void closeConnection(){
        //...
    }
}

class B1NotRight extends BNotRight{
    public void save(){
        getConnection();
        //...
        closeConnection();
    }
}
