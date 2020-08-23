package com.javase.designpatterns.builder;

/**
 * @author: Admin
 * @create: 2020/8/21 23:47
 */
public class MyAirShipDirector implements AirShipDirector {

    private AirShipBuilder builder;

    public MyAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip directAirShip() {
        Engine engine = builder.builderEngine();
        EscapeTower escapeTower = builder.builderEscapeTower();
        OrbitalModule orbitalModule = builder.builderOrbitalModule();

        //装配飞船
        AirShip ship = new AirShip();
        ship.setEngine(engine);
        ship.setEscapeTower(escapeTower);
        ship.setOrbitalModule(orbitalModule);

        return ship;
    }
}
