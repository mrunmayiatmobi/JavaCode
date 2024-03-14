package GenericExmple;

record BaseBallPlayer(String name,String position){

}
public class Main {
    public static void main(String[] args) {
        BaseBallTeam india = new BaseBallTeam("India Team");
        BaseBallTeam australia = new BaseBallTeam("Australia Team");

        setScore(india,10,australia,1);


        //now add team player:
        BaseBallPlayer player1 = new BaseBallPlayer("B Harper","right fielder");
        BaseBallPlayer player2 = new BaseBallPlayer("B Marhs","right fielder");
        BaseBallPlayer player3 = new BaseBallPlayer("B max","left fielder");

        india.addTeamMember(player1);
        india.addTeamMember(player2);
        india.addTeamMember(player3);
        india.listTeamMembers();
    }

    private static void setScore(BaseBallTeam team1, int scoreOfTeam1, BaseBallTeam team2, int scoreOfTeam2) {
        String message = team1.setScore(scoreOfTeam1,scoreOfTeam2);
        team2.setScore(scoreOfTeam2,scoreOfTeam1);
//        System.out.println(team1.getname()+" " + message +" "+ team2.getname());
        System.out.println(team1+" " + message +" "+ team2);

    }
}
