package java_interfaces_polymorphism_8.musicians;

public interface Drum {
    default String drum(){
        return "drum: Boooooom Boooom";
    }
}
