package xyz.riftwings.mc.plugin

import org.bukkit.Material
import org.bukkit.NamespacedKey
import org.bukkit.inventory.FurnaceRecipe
import org.bukkit.inventory.ItemStack
import org.bukkit.plugin.java.JavaPlugin

class RiftwingsPlugin : JavaPlugin() {

    private val key = NamespacedKey(this, "riftwings_mc")
    private val stack = ItemStack(Material.LEATHER)
    private val leatherRecipe = FurnaceRecipe(key, stack, Material.ROTTEN_FLESH, 2.0f, 200)

    override fun onEnable() {
        super.onEnable()
        server.addRecipe(leatherRecipe)
    }

    /*override fun onDisable() {
        super.onDisable()
    }*/


}