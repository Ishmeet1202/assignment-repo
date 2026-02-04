package javamodule.BeyondJavaEight.Question8;

enum OrderStatus {
    PENDING,
    PROCESSING,
    SHIPPED,
    DELIVERED,
    CANCELLED,
    REFUNDED
}

public class OrderService {
    public static String processOrderStatus(OrderStatus status) {
        return switch (status) {

            case PENDING -> "Order is awaiting confirmation.";

            case PROCESSING -> {
                String message = "Order is being prepared.";
                yield message;
            }

            case SHIPPED -> "Order has been dispatched.";

            case DELIVERED -> "Order has been successfully delivered.";

            case CANCELLED -> "Order has been canceled.";

            case REFUNDED -> "Refund has been issued for the order.";
        };
    }

    public static void main(String[] args) {
        String message1 = processOrderStatus(OrderStatus.PROCESSING);
        String message2 = processOrderStatus(OrderStatus.CANCELLED);

        System.out.println(message1);
        System.out.println(message2);
    }
}

