package com.javase.designpatterns.builder;

/**
 * @author: Admin
 * @create: 2020/8/21 23:37
 */
public interface AirShipBuilder {
    OrbitalModule builderOrbitalModule();
    Engine builderEngine();
    EscapeTower builderEscapeTower();
}
