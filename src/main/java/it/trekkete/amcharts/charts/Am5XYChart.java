package it.trekkete.amcharts.charts;

import it.trekkete.amcharts.Am5;

public class Am5XYChart extends Am5Chart {

    @Override
    public String getType() {
        return "XYChart";
    }

    @Override
    protected String getLibrary() {
        return Am5.Library.XY;
    }
}
