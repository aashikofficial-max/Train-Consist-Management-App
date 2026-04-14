import java.util.*;

public class TrainService {

    private List<GoodsBogie> goodsBogies = new ArrayList<>();

    // Add bogie to system
    public void addGoodsBogie(GoodsBogie bogie) {
        goodsBogies.add(bogie);
    }

    // Assign cargo to all bogies
    public void assignCargoToAll(String cargo) {

        for (GoodsBogie bogie : goodsBogies) {
            bogie.assignCargo(cargo); // 🔥 UC15 logic inside this method
        }
    }

    // Getter
    public List<GoodsBogie> getGoodsBogies() {
        return goodsBogies;
    }
}