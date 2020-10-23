package id.raihan.Pertemuan2.Tugas.No1_Overloading;

public class DemoClub {
    public static void main(String[] args) {
        Club club1 = new Club();
        Club club2 = new Club("Manchester United");
        Club club3 = new Club("Chelsea", "sebuah klub sepak bola Inggris yang bermarkas di Fulham, London");
        Club club4 = new Club("Liverpool", 1892, "Anfield");
        Club club5 = new Club("Real Madrid", 1902, "Santiago Bernabeu", 13, "sebuah klub sepak bola profesional yang berbasis di Madrid, Spanyol");

        club1.getTeam();
        club2.getTeam();
        club3.getTeam();
        club4.getTeam();
        club5.getTeam();
    }
}
