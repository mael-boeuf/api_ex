package aia.api_ex.controller;

import aia.api_ex.model.Vol;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VolsDB {

    private static List<Vol> vols = new ArrayList<Vol>();

    static {
        vols.add(new Vol("SXB123", "Strasbourg", "Paris", 1250));
        vols.add(new Vol("SXB127", "Strasbourg", "Paris", 1420));
        vols.add(new Vol("CDC129", "Poitiers", "Paris", 1710));
    }

    public VolsDB() {

    }

    public static List<Vol> getVols() {
        return vols;
    }

    public static Optional<Vol> getVolById(String id) {
        return VolsDB.getVols().stream().filter(current -> current.getId().equals(id)).findFirst();
    }

}
