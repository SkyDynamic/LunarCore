package emu.lunarcore.game.gacha;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import dev.morphia.annotations.Indexed;
import emu.lunarcore.LunarCore;
import org.bson.types.ObjectId;

@Entity(value = "gachaDetails", useDiscriminator = false)
public class GachaDetail {
    @Id private ObjectId id;
    @Indexed private final int uid;
    private final int gacha_id;
    private final int gacha_type;
    private final int item_id;
    private final int count;
    private final long time;
    private final int item_type;
    private final int rank_type;

    public GachaDetail(int uid, int gacha_id, int gacha_type, int item_id, int count, long time, int item_type, int rank_type) {
        this.uid = uid;
        this.gacha_id = gacha_id;
        this.gacha_type = gacha_type;
        this.item_id = item_id;
        this.count = count;
        this.time = time;
        this.item_type = item_type;
        this.rank_type = rank_type;
    }

    // Database
    
    public static void get(long uid, int page, int size) {
        var obj = LunarCore.getGameDatabase().getObjectByUid(GachaDetail.class, uid);
        System.out.println(obj);
    }
    
    public void save() {
        LunarCore.getGameDatabase().save(this);
    }
    
}
