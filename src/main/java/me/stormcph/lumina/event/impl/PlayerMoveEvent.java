package me.stormcph.lumina.event.impl;

import me.stormcph.lumina.event.Event;
import me.stormcph.lumina.mixinterface.IVec3d;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MovementType;
import net.minecraft.util.math.Vec3d;

import java.lang.reflect.Field;

public class PlayerMoveEvent extends Event {

    private final MovementType movementType;
    private Vec3d pos;

    public PlayerMoveEvent(MovementType movementType, Vec3d pos) {
        this.movementType = movementType;
        this.pos = pos;
    }

    public Vec3d getPos() {
        return pos;
    }

    public void setPos(Vec3d pos) {
        this.pos = pos;
    }

    public void set(double x, double y, double z) {
        ((IVec3d) pos).setX(x);
        ((IVec3d) pos).setY(y);
        ((IVec3d) pos).setZ(z);
    }

    public MovementType getMovementType() {
        return movementType;
    }
}
