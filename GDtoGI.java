package krashgmbh.gdtogi;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class GDtoGI extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().addRecipe(getGDtoGIRecipe());
    }

    private FurnaceRecipe getGDtoGIRecipe() {
        ItemStack item = new ItemStack(Material.GLOW_INK_SAC);
        NamespacedKey key = new NamespacedKey(this, "GD_to_GI");
        FurnaceRecipe recipe = new FurnaceRecipe(key, item, Material.GLOWSTONE_DUST, 0.1f, 200);
        return recipe;
    }
}
