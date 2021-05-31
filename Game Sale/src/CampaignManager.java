
public class CampaignManager implements CampaignService{
    
    private double lastPrice;
    
    @Override
    public void campaign(Campaign campaign, Game game) {
        lastPrice = campaign.getDiscountRate()*game.getPrice()/100;
        System.out.println("Kampanya uygulandı.\n"
                +game.getName() +" adlı oyunun yeni fiyatı: " + lastPrice);
    }

      
    

    

}
