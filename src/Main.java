
public class Main {
    
    public static void main(String[] args) {
        
        Game game = new Game("PUBG","Battle Royal", 80);
        Gamer gamer = new Gamer("Yunus", "Ergül","123","29.12.1999","ynsergull","456");
        
        Campaign campaign = new Campaign(1, "%50", 50);
        CampaignManager cm = new CampaignManager();
        cm.campaign(campaign, game);
        
        RegisterManager rm = new RegisterManager();
        rm.register(gamer);
        
    }
}
