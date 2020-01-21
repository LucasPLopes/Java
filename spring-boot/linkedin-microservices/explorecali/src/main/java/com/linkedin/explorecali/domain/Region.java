package com.linkedin.explorecali.domain;

public enum Region {
    CENTRAL_COAST("Central Coast"),//
    SOUTHERN_CALIFORNIA("Southern California"),//
    NORTHERN_CALIFORNIA("Northen California"),//
    VARIES("Varies");

    private String label;

    private Region(String label) {
        this.label = label;
    }

    public static Region findByLabel(String byLabel) {
        for (Region r : Region.values())
            if (r.label.equalsIgnoreCase(byLabel))
                return r;
        return null;
    }

}