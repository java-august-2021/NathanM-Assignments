
public interface Ringable {
    // your code here

    //failed with static/abstract method... must use default

    public default String ring(){
        return "Ring Ring Ring!";
    }

    public default String unlock(){
        return "Phone unlocked";
    }
}

