package krashgmbh.gdtogi;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.FurnaceExtractEvent;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class GDtoGI extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getServer().addRecipe(getGDtoGIRecipe());
    }

    private FurnaceRecipe getGDtoGIRecipe() {
        ItemStack item = new ItemStack(Material.GLOW_INK_SAC);
        NamespacedKey key = new NamespacedKey(this, "GD_to_GI");
        FurnaceRecipe recipe = new FurnaceRecipe(key, item, Material.GLOWSTONE_DUST, 0.1f, 200);
        return recipe;
    }

    @EventHandler
    public void onFurnaceExtract(FurnaceExtractEvent event) {
        if (event.getItemType() == Material.GLOW_INK_SAC) {
            event.setExpToDrop(10); // Set the amount of XP to drop
        }
    }
}
