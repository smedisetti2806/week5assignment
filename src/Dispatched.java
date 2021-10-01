public class Dispatched implements State{

    @Override
    public void State(Position position) {
        System.out.println("CardBoard Parcel is ");
        position.setPosition(this);
    }

    @Override
    public String toString(){
        return "<<<Dispatched>>>";
    }
}
