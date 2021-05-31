
public class RegisterManager implements Register{

    @Override
    public void register(Gamer gamer) {
        System.out.println(gamer.getName()+ " adlı oyuncu kayıt oldu.");
    }
    
}
