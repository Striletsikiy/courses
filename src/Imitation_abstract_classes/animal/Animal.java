package Imitation_abstract_classes.animal;

public abstract class Animal {
    private String eat;
    private String speak;
    private int toRun;
    private int sleep;

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    public int getToRun() {
        return toRun;
    }

    public void setToRun(int toRun) {
        this.toRun = toRun;
    }

    public int getSleep() {
        return sleep;
    }

    public void setSleep(int sleep) {
        this.sleep = sleep;
    }

    public abstract void setSpeak();
    public abstract void setEat();
    public abstract void setToRun();
    public abstract void setSleep();


}
