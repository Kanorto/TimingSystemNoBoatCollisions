package com.frosthex.timingsystem.noboatcollisions.nms_1_21_4;

import com.frosthex.timingsystem.noboatcollisions.NMSHandler;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.Items;
import org.apache.commons.lang.NotImplementedException;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_21_R3.CraftWorld;
import org.bukkit.craftbukkit.v1_21_R3.entity.CraftBoat;
import org.bukkit.craftbukkit.v1_21_R3.entity.boat.*;

import java.util.Objects;

public class NMSHandlerImpl implements NMSHandler {

    private String boatType = "OAK_BOAT"; // Default

    @Override
    public void setBoatType(String boatType) {
        this.boatType = boatType.toUpperCase();
    }

    @Override
    public org.bukkit.entity.Boat spawnBoat(Location location) {
        ServerLevel level = ((CraftWorld) location.getWorld()).getHandle();
        CraftBoat boat;

        switch (boatType) {
            case "OAK_BOAT":
                boat = new CraftOakBoat(level.getCraftServer(), new CollisionlessBoat(net.minecraft.world.entity.EntityType.OAK_BOAT, level, () -> Items.AIR));
                break;
            case "SPRUCE_BOAT":
                boat = new CraftSpruceBoat(level.getCraftServer(), new CollisionlessBoat(net.minecraft.world.entity.EntityType.SPRUCE_BOAT, level, () -> Items.AIR));
                break;
            case "BIRCH_BOAT":
                boat = new CraftBirchBoat(level.getCraftServer(), new CollisionlessBoat(net.minecraft.world.entity.EntityType.BIRCH_BOAT, level, () -> Items.AIR));
                break;
            case "JUNGLE_BOAT":
                boat = new CraftJungleBoat(level.getCraftServer(), new CollisionlessBoat(net.minecraft.world.entity.EntityType.JUNGLE_BOAT, level, () -> Items.AIR));
                break;
            case "ACACIA_BOAT":
                boat = new CraftAcaciaBoat(level.getCraftServer(), new CollisionlessBoat(net.minecraft.world.entity.EntityType.ACACIA_BOAT, level, () -> Items.AIR));
                break;
            case "DARK_OAK_BOAT":
                boat = new CraftDarkOakBoat(level.getCraftServer(), new CollisionlessBoat(net.minecraft.world.entity.EntityType.DARK_OAK_BOAT, level, () -> Items.AIR));
                break;
            case "MANGROVE_BOAT":
                boat = new CraftMangroveBoat(level.getCraftServer(), new CollisionlessBoat(net.minecraft.world.entity.EntityType.MANGROVE_BOAT, level, () -> Items.AIR));
                break;
            case "CHERRY_BOAT":
                boat = new CraftCherryBoat(level.getCraftServer(), new CollisionlessBoat(net.minecraft.world.entity.EntityType.CHERRY_BOAT, level, () -> Items.AIR));
                break;
            case "BAMBOO_RAFT":
                boat = new CraftBambooRaft(level.getCraftServer(), new CollisionlessRaft(net.minecraft.world.entity.EntityType.BAMBOO_RAFT, level, () -> Items.AIR));
                break;

            case "OAK_CHEST_BOAT":
                boat = new CraftOakChestBoat(level.getCraftServer(), new CollisionlessChestBoat(net.minecraft.world.entity.EntityType.OAK_CHEST_BOAT, level, () -> Items.AIR));
                break;
            case "SPRUCE_CHEST_BOAT":
                boat = new CraftSpruceChestBoat(level.getCraftServer(), new CollisionlessChestBoat(net.minecraft.world.entity.EntityType.SPRUCE_CHEST_BOAT, level, () -> Items.AIR));
                break;
            case "BIRCH_CHEST_BOAT":
                boat = new CraftBirchChestBoat(level.getCraftServer(), new CollisionlessChestBoat(net.minecraft.world.entity.EntityType.BIRCH_CHEST_BOAT, level, () -> Items.AIR));
                break;
            case "JUNGLE_CHEST_BOAT":
                boat = new CraftJungleChestBoat(level.getCraftServer(), new CollisionlessChestBoat(net.minecraft.world.entity.EntityType.JUNGLE_CHEST_BOAT, level, () -> Items.AIR));
                break;
            case "ACACIA_CHEST_BOAT":
                boat = new CraftAcaciaChestBoat(level.getCraftServer(), new CollisionlessChestBoat(net.minecraft.world.entity.EntityType.ACACIA_CHEST_BOAT, level, () -> Items.AIR));
                break;
            case "DARK_OAK_CHEST_BOAT":
                boat = new CraftDarkOakChestBoat(level.getCraftServer(), new CollisionlessChestBoat(net.minecraft.world.entity.EntityType.DARK_OAK_CHEST_BOAT, level, () -> Items.AIR));
                break;
            case "MANGROVE_CHEST_BOAT":
                boat = new CraftMangroveChestBoat(level.getCraftServer(), new CollisionlessChestBoat(net.minecraft.world.entity.EntityType.MANGROVE_CHEST_BOAT, level, () -> Items.AIR));
                break;
            case "CHERRY_CHEST_BOAT":
                boat = new CraftCherryChestBoat(level.getCraftServer(), new CollisionlessChestBoat(net.minecraft.world.entity.EntityType.CHERRY_CHEST_BOAT, level, () -> Items.AIR));
                break;
            case "BAMBOO_CHEST_RAFT":
                boat = new CraftBambooChestRaft(level.getCraftServer(), new CollisionlessChestRaft(net.minecraft.world.entity.EntityType.BAMBOO_CHEST_RAFT, level, () -> Items.AIR));
                break;

            default:
                // Fallback to oak boat
                boat = new CraftOakBoat(level.getCraftServer(), new CollisionlessBoat(net.minecraft.world.entity.EntityType.OAK_BOAT, level, () -> Items.AIR));
                break;
        }

        return boat;
    }

    @Override
    public org.bukkit.entity.ChestBoat spawnChestBoat(Location location) {
        throw new NotImplementedException();
    }
}
