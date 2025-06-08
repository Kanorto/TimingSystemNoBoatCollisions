package com.frosthex.timingsystem.noboatcollisions;

import me.makkuusen.timing.system.boat.BoatSpawner;
import org.bukkit.Location;
import org.bukkit.entity.Boat;

public interface BoatSpawnerExtention extends BoatSpawner {
    public Boat spawnBoat(Location location, String woodType, Boolean chestBoat);
}
