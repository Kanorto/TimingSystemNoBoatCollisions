package com.frosthex.timingsystem.noboatcollisions.nms_1_21_4;

import com.frosthex.timingsystem.noboatcollisions.NMSHandler;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.Items;
import org.apache.commons.lang.NotImplementedException;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_21_R3.CraftWorld;
import org.bukkit.craftbukkit.v1_21_R3.entity.CraftBoat;
import org.bukkit.craftbukkit.v1_21_R3.entity.boat.*;
import org.bukkit.event.entity.CreatureSpawnEvent;

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
                CollisionlessBoat oakBoat = new CollisionlessBoat(net.minecraft.world.entity.EntityType.OAK_BOAT, level, () -> Items.AIR);
                level.addFreshEntity(oakBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftOakBoat(level.getCraftServer(), oakBoat);
                break;
            case "SPRUCE_BOAT":
                CollisionlessBoat spruceBoat = new CollisionlessBoat(net.minecraft.world.entity.EntityType.SPRUCE_BOAT, level, () -> Items.AIR);
                level.addFreshEntity(spruceBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftSpruceBoat(level.getCraftServer(), spruceBoat);
                break;
            case "BIRCH_BOAT":
                CollisionlessBoat birchBoat = new CollisionlessBoat(net.minecraft.world.entity.EntityType.BIRCH_BOAT, level, () -> Items.AIR);
                level.addFreshEntity(birchBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftBirchBoat(level.getCraftServer(), birchBoat);
                break;
            case "JUNGLE_BOAT":
                CollisionlessBoat jungleBoat = new CollisionlessBoat(net.minecraft.world.entity.EntityType.JUNGLE_BOAT, level, () -> Items.AIR);
                level.addFreshEntity(jungleBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftJungleBoat(level.getCraftServer(), jungleBoat);
                break;
            case "ACACIA_BOAT":
                CollisionlessBoat acaciaBoat = new CollisionlessBoat(net.minecraft.world.entity.EntityType.ACACIA_BOAT, level, () -> Items.AIR);
                level.addFreshEntity(acaciaBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftAcaciaBoat(level.getCraftServer(), acaciaBoat);
                break;
            case "DARK_OAK_BOAT":
                CollisionlessBoat darkOakBoat = new CollisionlessBoat(net.minecraft.world.entity.EntityType.DARK_OAK_BOAT, level, () -> Items.AIR);
                level.addFreshEntity(darkOakBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftDarkOakBoat(level.getCraftServer(), darkOakBoat);
                break;
            case "MANGROVE_BOAT":
                CollisionlessBoat mangroveBoat = new CollisionlessBoat(net.minecraft.world.entity.EntityType.MANGROVE_BOAT, level, () -> Items.AIR);
                level.addFreshEntity(mangroveBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftMangroveBoat(level.getCraftServer(), mangroveBoat);
                break;
            case "CHERRY_BOAT":
                CollisionlessBoat cherryBoat = new CollisionlessBoat(net.minecraft.world.entity.EntityType.CHERRY_BOAT, level, () -> Items.AIR);
                level.addFreshEntity(cherryBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftCherryBoat(level.getCraftServer(), cherryBoat);
                break;
            case "BAMBOO_RAFT":
                CollisionlessRaft bambooRaft = new CollisionlessRaft(net.minecraft.world.entity.EntityType.BAMBOO_RAFT, level, () -> Items.AIR);
                level.addFreshEntity(bambooRaft, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftBambooRaft(level.getCraftServer(), bambooRaft);
                break;
            case "OAK_CHEST_BOAT":
                CollisionlessChestBoat oakChestBoat = new CollisionlessChestBoat(net.minecraft.world.entity.EntityType.OAK_CHEST_BOAT, level, () -> Items.AIR);
                level.addFreshEntity(oakChestBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftOakChestBoat(level.getCraftServer(), oakChestBoat);
                break;
            case "SPRUCE_CHEST_BOAT":
                CollisionlessChestBoat spruceChestBoat = new CollisionlessChestBoat(net.minecraft.world.entity.EntityType.SPRUCE_CHEST_BOAT, level, () -> Items.AIR);
                level.addFreshEntity(spruceChestBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftSpruceChestBoat(level.getCraftServer(), spruceChestBoat);
                break;
            case "BIRCH_CHEST_BOAT":
                CollisionlessChestBoat birchChestBoat = new CollisionlessChestBoat(net.minecraft.world.entity.EntityType.BIRCH_CHEST_BOAT, level, () -> Items.AIR);
                level.addFreshEntity(birchChestBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftBirchChestBoat(level.getCraftServer(), birchChestBoat);
                break;
            case "JUNGLE_CHEST_BOAT":
                CollisionlessChestBoat jungleChestBoat = new CollisionlessChestBoat(net.minecraft.world.entity.EntityType.JUNGLE_CHEST_BOAT, level, () -> Items.AIR);
                level.addFreshEntity(jungleChestBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftJungleChestBoat(level.getCraftServer(), jungleChestBoat);
                break;
            case "ACACIA_CHEST_BOAT":
                CollisionlessChestBoat acaciaChestBoat = new CollisionlessChestBoat(net.minecraft.world.entity.EntityType.ACACIA_CHEST_BOAT, level, () -> Items.AIR);
                level.addFreshEntity(acaciaChestBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftAcaciaChestBoat(level.getCraftServer(), acaciaChestBoat);
                break;
            case "DARK_OAK_CHEST_BOAT":
                CollisionlessChestBoat darkOakChestBoat = new CollisionlessChestBoat(net.minecraft.world.entity.EntityType.DARK_OAK_CHEST_BOAT, level, () -> Items.AIR);
                level.addFreshEntity(darkOakChestBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftDarkOakChestBoat(level.getCraftServer(), darkOakChestBoat);
                break;
            case "MANGROVE_CHEST_BOAT":
                CollisionlessChestBoat mangroveChestBoat = new CollisionlessChestBoat(net.minecraft.world.entity.EntityType.MANGROVE_CHEST_BOAT, level, () -> Items.AIR);
                level.addFreshEntity(mangroveChestBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftMangroveChestBoat(level.getCraftServer(), mangroveChestBoat);
                break;
            case "CHERRY_CHEST_BOAT":
                CollisionlessChestBoat cherryChestBoat = new CollisionlessChestBoat(net.minecraft.world.entity.EntityType.CHERRY_CHEST_BOAT, level, () -> Items.AIR);
                level.addFreshEntity(cherryChestBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftCherryChestBoat(level.getCraftServer(), cherryChestBoat);
                break;
            case "BAMBOO_CHEST_RAFT":
                CollisionlessChestRaft bambooChestRaft = new CollisionlessChestRaft(net.minecraft.world.entity.EntityType.BAMBOO_CHEST_RAFT, level, () -> Items.AIR);
                level.addFreshEntity(bambooChestRaft, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftBambooChestRaft(level.getCraftServer(), bambooChestRaft);
                break;

            default:
                // Fallback to oak boat
                CollisionlessBoat defaultColBoat = new CollisionlessBoat(net.minecraft.world.entity.EntityType.OAK_BOAT, level, () -> Items.AIR);
                level.addFreshEntity(defaultColBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftOakBoat(level.getCraftServer(), defaultColBoat);
                break;
        }

        return boat;
    }

    @Override
    public org.bukkit.entity.ChestBoat spawnChestBoat(Location location) {
        throw new NotImplementedException();
    }
}
