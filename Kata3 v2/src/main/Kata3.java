package main;

public class Kata3 {
    
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.com");
        histogram.increment("yahoo.es");
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("alu.ulpgc.es");
        histogram.increment("outlook.es");
        histogram.increment("ulpgc.es");
        histogram.increment("yahoo.es");
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.es");
        
        new HistogramDisplay(histogram).execute();
    }
}
