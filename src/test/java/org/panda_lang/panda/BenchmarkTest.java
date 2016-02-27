package org.panda_lang.panda;

import org.panda_lang.panda.core.syntax.block.MethodBlock;

import java.io.File;

public class BenchmarkTest {

    private static final File SCRIPT = new File("benchmark.sp");
    private static final File DIRECTORY = new File("examples");

    public static void main(String[] args) {
        Panda panda = new Panda();
        panda.initializeDefaultElements();
        PandaScript pandaScript = panda.getPandaLoader().loadSingleScript(new File(DIRECTORY + File.separator + SCRIPT));
        pandaScript.setWorkingDirectory("/");

        long initTime = System.nanoTime();
        pandaScript.call(MethodBlock.class, "main");
        benchmark(initTime, 10000);
    }

    public static void mainx(String[] args) {
        long initTime = System.nanoTime();

        for(int i = 0; i < 200000; i++) {
            int var = 10;
            System.out.println(var);
        }

        benchmark(initTime, 200000);
    }

    public static void benchmark(long initTime, int times) {
        long nsTime = System.nanoTime() - initTime;
        double msTime = nsTime / 1000000.0;
        double secTime = msTime / 1000.0;

        long averageTime = nsTime/times;
        double averageMsTime = averageTime / 1000000.0;
        double averageSecTime = averageMsTime / 1000.0;

        System.out.println("Benchmark:");
        System.out.println("    Full: " + nsTime + "ns -> " + msTime + "ms -> " + secTime + " seconds");
        System.out.println("    Average: " + averageTime + "ns -> " + averageMsTime + "ms -> " + averageSecTime + " seconds");
    }

}
