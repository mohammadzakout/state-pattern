package OrderState;

public class Order {
    
    OrderState orderState ; 

public Order(){
this.orderState = new PacakageingOrder();
}

public void setState(OrderState state){
    this.orderState = state; 
}

public void getCurrentState(){
this.orderState.getStateMessage(this);

}



}


interface OrderState{


    public void getStateMessage(Order order);

}

 class PacakageingOrder implements OrderState {

    @Override
    public void getStateMessage(Order order) {
       // do smothing 

       System.out.println("in pacakage order ");
       order.setState(this);
        
    }

    
} 
class ShippingOrder implements OrderState {

    @Override
    public void getStateMessage(Order order) {

    
       System.out.println("in shipping order ");
       order.setState(this);
        
    }

    
} 
/**
 * InnerOrder
 */
 class Test {
public static void main(String[] args) {

    Order order = new Order();
    order.getCurrentState();

    ShippingOrder shippingOrder = new ShippingOrder();
    order.setState(shippingOrder);
 order.getCurrentState();
    
}
    
}