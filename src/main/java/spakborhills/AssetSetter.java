package spakborhills;

import spakborhills.entity.*;
import spakborhills.object.*;

public class AssetSetter {
    GamePanel gp;

    public AssetSetter(GamePanel gp){
        this.gp = gp;
    }
    public void setObject(){
        Entity door1 = new OBJ_Door(gp); // Buat instance dan simpan di variabel lokal
        door1.worldX = gp.tileSize * 25;    // Atur koordinat X
        door1.worldY = gp.tileSize * 15;    // Atur koordinat Y
        gp.entities.add(door1);                  // Tambahkan objek yang sudah dikonfigurasi ke daftar gp.obj

        // Contoh menempatkan sebuah kunci
        Entity key1 = new OBJ_Key(gp);
        key1.worldX = gp.tileSize * 23;
        key1.worldY = gp.tileSize * 40;
        gp.entities.add(key1);

        // Contoh menempatkan peti
        Entity chest1 = new OBJ_Chest(gp);
        chest1.worldX = gp.tileSize * 22;
        chest1.worldY = gp.tileSize * 30;
        gp.entities.add(chest1);

    }

    public void setNPC(){
        // Buat instance NPC dan LANGSUNG atur propertinya sebelum menambahkannya ke daftar
        Entity abigail = new NPC_ABIGAIL(gp);
        abigail.worldX = gp.tileSize * 21;   // Atur X untuk npcGirl
        abigail.worldY = gp.tileSize * 21;   // Atur Y untuk npcGirl
        gp.entities.add(abigail);

        gp.entities.add(abigail);
        Entity caroline = new NPC_CAROLINE(gp);
        caroline.worldX = gp.tileSize * 21;
        caroline.worldY = gp.tileSize * 21;
        gp.entities.add(caroline);

        Entity dasco = new NPC_DASCO(gp);
        dasco.worldX = gp.tileSize * 21;
        dasco.worldY = gp.tileSize * 21;
        gp.entities.add(dasco);

        Entity emily = new NPC_EMILY(gp);
        emily.worldX = gp.tileSize * 21;
        emily.worldY = gp.tileSize * 21;
        gp.entities.add(emily);

        Entity mayorTadi = new NPC_MAYOR_TADI(gp);
        mayorTadi.worldX = gp.tileSize * 21;
        mayorTadi.worldY = gp.tileSize * 21;
        gp.entities.add(mayorTadi);
    }
}