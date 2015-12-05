package org.pandalang.panda.lang.ui;

import org.pandalang.panda.core.scheme.MethodScheme;
import org.pandalang.panda.core.scheme.ObjectScheme;
import org.pandalang.panda.core.syntax.IExecutable;
import org.pandalang.panda.core.syntax.Parameter;
import org.pandalang.panda.lang.PNumber;
import org.pandalang.panda.lang.PObject;

import javax.swing.*;

public class PWindow extends PObject {

    static {
        // Register object
        ObjectScheme os = new ObjectScheme(PWindow.class, "Window");
        // Method: display
        os.registerMethod(new MethodScheme("display", new IExecutable() {
            @Override
            public PObject run(Parameter instance, Parameter... parameters) {
                PWindow win = instance.getValue(PWindow.class);
                win.getFrame().setVisible(true);
                return null;
            }
        }));
        // Method: setSize
        os.registerMethod(new MethodScheme("setSize", new IExecutable() {
            @Override
            public PObject run(Parameter instance, Parameter... parameters) {
                PWindow win = instance.getValue(PWindow.class);
                int width = parameters[0].getValue(PNumber.class).getNumber().intValue();
                int height = parameters[1].getValue(PNumber.class).getNumber().intValue();
                win.getFrame().setSize(width, height);
                return null;
            }
        }));
    }

    private final JFrame frame;

    public PWindow() {
        this.frame = new JFrame();
    }

    public final JFrame getFrame() {
        return this.frame;
    }

    @Override
    public String toString() {
        return frame.toString();
    }

}