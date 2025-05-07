package spakborhills.models;

public class Farm {
    private String farmName;
    private Player player;
    private FarmMap farmMap;
    
    public Farm(String farmName, Player player, FarmMap farmMap){

    }

    public String getFarmName(){
        return farmName;
    }

    public void setFarmName(String farmName){
        this.farmName = farmName;
    }

    public Player getPlayer(){
        return player;
    }

    public void setPlayer(Player player){
        this.player = player;
    }

    public FarmMap getFarmMap(){
        return farmMap;
    }


}
