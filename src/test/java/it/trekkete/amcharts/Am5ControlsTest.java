package it.trekkete.amcharts;

import it.trekkete.amcharts.components.controls.*;
import org.junit.Assert;
import org.junit.Test;

public class Am5ControlsTest {

    @Test
    public void testCursor() {

        Cursor cursor = new XYCursor();

        Assert.assertEquals("XYCursor", cursor.getCursorType());

        String result =
                "chart.set(\"cursor\", am5xy.XYCursor.new(root, {\n" +
                "  \n" +
                "}));";

        Assert.assertEquals(result, cursor.render());
    }

    @Test
    public void testLegend() {

        Legend legend = new Legend();

        String result = "var " + legend.getEscapedName() + " = chart.children.push(am5.Legend.new(root, {\n" +
                        "  \n" +
                        "}));\n" +
                        legend.getEscapedName() + ".data.setAll(chart.series.values);";

        Assert.assertEquals(result, legend.render());
    }

    @Test
    public void testScrollbar() {

        Scrollbar scrollbar = new Scrollbar(Scrollbar.Orientation.HORIZONTAL);

        Assert.assertEquals("Scrollbar", scrollbar.getType());

        XYChartScrollbar xyChartScrollbar = new XYChartScrollbar(Scrollbar.Orientation.HORIZONTAL);

        Assert.assertEquals("XYChartScrollbar", xyChartScrollbar.getType());

        Assert.assertEquals(Scrollbar.Orientation.HORIZONTAL, xyChartScrollbar.getOrientation());

        xyChartScrollbar.setHeight(100);

        String result =
                "var " + xyChartScrollbar.getEscapedName() + " = am5.XYChartScrollbar.new(root, {\n" +
                "  orientation: \"horizontal\",\n" +
                "  height: 100\n" +
                "});";

        Assert.assertEquals(result, xyChartScrollbar.render());


    }
}