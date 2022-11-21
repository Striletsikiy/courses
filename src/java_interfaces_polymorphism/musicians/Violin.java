package java_interfaces_polymorphism.musicians;

public interface Violin {
    default String violin(){
        return "violin: eeeeee";
    }
}
