public class CardBoardTestClass {
    public static void main(String[] args) {

        //Making Object for passing.
        Position position = new Position();

        //Object of Class Delivered
        Delivered delivered = new Delivered();

        //Calling action method and passing above object.
        delivered.State(position);

        System.out.println(position.getPosition().toString());

        System.out.println();

        //Object of Class Dispatched
        Dispatched dispatched = new Dispatched();

        //Calling action method and passing above object.
        dispatched.State(position);
        System.out.println(position.getPosition().toString());
    }
}
