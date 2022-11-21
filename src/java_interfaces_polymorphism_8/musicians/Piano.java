package java_interfaces_polymorphism_8.musicians;

public interface Piano {
    default String piano(){
        return "piano: pi pi pi";
    }
}
