package it.trekkete.amcharts.components.series;

import it.trekkete.amcharts.components.axis.Axis;

public class ColumnSeries extends Series {

    public ColumnSeries() {
        super();
    }

    public ColumnSeries(Axis xAxis, Axis yAxis) {
        super(xAxis, yAxis);
    }

    @Override
    public String getType() {
        return "ColumnSeries";
    }
}
