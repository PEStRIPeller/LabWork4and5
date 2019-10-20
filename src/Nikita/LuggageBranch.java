package Nikita;

import java.util.ArrayList;


class LuggageBranch {
    ArrayList<LuggageInfo> luggageList;

    public LuggageBranch() {
        this.luggageList = new ArrayList<>();
    }
    public double getWeightSum() {
        double sum = 0;
        for (LuggageInfo luggageInfo : luggageList) {
            sum += luggageInfo.getLuggageWeight();
        }
        return sum;
    }
}