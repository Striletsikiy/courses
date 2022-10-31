package java_interfaces_polymorphism.musicians;

public interface Drum {
    default String drum(){
        return "drum: Boooooom Boooom";
    }
}
