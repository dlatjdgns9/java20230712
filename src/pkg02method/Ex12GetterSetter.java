package pkg02method;

public class Ex12GetterSetter {
    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.setPower(true);
        tv.setChannel(19);
        tv.setVolume(20);
        tv.setPower(false);
    }

}

class Tv{
    //encapsulation 은닉성
    private int channel;
    private int volume;
    private boolean power;

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }
}