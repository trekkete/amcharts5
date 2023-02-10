package it.trekkete.amcharts.component.series;

import it.trekkete.amcharts.component.axis.Axis;

public class SmoothedXLineSeries extends LineSeries{

    public SmoothedXLineSeries(Axis xAxis, Axis yAxis) {
        super(xAxis, yAxis);
    }

    @Override
    public String getType() {
        return "SmoothedXLineSeries";
    }
}
