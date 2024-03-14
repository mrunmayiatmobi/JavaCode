package GenericExample2;

import java.util.ArrayList;
import java.util.List;

public class BaseBallTeam<T> {
    private final String teamName;
    private List<T> baseBallPlayerList = new ArrayList<>();
    private int totalLossGame;
    private int totalWinGame;
    private int totalTieGame;
    private int rankOfTeam;


    public BaseBallTeam(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember(T baseBallPlayer){
        if(!baseBallPlayerList.contains(baseBallPlayer)){
            baseBallPlayerList.add(baseBallPlayer);
        }
    }

    public void listTeamMembers(){
        System.out.println(teamName+"Roaster:");
        System.out.println(baseBallPlayerList);
    }

    public int ranking(){
        return (totalLossGame*2)+totalTieGame+1;
    }
    public String setScore(int ourScore,int theirScore){
        String message = "lost to";
        if(ourScore>theirScore){
            totalWinGame++;
            message="beat";
        }else if(ourScore==theirScore){
            totalTieGame++;
            message="tied";
        }else {
            totalLossGame++;
        }
        return message;
    }

    @Override
    public String toString() {
        return teamName + "(ranked" + ranking() + ")";
    }

    public String getname() {
       return this.teamName;
    }
}
