package java_interfaces_polymorphism.musicians;

public interface Piano {
    default String piano(){
        return "piano: pi pi pi";
    }
}
