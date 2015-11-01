package com.ourwork.tntnetworkslab.graph;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.Stroke;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.DefaultDrawingSupplier;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.util.ShapeUtilities;

/**
 *
 * @author Vasilis Naskos
 */
public class GraphMaker extends JFrame {

    private final Number[][] data;
    
    public GraphMaker(final String title, Number[][] data) {
        super(title);

        this.data = data;
        
        final XYDataset dataset = createDataset();
        final JFreeChart chart = createChart(dataset, title);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        setContentPane(chartPanel);
    }
    
    /**
     * Creates a sample dataset.
     *
     * @return a sample dataset.
     */
    private XYDataset createDataset() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        
        XYSeries series = new XYSeries("B");
        for(int j=0; j<data[0].length; j++) {
            series.add(data[0][j], data[1][j]);
        }
        dataset.addSeries(series);
        
        series = new XYSeries("Q");
        for(int j=0; j<data[0].length; j++) {
            series.add(data[0][j], data[2][j]);
        }
        dataset.addSeries(series);
        
        return dataset;
    }

    /**
     * Creates a chart.
     *
     * @param dataset the data for the chart.
     *
     * @return a chart.
     */
    private JFreeChart createChart(final XYDataset dataset, final String title) {

        // create the chart...
        final JFreeChart chart = ChartFactory.createXYLineChart(
                title, // chart title
                "X", // x axis label
                "Y", // y axis label
                dataset, // data
                PlotOrientation.VERTICAL,
                true, // include legend
                true, // tooltips
                false // urls
        );

        // NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...
        chart.setBackgroundPaint(Color.white);

//        final StandardLegend legend = (StandardLegend) chart.getLegend();
        //      legend.setDisplaySeriesShapes(true);
        // get a reference to the plot for further customisation...
        final XYPlot plot = chart.getXYPlot();
        
        
        
        plot.setDrawingSupplier(new DefaultDrawingSupplier() {
            Paint[] paints = new Paint[]{Color.BLUE, Color.RED};
            int i=0;
            
            @Override
            public Paint getNextPaint() {
                return paints[i++];
            }

            @Override
            public Shape getNextShape() {
                return ShapeUtilities.createDiamond(4f);
            }

            @Override
            public Stroke getNextStroke() {
                return new BasicStroke();
            }
        });
        
        plot.setBackgroundPaint(Color.lightGray);
        //    plot.setAxisOffset(new Spacer(Spacer.ABSOLUTE, 5.0, 5.0, 5.0, 5.0));
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);

        // change the auto tick unit selection to integer units only...
        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        // OPTIONAL CUSTOMISATION COMPLETED.

        return chart;

    }

}
