public class Word {
    private String who=null;
    private String speak=null;

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public void print(){
        System.out.println(this.getWho()+"说:"+this.getSpeak());
    }
}
